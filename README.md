# Week 1 - Cognizant Assessment (Design Patterns)

This folder contains Java implementations of **Creational Design Patterns** completed for Week 1.

## Contents
- [Factory Method Implementation](#factory-method-implementation)
- [Singleton Pattern Implementation](#singleton-pattern-implementation)




## Factory Method Implementation

This project demonstrates the **Factory Method Design Pattern** using a Coffee Shop example in Java.

### Overview

The Factory Method Pattern defines an interface for creating objects but allows subclasses (factories) to decide which class to instantiate. This promotes loose coupling and makes the code easier to extend and maintain.

### Project Structure

```
.
├── FactoryMethod.java
└── Readme.md
```

### Class Diagram

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

### Implementation (What’s included)

#### Coffee Interface

```java
interface Coffee {
    void brew();
}
```

#### Coffee Types

- Espresso
- Latte
- Cappuccino

Each coffee type implements the `Coffee` interface.

#### Factory Interface

```java
interface CoffeeFactory {
    Coffee createCoffee();
}
```

#### Concrete Factories

- EspressoFactory
- LatteFactory
- CappuccinoFactory

Each factory is responsible for creating its specific coffee object.

### How It Works

1. The client requests a coffee from a factory.
2. The factory creates and returns the appropriate coffee object.
3. The client uses the returned coffee object without knowing its concrete implementation.

### Benefits

- Promotes loose coupling.
- Follows the Open/Closed Principle.
- Simplifies object creation.
- Makes the application easier to extend.

### Real-World Applications

- Notification Systems (Email, SMS, Push Notifications)
- Database Drivers
- Payment Gateway Integrations
- Document Generators
- UI Component Libraries

### Design Pattern Category

**Creational Design Pattern**

The Factory Method Pattern belongs to the Creational Design Patterns family because it focuses on object creation mechanisms.

### Running the Project

From inside the folder `FactoryMethod Implementation/`:

#### Compile

```bash
javac FactoryMethod.java
```

#### Run

```bash
java FactoryMethod
```

#### Sample Output

```text
Brewing Espresso...
Brewing Latte...
Brewing Cappuccino...
```

---

## Singleton Pattern Implementation

This project demonstrates the implementation of the **Singleton Design Pattern** in Java. The Singleton pattern ensures that only one instance of a class is created throughout the application's lifecycle and provides a global access point to that instance.

### Overview

The Singleton pattern restricts instantiation of a class to one object and provides a global point of access to that instance.

### Features

- Lazy Initialization
- Private Constructor
- Single Global Instance
- Easy-to-understand Java implementation

### Project Structure

```
.
├── Singleton.java
└── Readme.md
```

### How It Works

1. The constructor is declared as `private` to prevent direct object creation.
2. A static variable stores the single instance of the class.
3. The `getInstance()` method creates the instance only when it is requested for the first time.
4. Subsequent calls return the same instance.

### Running the Project

From inside the folder `Singleton Pattern Implementation/`:

#### Compile

```bash
javac Singleton.java
```

#### Run

```bash
java Singleton
```

#### Sample Output

```text
Singleton object created
true
```

The output confirms that:
- The object is created only once.
- Both references point to the same object.

### Advantages of Singleton Pattern

- Controlled access to a single instance.
- Reduced memory usage.
- Global access point.
- Useful for logging, configuration management, caching, and database connections.

### Applications

- Database Connection Managers
- Configuration Settings
- Logging Frameworks
- Caching Systems
- Thread Pools

---

## Author

Shivam Patil

