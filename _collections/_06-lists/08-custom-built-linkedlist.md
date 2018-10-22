---
title: "Custom built linkedlist"
---

# Custom built linkedlist

Now that we have taken a look at the [Node](./Node.java) class, we can construct a class that has a single `Node` object as instance variable.

```java
public class MyLinkedList {
	public Node head;
}
```

As we saw in the last section, this node holds a reference to another node. That node could be `null` or could be a valid instance. A sample client:

```
public class Client {
	public static void main(String[] args) {
		MyLinkedList list1 = new MyLinkedList();
		Node p = new Node(10, null);
		list1.head = p;
		
		MyLinkedList list2 = new MyLinkedList();
		Node q = new Node(40, null);
		Node r = new Node(20, q);
		list2.head = r;
	}
}
```

- `list1` has a single instance variable, `head`, that refers to `p`, which in turn, refers to `null`.
> list1.head -> p -> null
 
- `list2` has a single instance variable, `head`, that refers to `r`, which in turn refers to `q`, which in turn, refers to `null`.
> list2.head -> r -> q -> null	

The idea is that if we start at `head`, we can visit every node in the chain until we hit `null`.

<iframe width="560" height="315" src="https://www.youtube.com/embed/pYyZ__roUZk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
<p> &nbsp; </p>

#### For the rest of the document, we'll change the visibility of `head` to private.

<p> &nbsp; </p>

```java
public class MyLinkedList {
	private Node head;
	
	public void display() {
		Node current = head; //create temporary reference to update
		while(current != null) {
			System.out.println(current.getData()); //use current for ... whatever
			current = current.getNext(); //move it to the next node
		}
	}	
}
```

The same logic can be used to add up all the items in the list, as,

```java
//in class MyLinkedList
public int sum() {
	Node current = head; //create temporary reference to update
	int result = 0;
	while(current != null) {
		result = result + current.getData();
		current = current.getNext(); //move it to the next node
	}
	return result;
}
```

### Size of the list

We can add a method to determine size of the list, as,

```java
//in class MyLinkedList
public int size() {
	Node current = head; //create temporary reference to update
	int count = 0;
	while(current != null) {
		count = count + 1;
		current = current.getNext(); //move it to the next node
	}
	return count;
}
```

### Checking if list is empty

If the list is empty, head is null

```java
public boolean isEmpty() {
	return head == null; //if head is null, return true, else return false
}
```

## Adding an item at the front

```java 
public void addToFront(int item) {
	Node temp = new Node(item, head);
	head = temp;
}
```

Note that if the list is empty, `head` is null, and so the newly added node has `null` as next node, which is correct.

If the list is not empty, `temp` has the current head as the next node, and then `head` is updated to refer to the added node.

## Removing the first item in the list

We also want to return the item removed.

If head is null, nothing can be removed, so we return null.

If head is not null, we store the item in a variable, update `head` to refer to the node after the current `head` and return the item removed

```java
public Integer removeFirst() { //Integer so as to return null as error code
	if(head == null) {
		return null;
	}
	int result = head.getData();
	head = head.getNext(); //update head
	return result;
}
```

## Indexing items


# Homework

#### Task 1 
Add an instance method to class `MyLinkedList` that returns `true` if the list is empty, `false` otherwise.

#### Task 2
Add an instance method to class `MyLinkedList` that returns the first item in the list, if any, `null` otherwise. Based on this (`null` is returned if list is empty), think about the return type of the method before anything else.

#### Task 3
Add an instance method to class `MyLinkedList` that returns the sum of all items in the list. Return 0 if the list is empty.

#### Task 4
Add an instance method to class `MyLinkedList` that returns the sum of all positive items in the list. Return 0 if the list is empty or none of the items are positive.

#### Task 5
Add an instance method to class `MyLinkedList` that returns `true` if all the items of the list are even numbers, `false` otherwise. Return `true` if the list is empty.