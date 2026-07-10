# Exercise 7: Implementing Constructor and Setter Injection (Spring XML)

## Objective
Build a complete **Java Spring Framework (non-Spring Boot) Maven project** that demonstrates **Constructor Injection** and **Setter Injection** using **XML configuration**.

## Scenario
A library management system needs to wire a `BookService` with a `libraryName` value and a `BookRepository` dependency. This exercise demonstrates how Spring IoC container performs dependency injection through XML.

## Features
- Constructor Injection for `libraryName`
- Setter Injection for `BookRepository`
- XML-based bean configuration
- Fully executable Maven project

## Technologies Used
- Java 8
- Spring Framework (Spring Context) with XML configuration
- Maven

## Maven Dependencies
- `org.springframework:spring-context`

## Project Structure
```
SCM_DependencyInjections/
├── pom.xml
├── README.md
└── src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           ├── BookRepository.java
        │           ├── BookService.java
        │           └── LibraryManagementApplication.java
        └── resources
            └── applicationContext.xml
```

## File Description
- **pom.xml**
  - Maven configuration
  - Spring dependencies
  - Compiler plugin
  - Exec plugin configured for `mvn exec:java`
- **applicationContext.xml**
  - Defines beans for `BookRepository` and `BookService`
  - Injects `libraryName` using constructor injection
  - Injects `bookRepository` using setter injection
- **BookRepository.java**
  - Provides `displayBook()` that prints: `Book information loaded successfully.`
- **BookService.java**
  - Holds fields `libraryName` and `bookRepository`
  - Constructor accepts `libraryName`
  - Setter injects `bookRepository`
  - `showBook()` prints library name and calls repository display method
- **LibraryManagementApplication.java**
  - Boots Spring container with `ClassPathXmlApplicationContext`
  - Retrieves `BookService` bean
  - Calls `showBook()` and closes context

## Constructor Injection Explanation
Constructor Injection provides required values (like `libraryName`) through the class constructor. In Spring XML, it is configured via a `<constructor-arg>` element.

## Setter Injection Explanation
Setter Injection provides optional or secondary dependencies (like `bookRepository`) through setter methods. In Spring XML, it is configured via a `<property>` element.

## How Dependency Injection Works
1. Spring loads `applicationContext.xml` from the classpath.
2. Spring creates bean instances in the dependency order.
3. Spring injects constructor arguments into `BookService`.
4. Spring injects `bookRepository` through the setter.
5. `LibraryManagementApplication` retrieves the fully wired `BookService` and runs `showBook()`.

## Prerequisites
- Java 8+
- Maven

## Installation Steps
1. Open `week 2/SCM_DependencyInjections` in VS Code.
2. Ensure Maven downloads dependencies.

## Build Instructions
Run:
- `mvn clean compile`

## Run Instructions
Run:
- `mvn exec:java`

## Expected Output
```
Library: Central Library
Book information loaded successfully.
```

## Learning Outcomes
- Understanding of Spring IoC container startup using XML
- Practical usage of constructor injection and setter injection
- Ability to wire beans using Spring XML configuration

## Conclusion
This exercise demonstrates how to configure Spring beans using XML and inject dependencies using both constructor and setter injection.

Author

Shivam Patil

