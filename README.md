# Singleton Design Pattern in Java

## Overview

This project demonstrates the implementation of the **Singleton Design Pattern** in Java. The Singleton pattern ensures that only one instance of a class is created throughout the application's lifecycle and provides a global access point to that instance.

## Features

- Lazy Initialization
- Private Constructor
- Single Global Instance
- Easy-to-understand Java implementation

## Project Structure

```
.
├── Singleton.java
└── README.md
```

## Implementation

```java
class SingletonExa {
    private static SingletonExa instance;

    private SingletonExa() {
        System.out.println("Singleton object created");
    }

    public static SingletonExa getInstance() {
        if (instance == null) {
            instance = new SingletonExa();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonExa s1 = SingletonExa.getInstance();
        SingletonExa s2 = SingletonExa.getInstance();

        System.out.println(s1 == s2);
    }
}
```

## How It Works

1. The constructor is declared as `private` to prevent direct object creation.
2. A static variable stores the single instance of the class.
3. The `getInstance()` method creates the instance only when it is requested for the first time.
4. Subsequent calls return the same instance.

## Prerequisites

- Java JDK 8 or higher
- VS Code (optional)
- Java Extension Pack for VS Code (optional)

## Running the Project

### Compile

```bash
javac Singleton.java
```

### Run

```bash
java Singleton
```

## Sample Output

```text
Singleton object created
true
```

The output confirms that:
- The object is created only once.
- Both references point to the same object.

## Advantages of Singleton Pattern

- Controlled access to a single instance.
- Reduced memory usage.
- Global access point.
- Useful for logging, configuration management, caching, and database connections.

## Applications

- Database Connection Managers
- Configuration Settings
- Logging Frameworks
- Caching Systems
- Thread Pools

## Author

Shivam Patil
