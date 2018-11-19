---
title: "Iterator"
---

# Iterator

There is a powerful and consistent way to traverse almost all data structures in Java including lists - [Iterator](https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html).

The two important methods belonging to `Iterator` interface are:

1. `hasNext()`: returns `true` if there is an item in front of the current position of the iterator.
2. `next()`: returns the item in front of the current position of the iterator (if any), and moves the iterator forward. Throws `NoSuchElementException` if the iteration has no more elements.

A class that implements `Iterator` interface can add other methods too. [ListIterator](https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html) is one such class.

> We will focus only on `hasNext()` and `next()`.

The advantages of using an iterator are,

1. It's consistent across any class that implements the `Iterator` interface. 
2. It's intuitive as in *"while the collection has another item, access it"*.


### Creating and using a ListIterator on a List object

A ListIterator `iter` is created on a List object `list` as:

```java
ListIterator<Integer> iter = list.listIterator();
```

Assuming the list is [10, 70, 20, 90, 30, 80], the initial state of `iter` is represented by the red block.

![](./../fig/06-lists/listIterator/listIterator-figure1.png)


You can check if there is an item in front of the current position of the iterator as:

```java
boolean itemExists = iter.hasNext();
```

Once you check an item exists, you can access it as:

```java
Object item = iter.next();
```

This (accessing an item) results in the iterator moving forward by one.

### Complete example

```java
ArrayList<Integer> list = new ArrayList(Arrays.asList(10, 70, 20, 90, 30, 80));
ListIterator<Integer> iter = list.listIterator();
while(iter.hasNext()) {
  System.out.print(iter.next()+" ");
}
//displays 10 70 20 90 80 30
```

> ### Initial state
> 
> ![](./../fig/06-lists/listIterator/listIterator-figure1.png)
 
> ### After first iteration
> 
> ![](./../fig/06-lists/listIterator/listIterator-figure2.png)

> ### After second iteration
> 
> ![](./../fig/06-lists/listIterator/listIterator-figure3.png)

> ### After third iteration
> 
> ![](./../fig/06-lists/listIterator/listIterator-figure4.png)

> ### After fourth iteration
> 
> ![](./../fig/06-lists/listIterator/listIterator-figure5.png)

> ### After fifth iteration
> 
> ![](./../fig/06-lists/listIterator/listIterator-figure6.png)

> ### After sixth iteration
> 
> ![](./../fig/06-lists/listIterator/listIterator-figure7.png)
