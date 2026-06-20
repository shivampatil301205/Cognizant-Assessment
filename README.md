# Cognizant Deep Skilling - Design Patterns

## Overview

This repository contains Java implementations of two commonly used Design Patterns:

1. Factory Method Pattern
2. Singleton Pattern

These patterns help improve code maintainability, scalability, and object creation management in software applications.

---

## Project Structure

week 1/
│
├── README.md
│
├── Factory Method Implementation/
│   ├── FactoryMethod.java
│   └── README.md
│
└── Singleton Pattern Implementation/
    ├── Singleton.java
    └── README.md

---

# 1. Factory Method Pattern

## Objective

To create objects without exposing the object creation logic to the client.

## Components

- Vehicle Interface
- Car Class
- Bike Class
- VehicleFactory Class
- FactoryMethod Class

## Description

The Factory Method Pattern provides a way to create objects through a factory class rather than directly instantiating them using the `new` keyword.

The client requests an object from the factory, and the factory decides which object to create and return.

## Output

```text
Car is manufactured.
Bike is manufactured.
```

## Benefits

- Encapsulates object creation logic
- Reduces coupling
- Improves maintainability
- Makes code scalable

---

# 2. Singleton Pattern

## Objective

To ensure that only one instance of a class is created throughout the application.

## Components

- SingletonExa Class
- Singleton Class

## Description

The Singleton Pattern restricts object creation to a single instance and provides a global access point through the `getInstance()` method.

The constructor is declared private so that objects cannot be created directly.

## Output

```text
Singleton object created
true
```

The value `true` indicates that both references point to the same object.

## Benefits

- Ensures a single instance
- Saves memory
- Provides global access
- Useful for configuration and logging classes

---

## Technologies Used

- Java
- Object-Oriented Programming
- Design Patterns

---

## Compilation and Execution

### Factory Method Pattern

```bash
javac FactoryMethod.java
java FactoryMethod
```

### Singleton Pattern

```bash
javac Singleton.java
java Singleton
```

---

## Author

Shivam Patil

Cognizant Deep Skilling Assessment
