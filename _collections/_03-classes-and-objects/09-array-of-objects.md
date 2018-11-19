---
title: "Array of objects"
---

# Array of objects

## Class under consideration

We will use the following class for this discussion.

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
    
    public String toString() {
      return width + " by " + height;
    }
}
```

### Creating an array of objects

#### STEP 1 - Instantiate the array


```java
Rectangle[] blocks = new Rectangle[5];
```

You can go through each item of the array and display it.

```java
for(int i=0; i < blocks.length; i++) {
	System.out.println(blocks[i]);
}
```

You'll get the following output:

```
null
null
null
null
null
```

This is because none of the items of the array, each a `Rectangle` object, were instantiated. 

The memory diagram for the current state of the array is

<div>&nbsp;</div> 
![](./../fig/03-classes-and-objects/array-of-objects-figure0.png) 
<div>&nbsp;</div>

Hence...


#### STEP 2 - Instantiating each object

```java
for(int i=0; i < blocks.length; i++) {
	blocks[i] = new Rectangle(i+1, i*2); //instantiate item at index i
	System.out.println(blocks[i]); //display it
}
```

<div>&nbsp;</div> 
![](./../fig/03-classes-and-objects/array-of-objects-figure1.png) 
<div>&nbsp;</div>


This time, you will get the following output:

```
1.0 by 0.0
2.0 by 2.0
3.0 by 4.0
4.0 by 6.0
5.0 by 8.0
```

## Exercise: Creating (filtered) deep copy of an object array

Consider the array `source` populated as:

```java
Rectangle[] source = new Rectangle[20];
for(int i=0; i < source.length; i++) {
	double randWidth = 1 + rand.nextInt(5);
	double randHeight = 1 + rand.nextInt(5);
	source[i] = new Rectangle(randWidth, randHeight);
}
```

Create a second array containing Rectangles that have an area of 10 or more.

#### STEP 1: Count the number of rectangles with area of 10 or more

```java
int count = 0;
for(int i=0; i < source.length; i++) {
	if(source[i].area() >= 10) {
		count++;
	}
}
```

#### STEP 2: Create an array of required size

```java
Rectangle[] bigRectangles = new Rectangle[count];
```

#### STEP 3: Populate the array

```java
int destIndex = 0;
for(int i=0; i < source.length; i++) {
	if(source[i].area() >= 10) {
		bigRectangles[destIndex] = source[i];
		destIndex++;
	}
}
```

{: challenge}
> ## Given an array `data` of `Rectangle` objects, create an array `wider` with those rectangles whose width is more than their height
>> ## SOLUTION
```java
int count = 0;
for(int i=0; i < data.length; i++) {
	if(data[i].getWidth() > data[i].getHeight()) {
		count++;
	}
}
Rectangle[] wider = new Rectangle[count];
int destIndex = 0;
for(int i=0; i < data.length; i++) {
	if(data[i].getWidth() > data[i].getHeight()) {
		wider[destIndex] = data[i];
		destIndex++;
	}
}
```
>{: .solution}
{: .challenge}