import os
import subprocess

base_dir = os.path.dirname(os.path.abspath(__file__))
result = subprocess.run(["mvn", "test"], cwd=base_dir)
raise SystemExit(result.returncode)

