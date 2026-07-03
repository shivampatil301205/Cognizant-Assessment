# Cognizant Deep Skilling Assessment

## Overview

This repository contains Java and MySQL implementations of software design patterns, algorithms, data structures, and database management projects completed as part of the Cognizant Deep Skilling Program.

The projects demonstrate Object-Oriented Programming (OOP), Design Patterns, Java Collections Framework, Algorithms, SQL, MySQL Control Structures, and Stored Procedures through practical real-world applications.

---

# Projects Included

1. Factory Method Design Pattern
2. Singleton Design Pattern
3. E-Commerce Platform
4. Financial Forecasting
5. PL/SQL Control Structures (MySQL Implementation)
6. Library Management System – Stored Procedures (MySQL)

---

# Project Structure

```text
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
├── E-Commerce Platform/
│   └── EcommercePlatform.java
│
├── Financial Forecasting/
│   └── FinancialForecasting.java
│
├── PLSQL Control Structures/
│   ├── ControlStructures.sql
│   └── README.md
│
└── PLSQL Stored Procedures/
    ├── LibraryManagement.sql
    └── README.md
```

---

# 1. Factory Method Design Pattern

## Objective

Create objects without exposing object creation logic to the client.

### Components

- Vehicle Interface
- Car Class
- Bike Class
- VehicleFactory Class
- FactoryMethod Class

### Description

The Factory Method Pattern delegates object creation to a factory class instead of directly instantiating objects using the `new` keyword. This improves flexibility, scalability, and maintainability.

### Sample Output

```text
Car is manufactured.
Bike is manufactured.
```

### Benefits

- Encapsulates object creation
- Reduces coupling
- Improves scalability
- Simplifies maintenance

---

# 2. Singleton Design Pattern

## Objective

Ensure only one instance of a class exists throughout the application.

### Components

- SingletonExa Class
- Singleton Class

### Description

The Singleton Pattern restricts object creation to a single instance and provides global access through the `getInstance()` method.

### Sample Output

```text
Singleton object created
true
```

### Benefits

- Single shared instance
- Memory efficient
- Centralized access
- Useful for logging and configuration management

---

# 3. E-Commerce Platform

## Objective

Develop a basic online shopping system supporting product management, shopping cart operations, inventory management, and order processing.

### Features

- Product catalog management
- Product search
- Product sorting
- Shopping cart management
- Order placement
- Inventory tracking
- Order summary generation
- Top-selling product analysis

### Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework

### Collections Used

- ArrayList
- HashMap
- HashSet
- PriorityQueue
- Comparator

### Main Classes

- Product
- CartItem
- Order
- EcommerceService
- EcommercePlatform

### Functionalities

- Add products
- Display catalog
- Search products
- Sort products
- Add products to cart
- View cart
- Place orders
- Update inventory
- Display remaining stock
- Show top-selling products

### Concepts Used

- Encapsulation
- Composition
- Java Collections Framework
- Sorting Algorithms
- Priority Queue
- Hash-Based Lookup
- Inventory Management
- Order Processing

---

# 4. Financial Forecasting

## Objective

Implement recursive, memoized, and iterative algorithms to forecast future investment value using a constant annual growth rate.

### Problem Statement

Calculate:

```text
Future Value = Present Value × (1 + Growth Rate)^Years
```

### Features

- Recursive forecasting
- Memoization using HashMap
- Iterative forecasting
- Algorithm comparison
- Time complexity analysis

### Algorithms

- Recursive
- Memoized
- Iterative

### Sample Input

```text
Initial Investment : 10000
Annual Growth Rate : 10%
Forecast Years     : 5
```

### Sample Output

```text
Recursive Forecast : 16105.10
Memoized Forecast  : 16105.10
Iterative Forecast : 16105.10
```

### Complexity

| Algorithm | Time | Space |
|-----------|------|-------|
| Recursive | O(n) | O(n) |
| Memoized | O(n) | O(n) |
| Iterative | O(n) | O(1) |

---

# 5. PL/SQL Control Structures (MySQL Implementation)

## Objective

Implement banking operations using MySQL to demonstrate SQL control structures, conditional updates, joins, and date-based calculations.

### Features

