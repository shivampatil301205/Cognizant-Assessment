# Logging Error Messages and Warning Levels (SLF4J + Logback)

## 1. Project Overview
This project is a small Java Maven application that demonstrates how to log **ERROR** and **WARN** messages using the **SLF4J** logging API, with **Logback** as the logging implementation.

Running the application prints log messages to the console, including timestamps and log levels.

## 2. Objective
To develop a Java application that logs:
- One **ERROR** message
- One **WARN** message

using SLF4J (`LoggerFactory`, `logger.error()`, `logger.warn()`).

## 3. Technologies Used
- **Java 23**
- **Maven**
- **SLF4J** (logging API)
- **Logback** (logging implementation)

## 4. Project Structure
```text
Logging_Error_Warning/
│
├── pom.xml
├── README.md
├── .gitignore
└── src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           └── LoggingExample.java
        └── resources
            └── logback.xml
```

## 5. Prerequisites
Before running:
- Java 23 installed
- Maven installed

## 6. How to install Java and Maven
### Java 23
- Download and install JDK 23 from a trusted provider (e.g., Adoptium).
- Make sure `java -version` works in your terminal.

### Maven
- Install Maven (if not already installed).
- Confirm with `mvn -v`.

## 7. How to open the project in VS Code
1. Open VS Code
2. Go to **File → Open Folder...**
3. Select the folder:
   - `week 1/Logging_Error_Warning/`

## 8. Required VS Code Extensions
Recommended:
- **Extension Pack for Java** (by Microsoft)
  - Gives language support and tooling.
- **Maven for Java** (optional, but helpful)

## 9. How to restore Maven dependencies
If dependencies are missing, reload them from the VS Code Maven panel, or run Maven from the project folder.


## 10. How to compile the project
Compile the project from inside `week 1/Logging_Error_Warning/` using Maven.


## 11. How to run the application
You can run using one of these methods.

### Option A (recommended): `exec:java`
Run the app using Maven’s exec plugin.

### Option B: build then run in VS Code
Build the project, then run `com.example.LoggingExample` from VS Code.

### Option C: run after packaging
Build/pack the project, then run the compiled output (exec-maven-plugin is simpler). 


## 12. Expected console output
Your output will look similar to this (timestamp will differ):
```text
2026-07-08 12:34:56.789 [main] ERROR com.example.LoggingExample - This is an ERROR message (something went wrong).
2026-07-08 12:34:56.790 [main] WARN  com.example.LoggingExample - This is a WARN message (a potential issue detected).
```

Important: The console output must include **timestamps** and **log levels** (ERROR/WARN).

## 13. Explanation of SLF4J
**SLF4J** (Simple Logging Facade for Java) is a logging **API**.
- It provides interfaces and helper classes like `Logger`.
- It does **not** do the actual logging by itself.
- A separate library (like Logback) provides the implementation.

This project uses:
- `slf4j-api` for the API
- `logback-classic` for the implementation

## 14. Explanation of Logback
**Logback** is a popular logging **implementation** for SLF4J.
- It reads configuration from `src/main/resources/logback.xml`.
- It controls where logs go (console, files, etc.).
- It controls formatting (pattern) and minimum log levels.

## 15. Explanation of LoggerFactory
`LoggerFactory` is used to create a logger instance.

Typical usage:
```java
Logger logger = LoggerFactory.getLogger(LoggingExample.class);
```

SLF4J uses the class type to set a meaningful logger name.

## 16. Explanation of logger.error()
`logger.error()` logs messages at **ERROR** level.
- ERROR indicates a serious problem.
- Example:
```java
logger.error("This is an ERROR message (something went wrong)." );
```

## 17. Explanation of logger.warn()
`logger.warn()` logs messages at **WARN** level.
- WARN indicates something unusual or potentially harmful.
- Example:
```java
logger.warn("This is a WARN message (a potential issue detected)." );
```

## 18. Explanation of every Java file
### `LoggingExample.java`
- Package: `com.example`
- Creates a static SLF4J `Logger`
- In `main()` it logs:
  1) one ERROR message
  2) one WARN message

## 19. Explanation of logback.xml
`logback.xml` configures Logback behavior:
- Defines a **ConsoleAppender** (writes to the terminal)
- Uses a **pattern** that includes:
  - timestamp
  - thread name
  - log level
  - logger name
  - message
- Sets the **root level** to `DEBUG` so both WARN and ERROR appear.

The appender pattern used:
```text
%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n
```

## 20. Common VS Code and Maven troubleshooting steps
### Dependency download problems
- Reload dependencies in the VS Code Maven view, then try again.

### `exec:java` not working
- Ensure the `mainClass` in `pom.xml` is `com.example.LoggingExample`.

### Java version mismatch
- Confirm you’re using Java 23 for both Maven and your IDE.


### Logs not showing timestamps/levels
- Ensure `src/main/resources/logback.xml` exists.
- Ensure `logback-classic` is included in `pom.xml`.

**Author:** Shivam Patil  
**Deep Skilling Program**