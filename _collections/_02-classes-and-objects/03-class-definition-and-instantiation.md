---
title: Defining class and creating objects
---
# Defining class and creating objects

## Defining classes


-   Each class is defined in a separate file with the same name and
    ending with `.java`

-   All Java class definitions are separate files in the same folder
    (for now).

## Adding instance variables

Instance variables can be declared as in the following two examples.
Note the `public` modifier (for now):

```java
 public int     instanceVar1;
 public String  instanceVar2;
```

## Defining methods

Method definitions have a heading and a method body

-   The *heading* defines the name of the method and other useful
    information.

-   The *body* defines the code to be executed when the method is
    called.

## Example - Defining a class

Defining a class: example Note that the above class definition merely
provides a template or blueprint for the class. No complete program
using this class has yet been written, and no object (instance) of this
class has yet been created.


![](./../fig/classesObjects1/classesObjects1-figure1.png)


[6][Define a class] Define a class for a Circle that is represented by
its radius.

```java
public class Circle {
    public double radius;
    /*
    * note that int is a wrong choice as radius 
    * CAN be a floating-point value like 1.5 or 2.4
    */
}
```
	 
## Declaration and instantiation

### Declaration

Declaration creates a *reference* in the memory, which doesn’t refer to
any storage space yet.

An object or instance of the new class type is declared in main as follows:

```java
ClassName  classVar; //declaration
Rectangle r; //example
```

![](./../fig/classesObjects1/classesObjects1-figure2.png)

### Instantiation

We perform the `instantiation` statement to allocate storage space for the instance variables of the object declared and to refer to that memory.
    
```java
classVar = new ClassName(); //instantiation
r = new Rectangle(); //example
```
	
![](./../fig/classesObjects1/classesObjects1-figure3.png)

### Combining declaration and instantiation

```java
ClassName classVar = new ClassName(); 
//declaration + instantiation

Rectangle r = new Rectangle(); //example
```

[4][Declare and Instantiate an object] Declare and instantiate an object
`myCircle` of class `Circle`

```java
public class Client {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
    }
}
```
	 
Although, you can just write the relevant part in written exams:

```java
Circle myCircle = new Circle();
```

## Adding method to a class

You can add methods inside the class that can be called on any
*instance* of the class.


![](./../fig/classesObjects1/classesObjects1-figure4.png)


## The dot (.) operator

The dot operator gives us access to the members (instance variables and
method) for an object. Think of it as the `apostrophe s (’s)` of the
human language (as in *"Gaurav’s class"* or *"Matt’s workshop"*)

```java
Rectangle r = new Rectangle(); //example
r.width = 5;
```

-   The expression `r` gives us access to the instance variable `width`
    of object `r`.

-   When a method is invoked on an object using the dot operator, it
    calls the method as defined in the class **in the context** of that
    object and any instance variables used in that method are the ones
    belonging to that object.


``` java
Rectangle r = new Rectangle(); 
r.width = 5;
r.height = 8;
System.out.println(r.area());
```

Here, `r.area()` returns `width * height` and since the method is called
on object `r`, it returns `r.width * r.height`. Had the method been
called on another object `s`, it would return `s.width * s.height`.

[5][Access instance variables and call methods] Write a piece of code
that sits outside the class definition and displays the radius of the
object `myCircle` and also its area.

```java
System.out.println(myCircle.getRadius());
System.out.println(myCircle.area());
```
	 
## Are there any default values?

-   Each <span>*instance variables*</span> is automatically initialised
    to the default value for its type when an object of the class is
    created.

-   For example, an instance variable of type `int` is given the default
    value 0;

-   And an instance variable of type `String` (or any class type) is
    given the default value `null`. (More about `null` later.)