- Customer management
- Loan management
- Interest rate discount for senior citizens
- VIP customer promotion
- Loan payment reminders
- Date-based filtering

### Database Tables

#### Customers

- CustomerID
- Name
- DOB
- Balance
- IsVIP

#### Loans

- LoanID
- CustomerID
- LoanAmount
- InterestRate
- DueDate

### Operations Implemented

#### Scenario 1 – Interest Rate Discount

Applies a 1% discount to loan interest rates for customers older than 60 years.

#### Scenario 2 – VIP Promotion

Promotes customers with balances greater than ₹10,000 to VIP status.

#### Scenario 3 – Loan Payment Reminder

Displays reminders for loans due within the next 30 days.

### SQL Concepts Used

- CREATE TABLE
- INSERT INTO
- UPDATE
- SELECT
- INNER JOIN
- TIMESTAMPDIFF()
- CURDATE()
- DATE_ADD()
- DATE_FORMAT()
- CONCAT()

### Sample Output

```text
CustomerID  Name         Balance    IsVIP
1           John Doe      5000      FALSE
2           Jane Smith   12000      TRUE
3           Bob Johnson  15000      TRUE

LoanID   CustomerID   InterestRate
101      1            7.50
102      2            6.00
103      3            6.50

Reminder: Customer John Doe has loan 101 due on 2026-07-03
```

---

# 6. Library Management System – Stored Procedures (MySQL)

## Objective

Implement MySQL Stored Procedures to automate library inventory management, salary updates, and book issuing operations.

### Features

- Book inventory management
- Member management
- Librarian salary updates
- Automatic restocking
- Book issue management
- Parameterized stored procedures
- Conditional logic using IF statements

### Database Tables

#### Books

- BookID
- Title
- Author
- AvailableCopies
- LastUpdated

#### Members

- MemberID
- Name
- MembershipType
- FineAmount

#### Librarians

- LibrarianID
- Name
- Experience
- Salary

### Stored Procedures

#### RestockBooks()

- Restocks books with fewer than 5 copies.
- Updates inventory and last updated date.

#### IncreaseSalary()

- Updates librarian salaries based on experience.
- Accepts experience and bonus percentage as parameters.

#### IssueBook()

- Issues a book only if copies are available.
- Updates inventory after successful issue.

### SQL Concepts Used

- CREATE TABLE
- INSERT INTO
- UPDATE
- SELECT
- Stored Procedures
- Parameters
- DECLARE
- IF...ELSE
- CONCAT()
- CURDATE()
- DELIMITER

### Sample Output

```text
Books Restocked Successfully

Salary Updated Successfully

Book Issued Successfully to Member 1
```

---

# Compilation & Execution

## Java Projects

### Factory Method

```bash
javac FactoryMethod.java
java FactoryMethod
```

### Singleton Pattern

```bash
javac Singleton.java
java Singleton
```

### E-Commerce Platform

```bash
javac EcommercePlatform.java
java EcommercePlatform
```

### Financial Forecasting

```bash
javac FinancialForecasting.java
java FinancialForecasting
```

## MySQL Projects

### PL/SQL Control Structures

Execute:

```text
ControlStructures.sql
```

### Library Management System

Execute:

```text
LibraryManagement.sql
```

using MySQL Workbench or any MySQL Online Compiler.

---

# Technologies Used

## Java

- Java
- Object-Oriented Programming (OOP)
- Design Patterns
- Java Collections Framework
- Recursion
- Dynamic Programming (Memoization)
- Algorithms & Data Structures

## Database

- MySQL
- SQL
- Stored Procedures
- Conditional Statements
- Joins
- Date Functions
- Database Management

---

# Learning Outcomes

After completing these projects, you will understand:

- Object-Oriented Programming (OOP)
- Factory Method Design Pattern
- Singleton Design Pattern
- Java Collections Framework
- Recursion
- Dynamic Programming
- Algorithm Analysis
- Financial Forecasting
- Inventory Management Systems
- Order Processing Systems
- SQL Queries
- Joins
- MySQL Control Structures
- MySQL Stored Procedures
- Database Design
- Real-World Banking Applications
- Library Management Systems

---

# Author

**Shivam Patil**