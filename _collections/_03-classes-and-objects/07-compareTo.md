---
title: "Comparing objects"
---

# Comparing objects

Primitive data types have values stored directly, while objects are a reference to the location where instance variables are stored.

For example,

```java
int x = 10;
```

![](./../fig/03-classes-and-objects/compareTo-figure0.png)

```java
char ch = '$';
```

![](./../fig/03-classes-and-objects/compareTo-figure1.png)

```java
boolean flag = true;
```

![](./../fig/03-classes-and-objects/compareTo-figure2.png)

On the other hand, objects hold a reference to the location where the instance variables are stored.

For example, consider the class `Rectangle`:

```java
class Rectangle {
	private double width, height;	
	
	public double getWidth() { 
    	return width; 
   	}
    
    public void setWidth(double w) { 
      width = Math.abs(w);
    }
    
   	public double getHeight() { 
    	return height; 
   	}
    
    public void setHeight(double h) { 
      height = Math.abs(h);
    }
    
    public Rectangle(double w, double h) {
    	setWidth(w);
    	setHeight(h);
    }
    
    public double area() {
    	return width * height;
    }
}
```

Let the client code be:

```java
public class Client {
	public static void main(String[] args) {
		Rectangle a4 = new Rectangle(8.27, 11.69);
	}
}
```

![](./../fig/03-classes-and-objects/compareTo-figure3.png)

Here, object `a4` holds a reference to a block of memory where instance variables `width` and `height` are stored.

## Comparing variables vs. comparing objects

### Comparing variables

When you compare two variables of primitive data type, you are comparing their contents.

```java
int x = 5;
int y = 5;
if(x == y) { //evaluates to true
	System.out.println("Same"); //is displayed, as expected
}
else {
	System.out.println("Different");
}

```

### Comparing objects

If we compare objects like this, we'd be comparing if they hold the same reference or not. That is, whether they are shallow copies of the same instance or not.

Let the client code be:

```java
public class Client {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2, 2.5);
		Rectangle r2 = new Rectangle(1.2, 2.5);
		if(r1 == r2) { //evaluates to false
			System.out.println("Same");
		}
		else { //is executed!
			System.out.println("Different"); //is displayed!
		}
	}
}
```

The above code would end up in displaying `Different` as `r1` and `r2` **do not** refer to the same instance.

Therefore, we cannot use the primitive comparison operator `==`.

We define (technically, we over-ride) the instance method`compareTo()`. We call it on an object and pass the object to which we are comparing it as the parameter.

Typically, we'd compare objects of the same class but we can also compare any *comparable* objects. For example, we can compare a rectangle with a circle (based on area) or a person with a tree (based on age).

Comparison has three possible outcomes:

1. Calling object is **greater than** the parameter object: in this case, `compareTo` returns 1.
2. Calling object is **lesser than** the parameter object: in this case, `compareTo` returns -1.
3. Calling object is **equal to** the parameter object: in this case, `compareTo` returns 0.

Let's take an example of implementing `compareTo` for `Rectangle` class, where comparison is based on the area.

```java
public int compareTo(Rectangle other) {
	double callingObjectArea = this.area();
	double parameterObjectArea = other.area();
	
	if(callingObjectArea > parameterObjectArea)
		return 1;
	
	/*
	control comes here only if 
	callingObjectArea <= parameterObjectArea
	*/
	
	if(callingObjectArea < parameterObjectArea)
		return -1;
	
	/*
	control comes here only if 
	callingObjectArea == parameterObjectArea
	*/
	
	return 0;		
}
```

Consider the following example of calling the `compareTo` method:

```java
public class Client {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2, 3.5); //area is 4.2
		Rectangle r2 = new Rectangle(1.4, 2.5); //area is 3.5
		int status = r1.compareTo(r2);
	}
}
```

The following events take place upon the execution of `r1.compareTo(r2)`:

1. A shallow copy of calling object (`r1`) is made into `this`
2. A shallow copy of parameter (`r2`) is made into formal parameter `other`
3. Control is transferred to method call.

![](./../fig/03-classes-and-objects/compareTo-figure4.png)


{: challenge}
> ## Define the `compareTo` method in the `Circle` class such that it returns 1 if the calling object is larger than the parameter, -1 if it's smaller, and 0 if it's the same size.
>> ## SOLUTION
>>> ```java
>>> public int compareTo(Circle other) {
>>>	if(this.radius > other.radius) {
>>> 		return 1;
>>> 	}
>>> 	if(this.radius < other.radius) {
>>> 		return -1;
>>> 	}
>>> 	return 0;
>>> }   
>>> ```
>{: .solution}
{: .challenge}

{: challenge}
> ## In a separate client, compare two `Circle` objects `c1` and `c2` and store the result in variable `comp`. 
>> ## SOLUTION
>>> ```java
>>> public class Client {
>>>     public static void main(String[] args) {
>>>         //assuming c1 and c2 are objects of class Circle
>>>         int comp = c1.compareTo(c2);
>>>     }   
>>> }
>>> ```
>{: .solution}
{: .challenge}



