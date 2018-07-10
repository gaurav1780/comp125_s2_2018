Introduction
============

Java is an object-oriented language. Classes and objects are one of the
key programming tools in Java. In this lecture we will cover some of the
basic concepts about classes and objects and how they are handled in
Java.

-  Designing a class

-  Adding instance variables

-	Adding instance methods

- 	Creating objects

- 	Why instance variables should be `private`

- 	Adding `getters` and `setters`

- 	Adding `constructors

-  `this` keyword

-  Comparing objects (`compareTo` method)

-   Unit testing methods of a class

-  `static` vs instance members

-   Manipulating references

- Array of objects

- Class containing array

- Array of objects of a class that contains an array


Object Oriented Programming – Brief Introduction
================================================

-   Classes are models of real world entities inside our programs.

-   Classes may have instance variables and methods. For example, a
    `Person` class can have a instance variable `name` of type `String`,
    and a method `eat()` of type `void`.

-   *OO Design* deals with designing the classes to solve a problem.

-   *OO Programming* deals with realising that design correctly.

Classes and instances
=====================

Class definition specifies -

-   instance variables each instance (object) of the class will have

-   methods, including instance methods that are called on instances/
    objects and class methods or static methods that are called on the
    class directly without invoking objects.

<p>
&nbsp;
<p>    

<img src="./../fig/classesObjects/classesObjects-ClassUMLDiagram.png" alt="Drawing" style="width: 400px;"/>

<p>
Example: Java’s String class
----------------------------

-   As we know `String` is a built in class for handling sequences of
    characters.

-   We can think of it as a Java type, just like `int`, `double`,
    `boolean`. (But String is a non-primitive type.)

-   Inside, it stores a sequence of characters (how, we don’t care right
    now).

-   The interface provides a number of operations on the character
    sequence.

Example: String object
----------------------

    String greeting = "Hello, World!";
    System.out.println(greeting.length());

Here, `greeting` is an instance, or, object of `String` class. The
statement `String greeting = Hello, World!;` is called the
**instantiation** statement. The class has an instance method `length`
that is being invoked on object `greeting`

Standard way of instantiatiation
--------------------------------

    String lecturer1 = "Gaurav";
    String lecturer2 = new String("Scott");

-   The two variables are different instances of the `String` class.

-   First is known as *lazy instantiation*, just for Strings.

-   Second (using `new`) is generally how we create instances. More
    information about this will come a bit later in this lecture ...

Class definition and instantiation
==================================

Defining classes
----------------

-   Each class is defined in a separate file with the same name and
    ending with `.java`

-   All Java class definitions are separate files in the same folder
    (for now).

Adding instance variables
-------------------------

Instance variables can be declared as in the following two examples.
Note the `public` modifier (for now):

     public int     instanceVar1;
     public String  instanceVar2;

Defining methods
----------------

Method definitions have a heading and a method body

-   The *heading* defines the name of the method and other useful
    information.

-   The *body* defines the code to be executed when the method is
    called.

Example - Defining a class
--------------------------

Defining a class: example Note that the above class definition merely
provides a template or blueprint for the class. No complete program
using this class has yet been written, and no object (instance) of this
class has yet been created.

<p>
&nbsp;
<p>

<span> + width : double\
+ height : double\
</span> <span> </span>

<p>
&nbsp;
<p>

[6][Define a class] Define a class for a Circle that is represented by
its radius.

    public class Circle {
        public double radius;
        /*
        * note that int is a wrong choice as radius 
        * CAN be a floating-point value like 1.5 or 2.4
        */
    }

Declaration and instantiation
-----------------------------

-   An object or instance of the new class type is declared in main as
    follows:

<!-- -->

    ClassName  classVar; //declaration
    Rectangle r; //example

<p>
&nbsp;
<p>

[scale=.5]

Declaration
-----------

Declaration creates a *reference* in the memory, which doesn’t refer to
any storage space yet.

Declaration and instantiation
-----------------------------

-   We perform the `instantiation` statement to allocate storage space
    for the instance variables of the object declared and to refer to
    that memory.

<!-- -->

    classVar = new ClassName(); //instantiation
    r = new Rectangle(); //example

<p>
&nbsp;
<p>

[scale=.5]

-   These can be combined:

        ClassName classVar = new ClassName(); 
        //declaration + instantiation

        Rectangle r = new Rectangle(); //example

[4][Declare and Instantiate an object] Declare and instantiate an object
`myCircle` of class `Circle`

    public class Client {
        public static void main(String[] args) {
            Circle myCircle = new Circle();
        }
    }

Although, you can just write the relevant part in written exams:

    Circle myCircle = new Circle();

Adding method to a class
------------------------

You can add methods inside the class that can be called on any
*instance* of the class.

<p>
&nbsp;
<p>

<span> + width : double\
+ height : double\
</span> <span> + area ( ) : double\
+ isSquare( ) : boolean\
</span>

<p>
&nbsp;
<p>

The dot (.) operator
--------------------

The dot operator gives us access to the members (instance variables and
method) for an object. Think of it as the `apostrophe s (’s)` of the
human language (as in *“Gaurav’s class”* or *“Matt’s workshop”*)

      Rectangle r = new Rectangle(); //example
      r.width = 5;
      

-   The expression `r` gives us access to the instance variable `width`
    of object `r`.

-   When a method is invoked on an object using the dot operator, it
    calls the method as defined in the class **in the context** of that
    object and any instance variables used in that method are the ones
    belonging to that object.

<!-- -->

      Rectangle r = new Rectangle(); 
      r.width = 5;
      r.height = 8;
      System.out.println(r.area());
      

<p>
&nbsp;
<p>

Here, `r.area()` returns `width * height` and since the method is called
on object `r`, it returns `r.width * r.height`. Had the method been
called on another object `s`, it would return `s.width * s.height`.

[5][Access instance variables and call methods] Write a piece of code
that sits outside the class definition and displays the radius of the
object `myCircle` and also its area.

    System.out.println(myCircle.getRadius());
    System.out.println(myCircle.area());

Are there any default values?
-----------------------------

-   Each <span>*instance variables*</span> is automatically initialised
    to the default value for its type when an object of the class is
    created.

-   For example, an instance variable of type `int` is given the default
    value 0;

-   And an instance variable of type `String` (or any class type) is
    given the default value `null`. (More about `null` later.)

Getters and setters
===================

Bad client, bad bad client!
---------------------------

Once the object is created, we can start operating on it.

``` {style="buggy"}
Rectangle r = new Rectangle();
@r.width = -5;@ // :o :O
r.height = 8;
System.out.println(r.area()); 
//displays -40 :'(
```

Changing visibility to private
------------------------------

<p>
&nbsp;
<p>

<span> - width : double\
- height : double\
</span> <span> + area ( ) : double\
+ isSquare ( ) : boolean\
</span>

<p>
&nbsp;
<p>

Now, the instance variables `width` and `height` are visible only within
the class definition.

How does one access (read/write) private instance variables
-----------------------------------------------------------

We access (read and write) private instance variables through public
methods called `getters` and `setters`.

-   `getters` return the value of the instance variable to the caller.

-   `setters` set the value supplied by the caller to the instance
    variables.

Setters must provide validation where applicable
------------------------------------------------

You can see that we validated the passed values before assigning to the
instance variable as `width = Math.abs(w)`. This is a typical case and
setters are in charge of validating data before assigning it to the
instance variables.

<p>
&nbsp;
<p>

<span> - width : double\
- height : double\
</span> <span> + getWidth ( ) : double\
+ getHeight ( ) : double\
+ setWidth ( width : double ) : void\
+ setHeight ( height : double ) : void\
+ area ( ) : double\
+ perimeter ( ) : double\
+ isSquare ( ) : boolean\
</span>

<p>
&nbsp;
<p>

[8][Add getters and setters] Add getters and setters to class `Circle`.
The setter should result in radius becoming zero if the parameter passed
is not positive.

    //setter
    public void setRadius(double r) {
        if(r < 0)
            radius = 0;
        else
            radius = r;
    }

    //getter
    public double getRadius() {
        return radius;
    }

[6][Write a client] Write a client (code sitting outside `Circle.java`,
for example, in the `main` method of another class) that performs the
following operations,

-   Declare and instantiate object `myCircle` of class `Circle` that has
    a radius of 1.8

-   Display radius of `myCircle`.

-   Increase radius of `myCircle` by 1.4

<!-- -->

    public class Client {
        public static void main(String[] args) {
            Circle myCircle = new Circle();
            myCircle.setRadius(1.8);
            System.out.println(myCircle.getRadius());
            myCircle.setRadius(myCircle.getRadius() + 1.4);
            /* or you can split it up as:
            * double current = myCircle.getRadius();
            * double updated = current + 1.4;
            * myCircle.setRadius(updated);
            */
        }
    }

I wish creating objects was easier
----------------------------------

Let’s say that the user wants to create a `Rectangle` whose `width` is 5
and `height` is 8. Following code achieves this,

    Rectangle r = new Rectangle();
    r.width = 5;
    r.height = 8;

However, it would be really nice if one could pass the values for the
instance variables in the instantiation statement itself, as,

    Rectangle r = new Rectangle(5, 8);

This is done through `constructors`.

Constructors
============

-   A constructor is a method defined in the class.

-   A constructor must have the same name as the class.

-   A constructor has no return type (not even void).

-   There may be multiple constructors, each distinguished by its
    parameter list. Thus, we may have one constructor with no
    parameters, and another with one `int` parameter.

-   A suitable constructor is automatically called during instantiation
    based on number of parameters passed. If an appropriate constructor
    is not found, a compilation error is generated.

Example - Constructor
---------------------

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

<p>
&nbsp;
<p>

<span> - width : double\
- height : double\
</span> <span> + getWidth ( ) : double\
+ getHeight ( ) : double\
+ setWidth ( width : double ) : void\
+ setHeight ( height : double ) : void\
+ Rectangle ( )\
+ Rectangle ( side : double )\
+ Rectangle ( w : double, h : double )\
+ area ( ) : double\
+ perimeter ( ) : double\
+ isSquare( ) : boolean\
</span>

<p>
&nbsp;
<p>

Constructors should call setters - always!
------------------------------------------

**Constructors should always use setters to assign values to instance
variables.**

Default constructor
-------------------

It should be noted that a default constructor (without any parameters)
is pre-defined for you by Java and that’s why you can instantiate
objects without defining it yourself.

    Rectange r = new Rectangle();

The default constructor assigns the default values for the appropriate
data types to the instance variables. However, once you define a
parameterized constructor, the built-in default constructor is taken
away by Java. Thus, if you want to construct an object with default
initial values for the instance variables, you need to re-define that!

Defining the default constructor
--------------------------------

Let’s say the default `Rectangle` instance should be of unit length. We
can define the default constructor as,

    public Rectangle() {
        setLength(1);
        setBreadth(1);
    }

[8][Add default and parameterized constructor] Add two constructors to
the class `Circle`.

1.  No parameters passed (default constructor): Assigns the value 1.0 to
    radius ... through the setter.

2.  Parameter passed for radius (parameterized constructor): Assigns the
    passed value to radius through the setter.

<!-- -->

    //default constructor
    public Circle() {
        setRadius(1);
    }

    //parameterized constructor
    public Circle(double r) {
        setRadius(r); //let setter handle the validation
    }

Displaying objects
==================

Often we need to display the details of an object. For example, we might
need to display name and age of a Person object, or the details of a
Time object in the format `hours:minutes:seconds`, or in our example,
`width` and `height` of a `Rectangle` object. It is quite inconvenient
to display these details as,

    Rectangle r = new Rectangle(5, 8);
    System.out.println(r.width+`` by ''+r.height);

We *could* add a method `display` in the class `Rectangle` as,

    public void display() {
        System.out.println(width+`` by ''+height);
    }

And call this method on required object as,

    Rectangle r = new Rectangle(5, 8);
    r.display();

Problem with the `display()` method
-----------------------------------

But this would only let us **display** the object details, and not send
to a file, or concatenate with any other output.

Java provides a standard way to return the String description of an
object using the `toString()` method (with return type `String`).

Default `toString()` behaviour
------------------------------

When you display an object, what Java displays is the outcome of the
<span>toString()</span> method on that object

    Rectangle r = new Rectangle(1, 3);
    System.out.println(r); //something like [I@70dea4e

Java saw that you want to display a `Rectangle` object and replaced it
by the `toString()` method operating on that object as,

    System.out.println(r);
    //became
    System.out.println(r.toString()); 

Over-riding `toString()` behaviour
----------------------------------

We can over-ride `toString()` method as required. For the `Rectangle`
class,

    public String toString() {
        return width+`` by ''+height;
    }

When we display an object, it invokes the method `toString()` and
displays the value it returns.

    Rectangle r = new Rectangle(5, 8);
    System.out.println(r);
    /*
    automatically invokes r.toString() 
    and displays the value returned
    */

[5][Define toString method] Define the `toString` method in the `Circle`
class such that it displays the object details in the following format -

    Circle radius: <radius>, area: <area>

In a separate client, create a Circle object with radius 1.6 and display
it on the console.

    public String toString() {
        String result = "Circle radius: "+radius+", area: "+area();
        return result;
    }   

Class containing an array
=========================

In this unit, we’ll extensively see classes containing arrays.

We must remember that both arrays and objects are references and refer
to the memory holding the actual data (in the case of array, it’s the
array items, and in the case of objects, it’s the instance variables).

Take the following as an example (instance variables are `public` for
simplicity),

    public class DynamicArray {
        public int[] data;
        public int nItems;
    }

The client is as follows,

    public class Client {
        public static void main(String[] args) {
            DynamicArray list = new DynamicArray();
        }
    }

At this stage, the memory state looks like,

<p>
&nbsp;
<p>

If we change the values of the instance variables as,

    public class Client {
        public static void main(String[] args) {
            DynamicArray list = new DynamicArray();
            list.data = new int[4];
            list.nItems = 0;
        }
    }

It now becomes,

<p>
&nbsp;
<p>

[scale=.5]

<p>
&nbsp;
<p>

Finally, we can modify the items of the array as,

    public class Client {
        public static void main(String[] args) {
            DynamicArray list = new DynamicArray();
            list.data = new int[4];
            list.data[0] = 5;
            list.data[1] = 12;
            list.nItems = 2;
        }
    }

This gives us, <p>
&nbsp;
<p>

[scale=.5]




`this` keyword
==============

Consider the following class definition,

``` {frame="single" style="buggy"}
public class Circle {
  private double @radius@;
  public void setRadius(double @radius@) {
    @radius@ = @Math.abs(radius)@;
  }
  //assume getter is also defined
}
```

Because the parameter and instance variable have the same name
(`radius`), it is not clear which one is affected in the assignment
statement on line 4 above. <p>
&nbsp;
<p> Java provides a keyword `this` that
refers to the calling object and gives access to its instance variables
and methods.

``` {frame="single" style="correct"}
public class Circle {
  private double @radius@;
  public void setRadius(double radius) {
    @this@.radius = Math.abs(radius);
  }
  //assume getter is also defined
}
  
