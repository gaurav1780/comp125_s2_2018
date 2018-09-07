---
title: "I wish creating objects was easier (aka constructors)"
---

# I wish creating objects was easier (aka constructors)

Let’s say that the user wants to create a `Rectangle` whose `width` is 5
and `height` is 8. Following code achieves this,

```java
Rectangle r = new Rectangle();
r.width = 5;
r.height = 8;
```

However, it would be really nice if one could pass the values for the
instance variables in the instantiation statement itself, as,

```java
Rectangle r = new Rectangle(5, 8);
```

This is done through `constructors`.

## Constructors

-   A constructor is a method defined in the class.

-   A constructor must have the same name as the class.

-   A constructor has no return type (not even void).

-   There may be multiple constructors, each distinguished by its
    parameter list. Thus, we may have one constructor with no
    parameters, and another with one `int` parameter.

-   A suitable constructor is automatically called during instantiation
    based on number of parameters passed. If an appropriate constructor
    is not found, a compilation error is generated.

## Example - Constructors

```java
public class Rectangle {
    private double width, height;
    
    //getters and setters

    public Rectangle() { //default constructor
        setWidth(1);
        setHeight(1);
    }

    //parameterized constructor for a square
    public Rectangle(double side) { 
        setWidth(side);
        setHeight(side);
    }

    //parameterized constructor - generic
    public Rectangle(double w, double h) { 
        setWidth(w);
        setHeight(h);
    }
    //rest of the code
}
```

<div>&nbsp;</div>
![](./../fig/03-classes-and-objects/classesObjects1-figure7.png)
<div>&nbsp;</div>

## Constructors should call setters - always!

**Constructors should always use setters to assign values to instance
variables.**

## Default constructor

It should be noted that a default constructor (without any parameters)
is pre-defined for you by Java and that’s why you can instantiate
objects without defining it yourself.

```java
Rectange r = new Rectangle();
```

The default constructor assigns the default values for the appropriate
data types to the instance variables. However, once you define a
parameterized constructor, the built-in default constructor is taken
away by Java. Thus, if you want to construct an object with default
initial values for the instance variables, you need to re-define that!

## Defining the default constructor

Let’s say the default `Rectangle` instance should be of unit length. We
can define the default constructor as,

```java
public Rectangle() {
    setLength(1);
    setBreadth(1);
}
```

{: challenge}
> ## Add a default constructor to the class `Circle` that assigns the value 1.0 to instance variable `radius` (through the setter).
>> ## SOLUTION
 ```java
 //default constructor
 public Circle() {
     setRadius(1);
 }
 ```
>{: .solution}
{: .challenge}


{: challenge}
> ## Add a parameterized constructor to the class `Circle` that assigns the value of the parameter passed to instance variable `radius` (through the setter).
>> ## SOLUTION
 ```java
 //parameterized constructor
 public Circle(double r) {
     setRadius(r); //let setter handle the validation
 }
 ```
>{: .solution}
{: .challenge}
