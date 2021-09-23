# Cartesian Line Length Calculator

## Problem Description

As a fan of geometry, I want to model a line based on points consisting of (x, y) coordinates using the cartesian
system. So that I can calculate its length.

## Pre-Requisite to Run The Program

- Have an IDE for Java installed (e.g. Netbeans, Intellij, Eclipse)
- JDK 11.0 or higher
  installed ([see this link for installation](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html))
- JUnit 5.0 or higher installed, for running the
  tests ([see this link for installation](https://junit.org/junit5/docs/current/user-guide/#overview-getting-started-junit-artifacts))

## How to Build The Program

- Open a terminal
- Change the working directory into the current project directory
- Execute `./gradlew build` in your terminal

## How to Run The Program

### How to Import to IntelliJ

https://www.jetbrains.com/help/idea/library.html

### Usage

```java
package com.company;

import com.minibootcamp.ada.Line;
import com.minibootcamp.ada.Point;

public class Main {

    public static void main(String[] args) {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(0, 0);

        Line line = new Line(firstPoint, secondPoint);
        System.out.print("line length from firstPoint and secondPoint is " + line.getLength());
    }
}
```

### CLI

```bash
line length from firstPoint and secondPoint is 0
```

## How to Run The Tests

- Open a terminal
- Change the working directory into the current project directory
- Execute `./gradlew test` in your terminal
