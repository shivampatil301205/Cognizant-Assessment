# Factory Method Pattern Implementation

## Overview

This project demonstrates the Factory Method Design Pattern in Java. The pattern provides an interface for creating objects while allowing subclasses or a factory class to decide which object to instantiate.

## Objective

To create different types of Vehicle objects without exposing the object creation logic to the client.

## File Structure

Factory Method Implementation/
│
├── FactoryMethod.java
└── README.md

## Classes Used

### Vehicle
An interface that defines the common method:

```java
void manufacture();
