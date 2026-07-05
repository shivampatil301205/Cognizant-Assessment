# JUnit Basic Testing (JUnit 4)



This project demonstrates basic unit testing using **JUnit 4** with a simple `Calculator` class.

## Project Structure

```text
JUnit_BasicTesting/
├── pom.xml
├── run.py
└── src/
    ├── main/java/com/example/Calculator.java
    └── test/java/com/example/CalculatorTest.java
```

## Files

- `Calculator.java`: Provides `add`, `subtract`, `multiply`, and `divide`.
- `CalculatorTest.java`: Demonstrates JUnit fixtures (`@Before`, `@After`) and assertions.

## How to Run

### Prerequisite
- Java JDK installed
- Maven installed (`mvn` available on PATH)

### Command
From this folder:


```bash
python run.py
```

This runs:

```bash
mvn -q clean test
```
Author: Shivam Patil

