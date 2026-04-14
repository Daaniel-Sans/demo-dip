# Dependency Inversion Principle (DIP) Example in Java

## 📌 Project Overview

This project demonstrates the **Dependency Inversion Principle (DIP)**, one of the five SOLID principles in object-oriented programming.

The main objective is to show how software design improves when high-level modules depend on abstractions instead of concrete implementations.

To illustrate this, the project compares two versions of the same system:
- A **tightly coupled design (without DIP)**
- A **loosely coupled and flexible design (with DIP)**

The system simulates a simple lamp (`Lampara`) that can be powered by different energy sources such as a wall socket or a battery.

---

## 🧠 What is Dependency Inversion Principle?

The Dependency Inversion Principle states:

> High-level modules should not depend on low-level modules. Both should depend on abstractions.  
> Abstractions should not depend on details. Details should depend on abstractions.

In simpler terms:
- Code should depend on **interfaces or abstractions**, not concrete classes.
- This makes the system more flexible, reusable, and easier to maintain.

---

## 🔮 Future Improvements & Thoughts

This project is a basic demonstration of the Dependency Inversion Principle, but it can be extended in several ways to make it more realistic and closer to production-level software design.

### 🚀 Possible Improvements

- Add more energy sources (e.g., solar panel, generator, USB power)
- Introduce a factory pattern to manage object creation
- Implement unit tests to validate each energy source independently
- Expand the system to simulate multiple devices (not only a lamp)
- Add logging instead of simple console output
- Integrate the project into a small simulation or GUI application

---

### 💡 Design Reflections

This exercise highlights how important good architecture is in software development.

Even in a very small system, the difference between a tightly coupled and a loosely coupled design is significant.

Applying DIP results in:

- Better scalability when new features are added
- Easier maintenance and code readability
- Reduced risk of breaking existing functionality
- More professional and modular code structure

---

### 🧠 Final Thought

While the “without DIP” version still works correctly, it becomes difficult to maintain as the system grows.

On the other hand, the DIP-based version is designed to evolve over time, which is one of the key goals of clean software architecture.
