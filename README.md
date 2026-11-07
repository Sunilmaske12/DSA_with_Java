# Data Structures and Algorithms with Java

A collection of Java practice programs covering fundamental programming concepts, data structures, algorithms, and problem-solving exercises. The examples are organized by topic and are intended for learning and practice.

## Topics Covered

| Folder | Topics and examples |
|---|---|
| `arrays` | Linear search, binary search, array reversal, finding the largest element, pairs, subarrays, and sorting techniques. |
| `bitManipularion` | Bitwise operations, setting and clearing bits, counting set bits, binary/decimal conversion, power-of-two checks, and fast exponentiation. |
| `methods` | Methods, prime-number checks, palindrome checks, digit sums, averages, number conversion, and binomial coefficient practice. |
| `patterns` | Pattern-printing exercises, including butterfly, solid rhombus, and diamond patterns. |
| `recursion` | Factorial, Fibonacci, recursive array checks, first/last occurrence, powers, string duplicate removal, and the tiling problem. |
| `string` | Anagram checking, vowel counting, shortest-distance logic, string compression, and capitalization of words. |
| `two_D_Array` | Two-dimensional array operations, matrix sorting, spiral traversal, diagonal sums, and related exercises. |

## Technology

- Java 17
- Object-oriented and procedural Java fundamentals
- Eclipse IDE project structure

## Project Structure

```text
DSA_with_Java/
└── DSA/
    └── src/
        ├── arrays/
        ├── bitManipularion/
        ├── methods/
        ├── patterns/
        ├── recursion/
        ├── string/
        ├── two_D_Array/
        └── module-info.java
```

Each Java file generally contains a small, standalone example with a `main` method. Select the class for the topic you want to practice and run it independently.

## Getting Started

### Requirements

- JDK 17 or later
- An IDE such as Eclipse, IntelliJ IDEA, or Visual Studio Code (Java extensions)

### Run using Eclipse

1. Clone or download this repository.
2. In Eclipse, choose **File → Import → Existing Projects into Workspace**.
3. Select the `DSA` folder.
4. Make sure the project uses JDK 17 or a compatible later JDK.
5. Open a Java class under `src` and run its `main` method.

### Run an individual class from the command line

From the `DSA` directory, compile a class and run it using its package-qualified name. For example:

```bash
javac -d out src/arrays/BinarySearch.java
java -cp out arrays.BinarySearch
```

Replace `arrays/BinarySearch.java` and `arrays.BinarySearch` with the source file and class you want to run.

## Purpose

This repository is intended to support practice and revision of:

- Array traversal, searching, and sorting
- String manipulation
- Recursion and mathematical problem solving
- Bitwise operators and number representation
- Matrix and two-dimensional array operations
- Pattern printing and loop-based problem solving
- Breaking programs into reusable methods

## Notes

- These are practice examples, not a single integrated application.
- Some exercises may use fixed sample inputs in their `main` methods. Modify the inputs to experiment with different cases.
- Folder names are retained as they appear in the source project.

## Author

**Sunil Maske**

- GitHub: [Sunilmaske12](https://github.com/Sunilmaske12)
- LinkedIn: [Sunil Maske](https://www.linkedin.com/in/sunil-maske/)
- LeetCode: [maskesunil16](https://leetcode.com/u/maskesunil16/)
