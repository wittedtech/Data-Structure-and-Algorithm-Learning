# Java 8 Summary

## Table Structure:

| Feature                | Description                                                                                                                                                                       | Example Use Case                                                                                                                                                                 |
|------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Lambda Expressions     | Lightweight, anonymous functions that enable functional programming in Java.                                                                                                      | Sorting a list of strings: `Collections.sort(names, (a, b) -> a.compareTo(b));`                                                                                                 |
| Stream API             | A new abstraction to work with sequences of elements. It enables functional-style operations on streams of elements such as map-reduce transformations.                        | Filtering a list of integers: `List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());`                                            |
| Default Methods        | Allows adding new methods to interfaces without breaking the implementing classes.                                                                                               | Adding a new method to an existing interface: `default void newMethod() { // Method implementation }`                                                                           |
| Functional Interfaces | Interfaces with exactly one abstract method. They can be treated as lambda expressions and can provide target types in lambda expressions.                                       | `Consumer<T>`: Represents an operation that accepts a single input argument and returns no result.                                                                              |
| Method References      | Provides a way to refer to methods without invoking them. They can be used to make the code more readable by replacing lambda expressions with method references.                | `list.forEach(System.out::println);`                                                                                                                                              |
| Optional               | A container object that may or may not contain a non-null value. It helps to avoid null pointer exceptions by providing methods for dealing with null values more effectively. | `Optional<String> name = Optional.ofNullable(user.getName());`                                                                                                                  |
| Date and Time API      | A new API for handling dates and times that addresses the shortcomings of the old `java.util.Date` and `java.util.Calendar` classes.                                            | Parsing a date string: `LocalDate date = LocalDate.parse("2024-05-06");`                                                                                                          |
| CompletableFuture     | A `Future` that may be explicitly completed (setting its value and status), and may be used as a CompletionStage, supporting dependent functions and actions that trigger upon its completion. | Asynchronous processing: `CompletableFuture.supplyAsync(() -> getData()).thenAccept(result -> process(result));`                                                               |
| Nashorn JavaScript Engine | A lightweight, high-performance JavaScript engine that allows embedding JavaScript code within Java applications.                                                                 | Integrating JavaScript in Java applications: `ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");` `engine.eval("print('Hello, World!');");` |

## Theoretical Structure:

1. **Lambda Expressions:**
   - Provide a concise way to represent anonymous functions.
   - Enable functional programming in Java.
   - Syntax: `(parameters) -> expression` or `(parameters) -> { statements; }`

2. **Stream API:**
   - Introduces a new abstraction to work with sequences of elements.
   - Supports functional-style operations like map, filter, reduce, etc.
   - Enables parallel processing for improved performance.

3. **Default Methods:**
   - Allows adding new methods to interfaces without breaking existing implementation.
   - Helps in extending interfaces without forcing all implementing classes to implement the new methods.

4. **Functional Interfaces:**
   - Interfaces with exactly one abstract method.
   - Can be treated as lambda expressions.
   - Examples include `Consumer`, `Supplier`, `Predicate`, etc.

5. **Method References:**
   - Provide a way to refer to methods without invoking them.
   - Enhances code readability by replacing lambda expressions with method references.

6. **Optional:**
   - A container object that may or may not contain a non-null value.
   - Helps in avoiding null pointer exceptions.
   - Provides methods like `isPresent()`, `ifPresent()`, `orElse()`, etc.

7. **Date and Time API:**
   - Introduces a new API for handling dates and times.
   - Fixes the deficiencies of the old `java.util.Date` and `java.util.Calendar` classes.
   - Provides classes like `LocalDate`, `LocalTime`, `LocalDateTime`, etc.

8. **CompletableFuture:**
   - Represents a future result of an asynchronous computation.
   - Supports dependent functions and actions that trigger upon its completion.
   - Enhances concurrency and parallelism in Java applications.

9. **Nashorn JavaScript Engine:**
   - A lightweight JavaScript engine for Java applications.
   - Allows embedding JavaScript code within Java applications.
   - Facilitates interoperability between Java and JavaScript.
