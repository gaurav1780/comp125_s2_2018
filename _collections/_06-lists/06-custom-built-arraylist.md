---
title: "Custom-built arraylist"
---

# Custom-built arraylist

In this chapter, we'll see how an arraylist holds items and how to implement it.

<span style="color:red">**NOTE!**</span> The built-in class for ArrayList in Java holds a collection of objects, not primitive data type, but in our example, we'll create a collection of `double` items, for simplicity.

## What an ArrayList class looks like

The ArrayList class has an instance variable array that holds the items. If, at the time of triying to add an item, the array is full, then:

1. a bigger array is created, 
2. items from the instance variable array are copied over
3. instance variable array is re-referenced to refer to the new, bigger array

Let's create one such class holding an array of doubles

```java
public class MyArrayList {
	private double[] data;
	private int nItems;
	
	public MyArrayList() {
		data = new double[5];
		nItems = 0; //no item added yet
	}
	
	public void add(double itemToAdd) { //THERE IS A PROBLEM HERE
		data[nItems] = itemToAdd;
		nItems++;
	}
}
```

The client can create an object of class `MyArrayList` as:

```java
MyArrayList list = new MyArrayList();
list.add(10);
list.add(70);
list.add(20);
list.add(90);
list.add(30);
```

Five items were added to the list, which is ok. But as soon as you try to add a sixth item using,

```java
list.add(80);
```

The method `add` will cause,

```java
data[5] = 80; //ArrayIndexOutOfBoundsException
```

Therefore, we must first check if the internal array is full.

```java
//inside class MyArrayList
	public boolean isFull() {
		if(nItems == data.length) {
			return true;
		}
		else {
			return false;
		}
	}
```

The method `add` should be modified as,

```java
//inside class MyArrayList
	public void add(double itemToAdd) { 
		if(isFull()) {
			??? 
		}
		data[nItems] = itemToAdd;
		nItems++;
	}
```

If the internal array is full, 

1. a bigger array is created, 
2. items from the instance variable array are copied over
3. instance variable array is re-referenced to refer to the new, bigger array

These steps are performed in a method `grow()`.

```java
	public void grow() {
		double[] temp = new double[data.length + 5]; //5 extra items
		
		for(int i=0; i < data.length; i++) { //copy all items over
			temp[i] = data[i];
		}
		
		data = temp; //make instance variable array refer to the bigger array
	}
```

## Updated class definition

```java
public class MyArrayList {
	private double[] data;
	private int nItems;
	
	public MyArrayList() {
		data = new double[5];
		nItems = 0; //no item added yet
	}
	
	private void grow() { //should not be called by outside code
		if(!isFull()) { //should not grow if full
			return;
		}
	
		double[] temp = new double[data.length + 5]; //5 extra items
		
		for(int i=0; i < data.length; i++) { //copy all items over
			temp[i] = data[i];
		}
		
		data = temp; //make instance variable array refer to the bigger array
	}
	
	public void add(double itemToAdd) { 
		if(isFull()) {
			grow();
		}
		data[nItems] = itemToAdd;
		nItems++;
	}
}
```

## Method to add an item at an arbitrary index

Say, the list contains items [12.5, 6.4, 8.5, 9.6, -3.4] and we want to add an item 16.42 at index 0. All items in the array need to move forward by 1.

<p></p>
&nbsp;
<p></p>

![](./../fig/06-lists/customBuiltArraylist/customBuiltArraylist-figure3.png)

<p></p>
&nbsp;
<p></p>

```java
	public boolean add(int idx, double itemToAdd) {
		if(idx < 0 || idx > nItems) {
			return false; //to indicate failure
		}
		
		if(isFull()) {
			grow();
		}
		for(int i=nItems - 1; i >= idx; i--) {
			data[i+1] = data[i];
		}
		
		data[idx] = itemToAdd;
		nItems++;
		
		return true; //to indicate success
	}
```

## Method to remove an item from an arbitrary index

Say, the list contains items [12.5, 6.4, 8.5, 9.6, -3.4] and we want to remove the item at index 0. All items in the array need to move backward by 1.


<p></p>
&nbsp;
<p></p>

![](./../fig/06-lists/customBuiltArraylist/customBuiltArraylist-figure5.png)

<p></p>
&nbsp;
<p></p>


The method should return the item removed.

If we keep the return type as `double`, what do we return if the index is invalid and therefore no item exists at that index?

Hence, we keep the return type `Double` since we can return `null` as error code.

```java
	public Double remove(int idx) {
		if(idx < 0 || idx >= nItems) {
			return null; //error code
		}

		double itemToRemove = data[idx];

		for(int i= idx; i < nItems - 1; i++) {
			data[i] = data[i+1];
		}
		nItems--;
		
		return itemRemoved; //can return double variable as Double
	}
```		

# Complete class and client (including homework)

- [MyArrayList.java](./MyArrayList.java) (contains several incomplete methods for practice)
- [MyArrayListClient.java](./MyArrayListClient.java)

