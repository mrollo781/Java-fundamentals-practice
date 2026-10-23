# Java Fundamentals Practice

This repository serves as a collection of smaller Java applications and logic exercises developed to reinforce core programming fundamentals, Object-Oriented design, and basic algorithms.

## Included Projects

### 1. Object-Oriented Clock Simulation (`ClockPractice/`)
A custom `Clock` class that demonstrates state management, encapsulation, and time manipulation.
* **Features:** 
  * Safely manages hour, minute, and second variables using strictly validated getter/setter methods.
  * Implements `tick()` and `advance()` methods to calculate time progression, correctly handling hour/minute rollover logic.
  * Includes a `display12H()` algorithm to dynamically format standard 24-hour time into AM/PM notation.

### 2. Terminal Dart Game (`DartGamePractice/`)
A command-line loop simulation of a 5-round dart game.
* **Features:** 
  * Utilizes `java.util.Random` for pseudo-random number generation.
  * Tracks and aggregates game state across iterative `for` loops.
  * Demonstrates proper separation of concerns via distinct methods for throwing logic and score display.

## How to Run
Clone this repository to your local machine. Each practice exercise is contained within its own package directory and includes a standard execution file (e.g., `ClockTester.java` or `DartGame.java`).