```

Line 4 now shows that the instance variable `radius` on line 2 will be
affected by the assignment statement. As you can see, the `Math.abs`
method is using the parameter variable `radius`.

[6][Disambiguate assignment operation] Get rid of the ambiguity in the
`setSide` method

``` {frame="single" style="buggy"}
public class Square {
  private double side;
  public void setSide(double side) {
    side = Math.max(0, side);
  }
  //assume getter is also defined
}
```

    public class Square {
      private double side;
      public void setSide(double side) {
        @this.side@ = Math.max(0, side);
      }
      //assume getter is also defined
    }

Comparing objects (`compareTo` method)
======================================

The method `compareTo` provides a way to define an order on two objects
(say $a$ and $b$). The method is called on object $a$ and the object $b$
is passed as a parameter, the result indicating how $a$ compares to $b$.

You can access `private` instance members of the object passed inside a
method directly, as long as the object is of the same class as the one
the method is in.

Consider the following method in the `Circle` class,

    public class Circle {
        // other methods and instance members
        
        /* 
        comparison criterion: radius.
        return 1 if the calling object is ``more'' than other 
        -1 if its ``less''
         0 if they are ``equal'' 
         */
        public int compareTo(Circle other) {
            if(this.radius > other.radius)
              return 1;
            if(this.radius < other.radius)
              return -1;
            return 0; 
        }
      }
      

`compareTo` in action
---------------------

    Circle myCircle = new Circle(12);
      Circle yourCircle = new Circle(18);
      Circle ourCircle = new Circle(7);
      Circle theirCircle = new Circle(12);
      
      int s1 = myCircle.compareTo(yourCircle); //-1
      int s2 = myCircle.compareTo(ourCircle); //1
      int s3 = myCircle.compareTo(theirCircle); //0
      int s4 = theirCircle.compareTo(ourCircle); // ??
      int s5 = ourCircle.compareTo(yourCircle); // ??
      int s6 = yourCircle.compareTo(yourCircle); // ??
      

[6][Implement `compareTo` method] Add a `compareTo` method in class
Square that returns,

-   1 if calling object’s area is more than parameter object’s area

-   -1 if calling object’s area is less than parameter object’s area

-   0 if calling object’s area is equal to parameter object’s area

``` {frame="single" style="buggy"}
public class Square {
  private double side;
  //assume getter and setter
  public double area() {
    return side * side;
  }
}
```

    public int compareTo(Square other) {
        if(area() > other.area())
            return 1;
        if(area() < other.area())
            return -1;
        //in all other cases:
        return 0;
    }

Multi-criteria comparison
=========================

What happens if there are multiple levels of comparison criteria? For
example, if we compare two rectangles based on area, but they have the
same area, we then compare them on perimeter, and if even that’s the
same, return 0.

[7][Implement multi-criteria`compareTo` method] Add a `compareTo` method
in class `Rectangle` that returns,

-   1 if calling object’s area is more than parameter object’s area, or
    if they have the same area, but calling object’s perimeter is more
    than parameter object’s perimeter.

-   -1 if calling object’s area is less than parameter object’s area, or
    if they have the same area, but calling object’s perimeter is less
    than parameter object’s perimeter.

-   0 if calling object’s area is equal to parameter object’s area and
    calling object’s perimeter is equal to parameter object’s perimeter.

``` {frame="single" style="buggy"}
public class Rectangle {
  private double width, height;
  //assume getters and setters
  public double area() { return width * height; }
  public double perimeter() { return 2*(width + height); }
}
```

    public int compareTo(Rectangle other) {
        //first key comparison
        if(area() > other.area())
            return 1;
        if(area() < other.area())
            return -1;
        
        //second key comparison
        if(perimeter() > other.perimeter())
            return 1;
        if(perimeter() < other.perimeter())
            return -1;
        
        //still nothing?
        return 0;
    }

Unit testing methods of a class
===============================

An example class with a method that will not produce the expected result
in all situations.

``` {frame="single" style="buggy"}
public class Line {
  private int x1, y1, x2, y2;
  //other parts
  public double getMidX() {
    return x1+x2/2; //i know.
  }
}
  
