---
title: `toString() method`
---

Displaying objects
==================

Often we need to display the details of an object. For example, we might
need to display name and age of a Person object, or the details of a
Time object in the format `hours:minutes:seconds`, or in our example,
`width` and `height` of a `Rectangle` object. It is quite inconvenient
to display these details as,
I    Rectangle r = new Rectangle(5, 8);
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

Define the `toString` method in the `Circle`
class such that it displays the object details in the following format -

    Circle radius: <radius>, area: <area>

In a separate client, create a Circle object with radius 1.6 and display
it on the console.

    public String toString() {
        String result = "Circle radius: "+radius+", area: "+area();
        return result;
    }   
