# Spring Learn - Week 3 (Hands-on 1 & Hands-on 4)

## Author
**Shivam Patil**

## Project Overview
This repository contains the implementation of **Week 3 Spring Framework Hands-on exercises** from the DeepSkilling program. The project demonstrates the fundamentals of Spring Boot and Spring Core, including creating REST APIs, XML-based bean configuration, dependency injection, and bean management.

## Hands-on Included

### Hands-on 1 – Spring Boot REST Application

#### Objective
Develop a basic Spring Boot web application and expose a REST endpoint.

#### Features
- Spring Boot project created using Maven
- Spring Web dependency configuration
- REST Controller implementation
- Simple GET endpoint
- Embedded Tomcat server
- Application executed on port 8080

#### Technologies Used
- Java 17
- Spring Boot 3.x
- Spring Web
- Maven
- Embedded Tomcat
- VS Code

#### Output
```
Welcome to Spring Boot!
```

---

### Hands-on 4 – Spring Core: Load Country from Spring XML Configuration

#### Objective
Demonstrate Spring Core concepts by loading a bean from an XML configuration file and retrieving it using the Spring IoC Container.

#### Features
- XML-based bean configuration
- Country bean creation
- Property Injection
- Spring IoC Container
- ClassPathXmlApplicationContext
- Debug logging using SLF4J
- Bean retrieval using `context.getBean()`

#### Country Configured

| Code | Name |
|------|------|
| IN | India |

#### Files Added
- `Country.java`
- `country.xml`
- Updated `SpringLearnApplication.java`

#### Output
```
Inside Country Constructor.
Inside setCode()
Inside setName()
Country : Country [code=IN, name=India]
```

---

## Project Structure

```
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── spring_learn
│   │   │               ├── SpringLearnApplication.java
│   │   │               ├── Country.java
│   │   │               └── controller
│   │   │                   └── HelloController.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── country.xml
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## Spring Concepts Covered

### Hands-on 1
- Spring Boot
- REST Controller
- Request Mapping
- Embedded Tomcat
- Maven Project Structure

### Hands-on 4
- Spring Core
- Inversion of Control (IoC)
- Bean Configuration using XML
- Bean Lifecycle
- Dependency Injection (Setter Injection)
- ApplicationContext
- ClassPathXmlApplicationContext
- Bean Retrieval using `getBean()`
- Logging with SLF4J

---

## How to Run

### Clone the Repository

```bash
git clone <repository-url>
```

### Navigate to the Project

```bash
cd spring-learn
```

### Run the Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

The application starts on:

```
http://localhost:8080
```

---

## Learning Outcomes

By completing these hands-on exercises, the following concepts were implemented and understood:

- Spring Boot application setup
- REST API development
- Maven project management
- Spring Core fundamentals
- XML bean configuration
- Spring IoC Container
- Dependency Injection
- Bean creation and retrieval
- Logging using SLF4J
- Application execution using Spring Boot

---

## Developed By

**Shivam Patil**