```

JUnit testing
=============

JUnit provides a framework for testing individual methods. It works
based on following assertions:

1.  `assertEquals(expected double, double returned by method, tolerance)`:

    passes if,

        Math.abs(expected double - double returned by method) <= tolerance

2.  `assertEquals(expected integer, integer returned by method)`: passes
    if,

        expected integer == integer returned by method

3.  `assertTrue(boolean value)`: passes if parameter is `true`.

4.  `assertTrue(boolean value)`: passes if parameter is `false`.

5.  `assertNull(Object/array)`: passes if parameter is `null`.

6.  `assertNotNull(Object/array)`: passes if parameter is **NOT**
    `null`.

7.  More assertions can be found at:

    <http://junit.org/junit4/javadoc/latest/org/junit/Assert.html>

``` {style="junit"}

import static org.junit.Assert.*;
import org.junit.Test;
public class LineTest {
  @Test
  public void testGetMidX() {
    Line a = new Line(0, 10, 8, 12);
    assertEquals(4, a.getMidX(), 0.001); //passes
    Line b = new Line(5, 10, 6, 12);
    assertEquals(5.5, b.getMidX(), 0.001); //fails
}
```

### Corrected version by looking at JUnit failure

``` {frame="single" style="correct"}
public class Line {
  private int x1, y1, x2, y2;
  //other parts
  public double getMidX() {
    return @(x1+x2)/2.0@; 
  }
}
  
```

Static members vs. Instance members
===================================

Static members are the ones that are accessed in the context of a class.
You don’t need to create objects of that class in order to access them.
For example, consider the number of eyes **dinosaurs** have. Note, we
didn’t say, how many eyes does Dorothy the dinosaur, or Tyrone the
dinosaur have. <p>
&nbsp;
<p> We don’t even need any dinosaur to be alive to
answer that question, since it’s an attribute of the *collective* (the
class) rather than an *individual* (an object). <p>
&nbsp;
<p> On the other hand,
the variables `weight, height` are different for each dinosaur that was
there. Hence, they are *instance variables*. Similarly, the body mass
index (defined as weight divided by square of height) is an *instance
method*, that must be called on an *individual* (the object), not the
*collective* (the class) <p>
&nbsp;
<p> Consider the following class:

    class Dinosaur {
      public @static@ int nEyes = 2;
      public @static@ int nEars = 2;
      public @static@ double eyesToEarsRatio() {
        return nEyes * 1.0 / nEars;
      }
      
      private double weight, height;
      //assume getters, setters
      //assume parameterized constructors
      public double bodyMassIndex() {
        return weight/(height*height);
      }
    }

Static member access
--------------------

``` {style="buggy"}
int eyeCount = @Dinosaur@.nEyes;
double prop = @Dinosaur@.eyesToEarsRatio();
```

Instance member access
----------------------

``` {style="buggy"}
Dinosaur dorothy = new Dinosaur(450,3.6);
double w = @dorothy@.getWeight();
double h = @dorothy@.getHeight();
double bmi = @dorothy@.bodyMassIndex();
```

Note that in this example the instance variables are private, otherwise
(if they were public), they could be accessed in the same way (on a
calling object).

[5][Accessing static and instance members] Display the members
`data1, data2, method1, method2` of class `MyClass` (or object `obj` of
class `MyClass`) in the client code.

``` {frame="single" style="buggy"}
public class MyClass {
    public int data1;
    public static int data2;
    public static int method1() { return data2; }
    public int method2() { return data1; }
}

class Client {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        //your code 
    }
}
```

    //instance variable called on object
    System.out.println(obj.data1); 

    //static variable called on class
    System.out.println(MyClass.data2); 

    //static method called on class
    System.out.println(MyClass.method1()); 

    //instance method called on object 
    System.out.println(obj.method2()); 

Typical static methods
----------------------

Typically, methods are classified as static, if the values they operate
on are passed to the methods. For example:

    class StringService {
      public static char lastItem(String s) {
        if(s == null || s.length() == 0)
          return (char)0;
        return s.charAt(s.length() - 1);
      }
     }

    class IntegerService {
        public static int getNumberOfDigits(int num) {
            if(num == 0)
                return 0;
            // Remove any sign from number, 
            // add it to an empty string, 
            // return its length.
            return (Math.abs(num) + "").length();
        }
    }

Manipulating references
=======================

Shallow copy
------------

Consider the following class definition and client code:

      public class Circle {
        private double radius;
        //other parts
      }
      

    Circle c = new Circle(30);
      Circle d = c; 
      //c and d refer to same
      //instance variable space
      d.setRadius(50);
      System.out.println(c.getRadius()); //??
      

Object `d` holds reference to the same physical object as `c`.
Therefore, when the `radius` of object `d` is modified, `radius` of
object `c` also gets updated.

[scale=.5] (10.5, 10.5) – (14, 10.5); (10.5, 5.5) – (14, 10.5);

Let’s say, `c` changes to `null`.

[scale=.5] (10.5, 5.5) – (14, 10.5);

[5][Create a shallow copy] Create a shallow copy of `myObj` into
`yourObj`. Increase the radius of `yourObj` by 2. What is the new radius
of `myObj`?

    public class Circle {
        private double radius;
        //assume getters, setters 
        // and constructors defined
    }

    class Client {
        public static void main(String[] args) {
            Circle myObj = new Circle(1.5);
            //your code
        }
    }

    Circle yourObj = myObj; //shallow copy
    youObj.setRadius(yourObj.getRadius() + 2);
    System.out.println(myObj.getRadius()); //will be 3.5

Deep copy
---------

    Circle c = new Circle(30);
      Circle d = new Circle();
      d.setRadius(c.getRadius());
      //c's radius copied into d's radius
      System.out.println(c.getRadius()); //??
      

Object `d` is a clone of object `c`. Object `c` and `d` are independent
objects. Modifying one does not alter the other.

[scale=.5] (10.5, 10.5) – (14, 10.5);

(10.5, 5.5) – (14, 5.5); (19.5, 10) – (19.5, 6);

[3][Create a deep copy] Create a deep copy of `myObj` into `yourObj`.
Increase the radius of `yourObj` by 2. What is the new radius of
`myObj`?

``` {frame="single" style="buggy"}
public class Circle {
    private double radius;
    //assume getters, setters
    // and constructors defined
}

