# LibraryManagement Maven Project

## Project Title
LibraryManagement

## Objective
Create and configure a Maven project using Spring Framework dependencies and ensure it runs successfully in Visual Studio Code using Maven.

## Scenario
A Maven project is created for a simple Library Management application. The application prints confirmation messages to verify that Maven and Spring dependencies are correctly configured.

## Technologies Used
- Java 8 (JDK 1.8)
- Maven
- Spring Framework (Spring Context, Spring AOP, Spring WebMVC)

## Maven Dependencies
- `org.springframework:spring-context`
- `org.springframework:spring-aop`
- `org.springframework:spring-webmvc`

## Maven Plugins
- Maven Compiler Plugin
- Exec Maven Plugin

## Project Structure
- `src/main/java/com/library/LibraryManagementApplication.java`

## Folder Structure
```
Week 2/
└── SCM_MavenProject/
    ├── pom.xml
    ├── README.md
    └── src
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── library
        │   │           └── LibraryManagementApplication.java
        │   └── resources
        └── test
            └── java
```

## File Descriptions
- `pom.xml`
  - Declares Spring dependencies and configures Maven plugins.
- `LibraryManagementApplication.java`
  - Main class that prints the required output.

## Prerequisites
- JDK 8
- Maven
- Visual Studio Code

## Installation Steps
1. Open `Week 2/SCM_MavenProject` in VS Code.
2. Run `mvn clean compile` to download dependencies.

## Build Instructions
```bash
mvn clean compile
```

## Run Instructions
```bash
mvn exec:java
```

## Expected Output
```
Library Management Maven Project Configured Successfully.
Spring Dependencies Loaded Successfully.
```

## Learning Outcomes
- Maven project setup and dependency management.
- Compiler plugin configuration for Java 1.8.
- Exec plugin configuration to run a Java main class.

## Conclusion
A working Spring dependency Maven project that builds and runs immediately using Maven exec.

Author

Shivam Patil
