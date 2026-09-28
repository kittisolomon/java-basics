# java-basics

A collection of standalone Java programs covering the fundamentals. Each topic lives in its own
`.java` file as a self-contained class, so examples can be run and studied independently.

## Table of contents

| Class | Topic |
| --- | --- |
| [`Syntax`](Syntax.java) | Class structure, `main` method, and console output |
| [`Variable`](Variable.java) | Variable types, `final` constants, and string concatenation |

## Setup

1. Install a JDK (Java Development Kit).
2. Confirm `javac` and `java` are on your `PATH`:

   ```bash
   java -version
   ```

## Running an example

Compile and run any class from the project root:

```bash
javac Syntax.java
java Syntax
```

Or compile everything and run one class at a time:

```bash
javac *.java
java Variable
```

To clean up the generated files:

```bash
rm *.class
```

## Adding a new topic

1. Create a new `.java` file. The file name must match the public class name.
2. Give it a `main` method so it can be run on its own.
3. Add a row to the table of contents above.
