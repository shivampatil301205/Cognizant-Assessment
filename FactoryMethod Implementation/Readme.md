# Factory Method Design Pattern in Java

## Overview

This project demonstrates the **Factory Method Design Pattern** using a Coffee Shop example in Java.

The Factory Method Pattern defines an interface for creating objects but allows subclasses (factories) to decide which class to instantiate. This promotes loose coupling and makes the code easier to extend and maintain.

## Project Structure

```
.
├── FactoryMethod.java
└── README.md
```

## Class Diagram

```
                +------------------+
                |      Coffee      |
                +------------------+
                | + brew()         |
                +------------------+
                         ^
                         |
        -------------------------------------
        |                |                 |
+---------------+ +---------------+ +---------------+
|   Espresso    | |     Latte     | |  Cappuccino   |
+---------------+ +---------------+ +---------------+
| + brew()      | | + brew()      | | + brew()      |
+---------------+ +---------------+ +---------------+

                +----------------------+
                |    CoffeeFactory     |
                +----------------------+
                | + createCoffee()     |
                +----------------------+
                           ^
                           |
        -------------------------------------------
        |                 |                       |
+----------------+ +----------------+ +--------------------+
|EspressoFactory | | LatteFactory   | | CappuccinoFactory  |
+----------------+ +----------------+ +--------------------+
|createCoffee()  | |createCoffee()  | |createCoffee()      |
+----------------+ +----------------+ +--------------------+
```

## Implementation

### Coffee Interface

```java
interface Coffee {
    void brew();
}
```

### Coffee Types

- Espresso
- Latte
- Cappuccino

Each coffee type implements the `Coffee` interface.

### Factory Interface

```java
interface CoffeeFactory {
    Coffee createCoffee();
}
```

### Concrete Factories

- EspressoFactory
- LatteFactory
- CappuccinoFactory

Each factory is responsible for creating a specific coffee object.

## How It Works

1. The client requests a coffee from a factory.
2. The factory creates and returns the appropriate coffee object.
3. The client uses the coffee object without knowing its concrete implementation.

## Benefits

- Promotes loose coupling.
- Follows the Open/Closed Principle.
- Simplifies object creation.
- Makes the application easier to extend.

## Running the Project

### Compile

```bash
javac FactoryMethod.java
```

### Run

```bash
java FactoryMethod
```

## Sample Output

```text
Brewing Espresso...
Brewing Latte...
Brewing Cappuccino...
```

## Real-World Applications

- Notification Systems (Email, SMS, Push Notifications)
- Database Drivers
- Payment Gateway Integrations
- Document Generators
- UI Component Libraries

## Design Pattern Category

**Creational Design Pattern**

The Factory Method Pattern belongs to the Creational Design Patterns family because it focuses on object creation mechanisms.

## Author

Shivam Patil