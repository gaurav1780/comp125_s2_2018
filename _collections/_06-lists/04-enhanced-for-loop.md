---
title: "Enhanced for loop"
---
# Enhanced for loop

Until now, we've use out classic counter-based loop to traverse through arrays and lists.

But when you don't really need the index and just want to use a construct where it says,

> *"For every item (current) in the collection, use current for something"*

This kind of traversal is provided by the *enhanced for loop*.

### Syntax

```java
for(type current: array/list) {
	use current
}
```

### Example with array

```java
int[] data = {10, 70, 20, 90};

int total = 0;
for(int item: data) {
	total = total + item;
}
```

### Example with list

```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(70);
list.add(20);
list.add(90);

int total = 0;
for(int item: list) {
	total = total + item;
}
```

## When should I use the enhanced for loop?

Enhanced for loops are used when you don't need the index for anything besides accessing the item at that index. 

### Examples of when enhanced for loop should be used

- Finding the sum of all items in array/list
- Finding the sum of all items (that optionally satisfy some condition(s)) in array/list
- Finding the highest/smallest item in an array/list

### Examples when it's better (IMO) to use a counter-based loop

- Checking if array/list is sorted (because you need to compare an item with the item after it, so you need to access items at index `i` and `i+1`).
- Finding the location of the highest/smallest item in an array/list.
- Finding if an array/list contains any duplicates.
- Sorting an array/list.
- Performing binary search over a sorted array/list.