# Homework 4 (Design Patterns like Singleton & Adapter)

## Overview

This project demonstrates two common design patterns in Java:

Singleton Pattern: Ensures only one instance of a class exists and provides a global access point.

Adapter Pattern: Enables integration of a legacy system by adapting its interface to match a new expected format.

## Part 1: Singleton Pattern - Configuration Manager

The Singleton Pattern restricts instantiation of a class to a single object and ensures controlled access to shared resources.

### Was done:

Lazy Initialization: The instance is created only when needed.

Thread Safety: Ensures only one instance is created in multi-threaded environments.

Global Access Point: Provides a static method to retrieve the instance.

### Usage Instructions

Open a terminal and navigate to your project directory.

Compile the Java files

Run:

ConfigManagerDemo

## Part 2: Adapter Pattern - Chat Service Adapter

The Adapter Pattern allows a system with an incompatible interface to work with existing components by wrapping and translating method calls.

### Was done:

Encapsulation: The adapter hides the details of the legacy system.

Loose Coupling: The new system interacts with a defined interface rather than the legacy class directly.

Code Reusability: The legacy system is integrated without modification.

### Usage Instructions

Open a terminal and navigate to your project directory.

Compile the Java files

Run:

ChatServiceDemo

## Conclusion

Both the Singleton and Adapter patterns help improve software design:

Singleton ensures only one instance of a class is created.

Adapter enables seamless integration of legacy components without altering their implementation.

By applying these patterns, we achieve better scalability, maintainability, and efficiency in software development.

This project created by second year student of Narxoz University, Akhmetova Aisha.
