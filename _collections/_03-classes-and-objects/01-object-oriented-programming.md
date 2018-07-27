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

## Why have classes?

The obvious question one must ask is - *Why do I need classes in the first place!?*.

To answer this, let's consider the following scenario -

### There are `N` players in my soccer team and we track the number of shots taken by each player during the season and number of goals scored. 

The variables for each player in this scenario will look something like this,

```java
String name;
int shots;
int goals;
```

Instead of handling the three attributes separately, if we had a representation for a `Player` that had attributes `name`, `shots`, `goals` inside it, that would make life easier as everything would be in one package. We can calculate the `successRate` of a player if and when required.

- We can say that `name`, `shots`, and `goals` are called the `instance variables`.
- Using `shots` and `goals`, we can calculate the `successRate` of the entity Player. 
- Here, `successRate` is called an `instance method` of the entity Player.

We use a UML class diagram to represent a class design. It has three compartments -

1. **Top compartment**: ClassName (begins with uppercase by convention, and are camelCased)
2. **Middle compartment**: Instance Variables (variable names begin with lowercase by convention, and are camelCased).
3. **Bottom compartment**: Instance Methods (method names begin with lowercase by convention, and are camelCased).

<div>&nbsp;</div>
![](./../fig/03-classes-and-objects/classDiagram.png)
<div>&nbsp;</div>

Thus, our `Player` class diagram looks like,

<div>&nbsp;</div>
![](./../fig/03-classes-and-objects/player.png)
<div>&nbsp;</div>

The reason we use `text`, `integer` and `real` as types (instead of `String`, `int` and `double` respectively) is because we don't want to tie the class diagram with one particular language.

Once we have the design of a class, we can create objects of that class. For example, I might have multiple players on my team:

1. Lionel Messi, Shots: 85, Goals: 27
2. Gonzalo Higuain, Shots: 153, Goals: 4
3. N'golo Kante, Shots: 7, Goals 1

We use a UML object diagram to represent a unique instance of the class. It has three compartments -

1. **Top compartment**: objectName:ClassName (begins with lowercase by convention, and are camelCased)
2. **Middle compartment**: Value of instance variables (variable names begin with lowercase by convention, and are camelCased).
3. **Bottom compartment**: empty (instance methods are applied when needed).

<div>&nbsp;</div>
![](./../fig/03-classes-and-objects/objectDiagram.png)
<div>&nbsp;</div>

Thus, the object diagrams for my objects are:

<div>&nbsp;</div>
![](./../fig/03-classes-and-objects/objectDiagrams.png)
<div>&nbsp;</div>

Similarly, a `CarTrip` entity can be described by two instance variables  - `distanceTravelled` and `timeTaken`. Using these we can compute `averageSpeed`. We say `averageSpeed` is an instance method of the attributes.

How about `DataPlan`? 

- Instance variables:
	- `allowance`
	- `monthlyUsageSoFar`
- Instance methods
	- `percentageAllowanceUsed`
	- `allowanceLeft`

{: challenge}
> ## What are the instance variables for a `Date` entity? As in the calendar Date. What are the instance methods of the entity? Draw the class diagram.
>> ## SOLUTION
>>> Instance variables: `day`, `month`, `year`.
>>> 
>>> Instance methods: `isLeapYear`, `daysLeftInYear`, ...
>>>> ![](./../fig/03-classes-and-objects/DateClassDiagram.png)
>{: .solution}
{: .challenge}

{: challenge}
> ## Draw the object diagram for an instance of Date entity that represents 19th April 2014
>> ## SOLUTION
>> 
>>> ![](./../fig/03-classes-and-objects/dateObjectDiagram.png)
>{: .solution}
{: .challenge}

{% comment %} 
## Classes and instances

Class definition specifies -

-   instance variables each instance (object) of the class will have

-   methods, including instance methods that are called on instances/
    objects and class methods or static methods that are called on the
    class directly without invoking objects.

![](./../fig/03-classes-and-objects/classesObjects1/classesObjects1-figure0.png)

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
{% endcomment %}
