# LibraryManagement

## Objective
Configure and run a basic Spring Framework application using XML-based IoC container configuration.

## Scenario
Create a small Library Management example that demonstrates Spring bean configuration using XML. The application loads the Spring context, wires `BookService` with `BookRepository`, and executes a service method.

## Technologies Used
- Java (Maven)
- Spring Framework (XML configuration)

## Maven Dependencies
- `org.springframework:spring-context`

## Folder Structure
```
Week 2/
└── SCM_BasicSpringProject/
    ├── pom.xml
    ├── README.md
    └── src
        └── main
            ├── java
            │   └── com
            │       └── library
            │           ├── LibraryManagementApplication.java
            │           ├── service
            │           │   └── BookService.java
            │           └── repository
            │               └── BookRepository.java
            └── resources
                └── applicationContext.xml
```

## Project Structure
- `LibraryManagementApplication.java`
  - Bootstraps the Spring container using `ClassPathXmlApplicationContext`.
  - Retrieves `bookService` from the context and triggers the service flow.
- `BookService.java`
  - Receives `BookRepository` via setter injection.
  - Calls `BookRepository` to perform repository logic.
- `BookRepository.java`
  - Contains the repository logic used by `BookService`.
- `applicationContext.xml`
  - Defines Spring beans for `BookRepository` and `BookService`.
  - Wires the `bookRepository` property of `BookService`.

## File Descriptions
- `pom.xml`
  - Defines Maven project configuration, dependencies, compiler settings, and exec plugin.
- `applicationContext.xml`
  - Spring XML configuration defining the IoC container beans.
- Java sources under `src/main/java`
  - Implement repository/service classes and the application bootstrap class.

## Spring IoC Overview
Spring IoC (Inversion of Control) manages object creation and dependency wiring. In this project, Spring creates instances of `BookRepository` and `BookService` based on definitions in `applicationContext.xml`, then injects dependencies into `BookService`.

## XML Configuration Explanation
`applicationContext.xml` includes:
- A `bookRepository` bean of type `com.library.repository.BookRepository`
- A `bookService` bean of type `com.library.service.BookService`
- Setter injection using `<property name="bookRepository" ref="bookRepository" />`

## Build Instructions
Run from the project directory:

```bash
mvn clean compile
```

## Run Instructions
Run using Maven Exec Plugin:

```bash
mvn exec:java
```

## Expected Output
The console should show a successful context load and repository/service interaction, including:
- `Spring Context loaded successfully.`
- Repository output from `BookRepository`
- `BookService successfully called BookRepository.`

## Learning Outcomes
- Understand how Spring XML configuration defines beans
- Practice setter-based dependency injection
- Learn how to bootstrap an XML-based Spring context in a standalone Java application

## Conclusion
This project provides a working Maven + Spring (non-Boot) example that loads an XML-configured IoC container and demonstrates basic bean wiring and method execution.

Author

Shivam Patil

