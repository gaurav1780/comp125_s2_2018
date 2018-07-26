---
title: Introduction to Object-Oriented Programming
---
# Introduction to Object-Oriented Programming

-   Classes are models of real world entities inside our programs.

-   Classes may have instance variables and methods. For example, a
    `Person` class can have a instance variable `name` of type `String`,
    and a method `eat()` of type `void`.

-   *OO Design* deals with designing the classes to solve a problem.

-   *OO Programming* deals with realising that design correctly.

## Classes and instances

Class definition specifies -

-   instance variables each instance (object) of the class will have

-   methods, including instance methods that are called on instances/
    objects and class methods or static methods that are called on the
    class directly without invoking objects.

![](./../fig/classesObjects1/classesObjects1-figure0.png)

## Example: Java’s String class

-   As we know `String` is a built in class for handling sequences of
    characters.

-   We can think of it as a Java type, just like `int`, `double`,
    `boolean`. (But String is a non-primitive type.)

-   Inside, it stores a sequence of characters (how, we don’t care right
    now).

-   The interface provides a number of operations on the character
    sequence.

### Example: String object

```java
String greeting = "Hello, World!";
System.out.println(greeting.length());
```

Here, `greeting` is an instance, or, object of `String` class. The
statement `String greeting = Hello, World!;` is called the
**instantiation** statement. The class has an instance method `length`
that is being invoked on object `greeting`

## Standard way of instantiatiation

```java
String lecturer1 = "Gaurav";
String lecturer2 = new String("Scott");
```

-   The two variables are different instances of the `String` class.

-   First is known as *lazy instantiation*, just for Strings.

-   Second (using `new`) is generally how we create instances. More
    information about this will come a bit later in this lecture ...