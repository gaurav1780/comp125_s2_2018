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

### Method header

```java
/**
 * @param idx: index of the node whose value should be returned
 * @return: data value in the node if node exists, null otherwise
 */
public Integer get(int idx)
```

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

### Putting it together, get(int) is defined as:

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

### Method header

```java
/**
 * @param idx: index of the node which should be removed
 * @return: data value in the node if node existed and is now removed, null otherwise
 */
public Integer remove(int idx)
```

In the same manner as `get(int)`, we will first check if an item exists at the given index. If it doesn't, we return `null`.

```java
if(itemExistsAt(idx) == false) {
	return null;
}
```

If it exists, there are two sub-cases.

#### Case 1: removing item at index 0 (`head` is updated)

```java
if(idx == 0) {
	int itemRemoved = head.getData();
	head = head.getNext();
	return itemRemoved;
}
```

#### Case 2: removing item at index 1 or beyond (`head` is not updated)


We need a reference to the node **BEFORE** the node to be removed. That is, the item at index `idx - 1`.

```java
Node current = head;
for(int i=0; i < idx - 1; i++) { //moved forward idx-1 times
	current = current.getNext();
}
```



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure24.png)



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure25.png)



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure26.png)



Then we make a backup copy of the value of the node to be removed.

```java
Node nodeToRemove = current.getNext();
int itemRemoved = nodeToRemove.getData();
}
```


Finally, we make the node before the node to be removed refer (using next) to the node **after** the node to be removed, and return the value of the node removed.

```java
current.setNext(nodeToRemove.getNext());
return itemRemoved;
```

![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure27.png)


![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure28.png)


### Putting it together, remove(int) is defined as:

```java
public Integer remove(int idx) {
	if(itemExistsAt(idx) == false) {
		return null;
	}
	
	if(idx == 0) {
		int itemRemoved = head.getData();
		head = head.getNext();
		return itemRemoved;
	}
	
	Node current = head;
	for(int i=0; i < idx - 1; i++) { //moved forward idx-1 times
		current = current.getNext();
	}
	
	Node nodeToRemove = current.getNext();
	int itemRemoved = nodeToRemove.getData();

	current.setNext(nodeToRemove.getNext());
	return itemRemoved;
}
```

## Inserting an item at a given index

### Method header

```java
/**
 * @param idx: index at which node should be inserted
 * @param value: data value of the node to be inserted
 * @return: true if node can be inserted at given index, false otherwise
 */
public boolean insert(int idx, int value)
```

<iframe width="560" height="315" src="https://www.youtube.com/embed/pYyZ__roUZk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

In the same manner as `get(int)` and `remove(int)`, we will first check if the item can be inserted at the given index.

If the list currently contains 4 items (at indices 0 through 3), a new node can be inserted at index 0 (before the first item) through 4 (after the last item).

Thus, the following condition checks if the item **cannot** be inserted and the method can return `false`.

```java
if(idx < 0 || idx > size()) {
   return false;
}
```

Now there are two sub-cases.

#### Case 1: inserting item at index 0 (`head` is updated)

```java
Node node = new Node(value, null);
if(idx == 0) {
	node.setNext(head);
	head = node;
}
```

#### Case 2: inserting item at index 1 or beyond (`head` is not updated)

We get a reference to the item **before** where the item needs to be inserted.

```java
Node current = head;
for(int i=0; i < idx - 1; i++) { //moved forward idx-1 times
	current = current.getNext();
}
```

In the diagrams, we illustrate the process when inserting value 50 between 10 and 70.



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure17.png)



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure18.png)



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure19.png)



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure20.png)




Finally, we insert the new node after it.

```java
Node itemAfter = current.getNext(); //itemAfter will be null if node added to end of list
current.setNext(node);
node.setNext(itemAfter); //node.next will ne null if node added to end of list

return true;
```



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure22.png)



![](./../fig/06-lists/customBuiltLinkedList/linkedlists-figure23.png)



### Putting it together, insert(int, int) is defined as:

```java
public boolean insert(int idx, int value) {
	if(idx < 0 || idx > size()) {
	   return false;
	}
	
	Node node = new Node(value, null);
	if(idx == 0) {
		node.setNext(head);
		head = node;
	}
	
	Node current = head;
	for(int i=0; i < idx - 1; i++) { //moved forward idx-1 times
		current = current.getNext();
	}
	
	Node itemAfter = current.getNext(); //itemAfter will be null if node added to end of list
	current.setNext(node);
	node.setNext(itemAfter); //node.next will ne null if node added to end of list
	
	return true;
}
```

# Homework


#### Task  (advanced)

Add an instance method to class `MyLinkedList` that reverses the list represented by the calling object. If the state of the list before calling the method is `head -> 10 -> 70 -> 20 -> 90 -> null`, its state, after the method executes, should be `head -> 90 -> 20 -> 70 -> 10 -> null`.
