# Mockito_Verify_Interaction

## 1. Project overview
This is a small Maven + Java 23 project that demonstrates **verifying interactions** using **Mockito** and **JUnit 5**. The key idea is: instead of checking return values, you verify that a dependency method was called the correct number of times.

## 2. Objective of the exercise
To verify that `MyService.fetchData()` calls `ExternalApi.getData()` **exactly once** using Mockito's `verify()`.

## 3. Folder structure
```text
Mockito_Verify_Interaction/
│
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               ├── ExternalApi.java
    │               └── MyService.java
    │
    └── test
        └── java
            └── com
                └── example
                    └── MyServiceTest.java
```

## 4. Software requirements
- Java 23 (JDK 23)
- Maven
- VS Code

## 5. How to open the project in VS Code
1. Open VS Code
2. File → Open Folder...
3. Select the folder: `Mockito_Verify_Interaction`

## 6. How to install dependencies using Maven
From the project root folder (`Mockito_Verify_Interaction/`):
```bash
mvn -U clean test -DskipTests=false
```

Maven will download dependencies such as JUnit 5 and Mockito automatically.

## 7. Commands to compile the project
```bash
mvn clean compile
```

## 8. Commands to run the tests
Run unit tests:
```bash
mvn test
```

Production-ready build (includes tests):
```bash
mvn clean install
```

## 9. Expected output
When tests pass, you should see something like:
```text
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

## 10. Explanation of Mockito verify()
Mockito `verify()` is used to confirm that certain interactions happened on a mock object.

In this project:
```java
verify(externalApi, times(1)).getData();
```
That means:
- Verify `getData()` was called
- Exactly **1** time

If `getData()` is called zero times or more than once, the test fails.

## 11. Explanation of each Java class
### `ExternalApi`
An interface representing an external dependency.
- Method: `String getData()`

### `MyService`
A service class that depends on `ExternalApi`.
- Uses **constructor injection** to receive the dependency
- Method: `fetchData()` calls `externalApi.getData()` and returns the result

### `MyServiceTest`
A JUnit 5 test class using Mockito.
- Creates a mock `ExternalApi`
- Injects it into `MyService`
- Calls `service.fetchData()`
- Verifies `externalApi.getData()` was called exactly once

## 12. Troubleshooting (common VS Code + Maven issues)
### A. Maven fails to download dependencies
- Make sure Maven is installed and `mvn -v` works in your terminal
- Run:
  ```bash
  mvn -U clean test
  ```

### B. JUnit tests not discovered
- Ensure the test file is under:
  `src/test/java/...`
- Ensure the test method is annotated with `@Test`

### C. Java version mismatch
- `pom.xml` is configured for **Java 23** using:
  ```xml
  <maven.compiler.release>23</maven.compiler.release>
  ```
- Verify you have JDK 23 installed and selected.

**Author:** Shivam Patil
**Deep Skilling Program**


