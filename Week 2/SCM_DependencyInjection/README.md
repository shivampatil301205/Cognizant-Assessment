# LibraryManagement

## Objective
Implement Dependency Injection in a basic Spring Framework application using XML configuration (setter injection).

## Scenario
A simple Library Management example is created where Spring wires `BookService` with `BookRepository` using setter injection. The application loads the Spring IoC container, retrieves the `BookService` bean, and invokes a method that triggers repository logic.

## Technologies Used
- Java (Maven)
- Spring Framework (XML configuration)

## Maven Dependencies
- `org.springframework:spring-context`

## Folder Structure
```
Week 2/
└── SCM_DependencyInjection/
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
  - Boots the XML-based Spring container using `ClassPathXmlApplicationContext`.
  - Retrieves `bookService` and invokes the service method.
- `BookService.java`
  - Uses setter injection to receive `BookRepository`.
  - Executes business logic by calling repository methods.
- `BookRepository.java`
  - Provides repository logic.
- `applicationContext.xml`
  - Defines Spring beans for `BookRepository` and `BookService`.
  - Configures setter injection via `<property name="bookRepository" ref="bookRepository" />`.

## File Descriptions
- `pom.xml`
  - Maven configuration with Spring Context dependency.
  - Configures compiler plugin and exec plugin.
- `applicationContext.xml`
  - Spring XML bean definitions.

## Spring IoC Explanation
Spring IoC manages object creation and dependency wiring. In this project, Spring creates `BookRepository` and `BookService` as beans, then injects dependencies based on the XML configuration.

## Dependency Injection Explanation
Dependency Injection (DI) is the process of supplying dependencies from the outside rather than creating them inside the class. `BookService` receives its dependency (`BookRepository`) from Spring.

## Setter Injection Explanation
Setter injection uses a setter method to supply the dependency. Spring calls `setBookRepository(...)` when creating the `BookService` bean.

## XML Configuration Explanation
`applicationContext.xml` contains:
- A `bookRepository` bean definition.
- A `bookService` bean definition.
- Setter injection configuration using the `<property>` element.

## Build Instructions
From the project directory:
```bash
mvn clean compile
```

## Run Instructions
```bash
mvn exec:java
```

## Expected Output
```
Dependency Injection Successful.
BookRepository method executed successfully.
```

## Learning Outcomes
- Understand how Spring XML defines beans
- Practice setter-based dependency injection
- Learn how to bootstrap an XML-configured Spring container in Java

## Conclusion
This project demonstrates a working Spring IoC container with XML configuration and clearly shows dependency injection through setter wiring.

Author

Shivam Patil

