---
title: "When should we use which"
---

# When should we use which

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
}
```

## Shallow copy

A **shallow copy** is when you copy an object into another using an assignment operator (`=`).

```java
Rectangle source = new Rectangle(1.2, 2.5);
Rectangle destination = source;
```

Given that the object `source` holds the reference to the instance, that reference is copied into object `destination`. Now there are two *objects* referring to the same *instance*.

<div> &nbsp; </div>
![](./../fig/03-classes-and-objects/shallowCopyDeepCopy-figure0.png)
<div> &nbsp; </div>

If you change the value of the instance variables of either `source` or `destination`, the other object will be affected.

```java
destination.setWidth(666.66);
```

<div> &nbsp; </div>
![](./../fig/03-classes-and-objects/shallowCopyDeepCopy-figure1.png)
<div> &nbsp; </div>

## Deep copy

A **deep copy** is when you create a new instance of a class and copy the contents from another instance.

```java
Rectangle source = new Rectangle(1.2, 2.5);
Rectangle destination = new Rectangle();
destination.setWidth(source.getWidth());
destination.setHeight(source.getHeight());
```

<div> &nbsp; </div>
![](./../fig/03-classes-and-objects/shallowCopyDeepCopy-figure2.png)
<div> &nbsp; </div>

If you change the value of the instance variables of either `source` or `destination`, the other object will **NOT** be affected.

```java
destination.setWidth(888.88);
```


<div> &nbsp; </div>
![](./../fig/03-classes-and-objects/shallowCopyDeepCopy-figure3.png)
<div> &nbsp; </div>

