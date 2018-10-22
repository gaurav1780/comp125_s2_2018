---
title: "Important methods in custom linkedlist"
---

# Important methods in custom linkedlist

This section will assumes the following definition of `MyLinkedList` class;

```java
public class MyLinkedList {
	private Node head;
	
	public void addToFront(int item) {
		//create a node that has head as the next node
		Node node = new Node(item, head);
		
		//update head to new node
		head = node;
	}
	
	public int size() {
		Node current = head;
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	public boolean itemExistsAt(int idx) {
		return idx >= 0 && idx < size();
	}
	
	public String toString() {
		Node current = head;
		String result = "List: ";
		while(current != null) {
			result = result + current.getData() + " ";
			current = current.getNext();
		}
		return result+"\n";
	}
}
```
## Getting an item at a specific index (if any)

Steps involved:

1. check if an item exists at the given index using `itemExistsAt(int)`
	1. if not, return `null`
	2. if it does, go to the item and return its value.
	 
Now *"going"* to the item requires us to start at `head` and move forward using `getNext()`, one at a time. How many times should we move forward by one?

Lets say, the list is `head -> 10 -> 70 -> 20 -> 90 -> null`.

idx = 0 => move 0 times
idx = 1 => move 1 time
idx = 2 => move 2 times 
...

In general, we need to move forward `idx` times.

```java
Node current = head;
for(int i=0; i < idx; i++) {
	current = current.getNext();
}
```

When the loop terminates, `current` holds a reference to the `Node` object whose value needs to be returned.

```java
return current.getData();
```

Putting it together,

```java
public Integer get(int idx) {
	if(itemExistsAt(idx) == false) {
		return null;
	}
	
	//guaranteed that item DOES exist at index idx
	Node current = head;
	for(int i=0; i < idx; i++) {
		current = current.getNext();
	}
	return current.getData();
}
```
## Removing (and returning) an item at a specific index (if any)

In the same manner as `get(int)`, we will first check if an item exists at the given index. If it doesn't, we return `null`.

```java
if(itemExistsAt(idx) == false) {
	return null;
}
```

If it exists, there are two sub-cases.

#### Case 1: removing item at index 0 (`head` is updated)

if(

we need a reference to the node **BEFORE** the node to be removed.

## Inserting an item at a given index

<iframe width="560" height="315" src="https://www.youtube.com/embed/pYyZ__roUZk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

# Homework


#### Task  (advanced)

Add an instance method to class `MyLinkedList` that reverses the list represented by the calling object. If the state of the list before calling the method is `head -> 10 -> 70 -> 20 -> 90 -> null`, its state, after the method executes, should be `head -> 90 -> 20 -> 70 -> 10 -> null`.