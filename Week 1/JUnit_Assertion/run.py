import os
import subprocess
import urllib.request

PROJECT_DIR = os.path.dirname(os.path.abspath(__file__))
LIB_DIR = os.path.join(PROJECT_DIR, "lib")


def run(cmd, cwd=PROJECT_DIR):
    print(f"\n>> {cmd}")
    subprocess.check_call(cmd, shell=False, cwd=cwd)


def ensure_junit_jars():
    os.makedirs(LIB_DIR, exist_ok=True)

    junit_jar = os.path.join(LIB_DIR, "junit-4.13.2.jar")
    hamcrest_jar = os.path.join(LIB_DIR, "hamcrest-core-1.3.jar")

    junit_url = "https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar"
    hamcrest_url = "https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"

    if not os.path.exists(junit_jar):
        print(f"Downloading {junit_jar}...")
        urllib.request.urlretrieve(junit_url, junit_jar)

    if not os.path.exists(hamcrest_jar):
        print(f"Downloading {hamcrest_jar}...")
        urllib.request.urlretrieve(hamcrest_url, hamcrest_jar)

    return junit_jar, hamcrest_jar


def compile_with_javac():
    classes_dir = os.path.join(PROJECT_DIR, "target", "classes")
    test_classes_dir = os.path.join(PROJECT_DIR, "target", "test-classes")
    os.makedirs(classes_dir, exist_ok=True)
    os.makedirs(test_classes_dir, exist_ok=True)

    src_main = os.path.join(PROJECT_DIR, "src", "main", "java")
    src_test = os.path.join(PROJECT_DIR, "src", "test", "java")

    main_java_files = []
    test_java_files = []

    if os.path.isdir(src_main):
        for root, _, files in os.walk(src_main):
            for f in files:
                if f.endswith(".java"):
                    main_java_files.append(os.path.join(root, f))

    if os.path.isdir(src_test):
        for root, _, files in os.walk(src_test):
            for f in files:
                if f.endswith(".java"):
                    test_java_files.append(os.path.join(root, f))

    cp_jars = [
        os.path.join(LIB_DIR, "junit-4.13.2.jar"),
        os.path.join(LIB_DIR, "hamcrest-core-1.3.jar"),
    ]

    # Compile main (if any)
    if main_java_files:
        cmd_main = ["javac", "-d", classes_dir, *main_java_files]
        subprocess.check_call(cmd_main, cwd=PROJECT_DIR)

    # Compile tests (if any)
    if test_java_files:
        cp = os.pathsep.join([classes_dir, *cp_jars])
        cmd_test = ["javac", "-d", test_classes_dir, "-cp", cp, *test_java_files]
        subprocess.check_call(cmd_test, cwd=PROJECT_DIR)


if __name__ == "__main__":
    os.chdir(PROJECT_DIR)

    # If Maven exists, use it.
    mvn_ok = subprocess.call("command -v mvn >/dev/null 2>&1", shell=True) == 0
    if mvn_ok:
        run(["mvn", "-q", "clean", "test"])
        print("\nTests completed via Maven.")
        raise SystemExit(0)

    print("Maven not found. Running JUnit tests using locally downloaded jars + javac/java.")
    junit_jar, hamcrest_jar = ensure_junit_jars()

    compile_with_javac()

    # Run all tests in a simple known class (adjust if you add more tests)
    # For this folder: AssertionsTest is com.example.AssertionsTest.
    test_class = "com.example.AssertionsTest"

    classes_dir = os.path.join(PROJECT_DIR, "target", "classes")
    test_classes_dir = os.path.join(PROJECT_DIR, "target", "test-classes")

    cp = os.pathsep.join([test_classes_dir, classes_dir, junit_jar, hamcrest_jar])
    cmd = [
        "java",
        "-cp",
        cp,
        "org.junit.runner.JUnitCore",
        test_class,
    ]
    run(cmd)
    print("\nTests completed.")

