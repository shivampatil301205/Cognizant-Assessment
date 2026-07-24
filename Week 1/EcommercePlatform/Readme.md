# Cognizant Deep Skilling 

## Overview

This repository contains Java implementations of important software design concepts and application development projects. It includes:

1. Factory Method Design Pattern
2. Singleton Design Pattern
3. E-Commerce Platform Application

These projects demonstrate Object-Oriented Programming (OOP), Design Patterns, Collections Framework, and real-world application development using Java.

---

# Project Structure

```
Repository/
│
├── README.md
│
├── Factory Method Implementation/
│   └── FactoryMethod.java
│
├── Singleton Pattern Implementation/
│   └── Singleton.java
│
└── E-Commerce Platform/
    └── EcommercePlatform.java
```

---

# 1. Factory Method Pattern

## Objective

To create objects without exposing object creation logic to the client.

## Components

* Vehicle Interface
* Car Class
* Bike Class
* VehicleFactory Class
* FactoryMethod Class

## Description

The Factory Method Pattern provides a factory class responsible for creating objects. Instead of directly instantiating classes using the `new` keyword, clients request objects from the factory.

This pattern improves flexibility and reduces coupling between classes.

## Sample Output

```text
Car is manufactured.
Bike is manufactured.
```

## Benefits

* Encapsulates object creation logic
* Reduces dependency between classes
* Improves scalability
* Simplifies maintenance

---

# 2. Singleton Pattern

## Objective

To ensure only one instance of a class exists throughout the application.

## Components

* SingletonExa Class
* Singleton Class

## Description

The Singleton Pattern restricts class instantiation to a single object and provides global access through the `getInstance()` method.

A private constructor prevents direct object creation.

## Sample Output

```text
Singleton object created
true
```

The value `true` indicates both references point to the same object.

## Benefits

* Ensures a single instance
* Saves memory
* Provides centralized access
* Useful for logging and configuration management

---

# 3. E-Commerce Platform

## Objective

To simulate a basic online shopping system with product management, cart operations, order processing, inventory tracking, and sales analytics.

## Features

* Product catalog management
* Product search by name
* Product sorting by price and name
* Shopping cart management
* Order placement with stock validation
* Inventory management
* Order summary generation
* Top-selling product tracking using Priority Queue

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework

  * ArrayList
  * HashMap
  * HashSet
  * PriorityQueue
  * Comparator

## Classes

### Product

Stores:

* SKU
* Product Name
* Price
* Available Stock

### CartItem

Represents a product and quantity inside an order.

### Order

Stores:

* Order ID
* Purchased Products
* Total Order Amount

### EcommerceService

Handles:

* Catalog operations
* Product searching
* Product sorting
* Cart management
* Order processing
* Stock updates
* Top seller tracking

### EcommercePlatform

Main class used to demonstrate all functionalities.

## Functionalities Demonstrated

1. Add products to catalog
2. Display product catalog
3. Sort products by price
4. Search products by keyword
5. Add products to cart
6. View cart details
7. Place orders
8. Update inventory automatically
9. Display remaining stock
10. Show top-selling products

## Sample Workflow

* Create catalog
* Search products
* Add products to cart
* Review cart
* Place order
* Update stock
* View top-selling products

## Concepts Used

* Encapsulation
* Composition
* Collections Framework
* Sorting Algorithms
* Priority Queue
* Hash-Based Lookup
* Inventory Management
* Order Processing System

---

# Compilation and Execution

## Factory Method Pattern

```bash
javac FactoryMethod.java
java FactoryMethod
```

## Singleton Pattern

```bash
javac Singleton.java
java Singleton
```

## E-Commerce Platform

```bash
javac EcommercePlatform.java
java EcommercePlatform
```

---

# Learning Outcomes

After completing these projects, you will understand:

* Object-Oriented Programming Concepts
* Design Patterns (Factory Method & Singleton)
* Java Collections Framework
* Inventory Management Logic
* Order Processing Systems
* Data Structures for Real-World Applications
* Scalable Software Design Principles

---

# Technologies Used

* Java
* OOP Principles
* Design Patterns
* Collections Framework

---

# Author

Shivam Patil


Cognizant Deep Skilling Assessment
