# Week 2 - Configuring the Spring IoC Container (XML Configuration)

## Objective
Build a complete **Java Spring Framework (non-Spring Boot) Maven project** that demonstrates how to configure and use the **Spring IoC container** using **XML configuration**.

## Technologies Used
- Java 8
- Spring Framework (XML configuration)
- Maven

## Folder Structure
```
Week2/
│── pom.xml
│── README.md
└── src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           ├── BookRepository.java
        │           ├── BookService.java
        │           └── MainApp.java
        └── resources
            └── applicationContext.xml
```

## Prerequisites
- Java JDK 8+
- Maven

## Installation
1. Open this folder in VS Code.
2. Ensure Maven dependencies are downloaded:
   - Run: `mvn clean package`

## How to Run
Run the application using Maven:
- `mvn -q exec:java`

## Expected Output
```
Book information loaded successfully.
```

## Files Description
- `pom.xml`
  - Defines Maven dependencies for Spring and configures the build.
- `applicationContext.xml`
  - Defines the Spring beans for `BookRepository` and `BookService`.
  - Uses **setter injection** to inject `BookRepository` into `BookService`.
- `BookRepository.java`
  - Provides `displayBook()` which prints the required message.
- `BookService.java`
  - Holds a `BookRepository` instance.
  - Uses setter injection and calls `bookRepository.displayBook()` in `showBook()`.
- `MainApp.java`
  - Loads the Spring context using `ClassPathXmlApplicationContext`.
  - Retrieves the `bookService` bean, calls `showBook()`, and closes the context.

## Learning Outcome
- Understand Spring IoC container initialization using XML.
- Practice bean definition and wiring using setter injection.
- Learn how to bootstrap Spring from a standalone Java application.

Author

Shivam Patil