class Client {
    public static void main(String[] args) {
        Circle myObj = new Circle(1.5);
        //your code
    }
}
```

    //create a brand-spanking new object in memory
    Circle yourObj = new Circle(); 
    //get the value for radius from myObj
    yourObj.setRadius(myObj.getRadius());
    youObj.setRadius(yourObj.getRadius() + 2);
    System.out.println(myObj.getRadius()); //will still be 1.5

Copy constructor
----------------

      public class Circle {
        private double radius;
        //setters, getters
     
        public Circle(double radius) {
            setRadius(radius);
        }
        
        public Circle(Circle other) {
            setRadius(other.radius);
        }
      }
      

[5][Define a copy constructor] Define a copy constructor in class
`Rectangle`.

``` {frame="single" style="buggy"}
public class Rectangle {
    private double width, height;
    //assume getters, setters defined
    //define copy constructor here
}
```

    public Rectangle(Rectangle source) {
        setWidth(source.getWidth());
        setHeight(source.getHeight());
    }

### Copy constructor call

      Circle c = new Circle(30);
      Circle d = new Circle(c);
      

[5][Call a copy constructor] Deep copy `myObj` into `yourObj` using the
copy constructor defined in class `Square`.

``` {frame="single" style="buggy"}
public class Square {
    private double side;
    //assume getters, setters defined
    public Square(Square other) {
        setSide(other.side);
    }
}

class Client {
    public static void main(String[] args) {
        Square myObj = new Square(2.4);
        //your code
    }
}
```

    Square yourObj = new Square(myObj);

