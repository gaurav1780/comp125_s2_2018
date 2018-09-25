---
title: "Built in lists in Java"
---

# Built in lists in Java

## List interface

`List` is an interface in Java (for the time being, just assume that an *interface* is a collection of method headers - very loose definition but it will do for now). 

The **most frequently used** methods from `List` are:

| Method                    | Description                                                                                         |
|---------------------------|-----------------------------------------------------------------------------------------------------|
| get(int): Object          | returns Object at passed index (IndexOutOfBoundsException if the index is out of range)             |
| size(): int               | returns number of items in the list (0 if empty)                                                    |
| add(Object)               |  adds passed object at the end of the list (IndexOutOfBoundsException if the index is out of range) |
| add(int, Object)          | adds (at the given index) the object passed (                                                       |
| contains(Object): boolean | returns true if passed object exists in the list, false otherwise                                   |
| indexOf(Object): int      | returns first index at which passed object exists (-1 if it doesn't exist in the list)              |
| lastIndexOf(Object): int      | returns last index at which passed object exists (-1 if it doesn't exist in the list)              |
| toString():String         | returns String representation of the list (comma-separated items inside square brackets)            |

The two classes that implement the methods from `List` interface are:

- ArrayList
- LinkedList

These classes may implement other methods as well but they definitely implement all methods from `List`.

The two classes differ in how the items are stored (we'll look at that in the sections *custom-built arraylist* and *custom-built linkedlist*).

## Example 1 - Creating and operating on List objects

### Creating a list

A list cannot hold variables of primitive data types (like `int`, `boolean`, `double`, `char`). Instead it must hold objects of corresponding classes provided by Java (`Integer`, `Boolean`, `Double`, `Character` respectively)

A list is typically parameterized with the type of objects it must hold.

Example (Java 8 and beyond),


```java
ArrayList<Integer> list = new ArrayList();
```
#### Adding items at the end

```java
list.add(10);
list.add(70);
list.add(20);
list.add(90);
//list = [10, 70, 20, 90]
```

#### Adding items at arbitrary index

```java
list.add(0, 30);
//list = [30, 10, 70, 20, 90]

list.add(2, 4);
//list = [30, 10, 4, 70, 20, 90]

list.add(list.size(), 30); //after the last item
//list = [30, 10, 4, 70, 20, 90, 30]

list.add(20, -60); //throws IndexOutOfBoundsException
```

#### Removing an item at a specific index

```java
list.remove(5);
//list = [30, 10, 4, 70, 20, 30]

list.remove(-3); //throws IndexOutOfBoundsException

list.remove(6); //throws IndexOutOfBoundsException
```

#### Removing a specific object

The only scenario in which this is tricky is a list containing Integers, because the type of the object and the type of the index is the same (int or Integer).

```java
list.remove(4); 
//removes item at index 4, not the item 4. list = [30, 10, 4, 70, 30]

//if you want to remove THE ITEM 4, you must pass it as Integer object

list.remove((Integer)4); 
//removes item 4. list = [30, 10, 70, 30]
```

#### Iterating over the list

Following example adds the items in the list

```java
int total = 0;
for(int i=0; i < list.size(); i++) {
	total = total + list.get(i);
}
//total = 30+10+70+30 = 140
```

#### Checking existence and location of items in list
	
```java
//note: list = [30, 10, 70, 30]
boolean flag = list.contains(10);   //flag = true
boolean status = list.contains(20); //status = false

int idx1 = list.indexOf(70);        //idx1 = 2
int idx2 = list.indexOf(40);        //idx2 = -1
int idx3 = list.indexOf(30);        //idx3 = 0
int idx4 = list.lastIndexOf(30);    //idx4 = 3
```

#### Storing list contents in a String or displaying it

```java
String str = list.toString(); //str = "[30, 10, 70, 30]"
System.out.println(list);     //toString() called, displays [30, 10, 70, 30]
```

## Passing lists to methods

Lists are passed to methods like any other object. Since a shallow copy of the passed list is made into the formal parameter, modifying the contents of a list in a method results in the contents of the passed list being modified too. 

## COMPREHENSIVE EXAMPLE

### Context

1. A list should be created so that it contains the outcomes of a "normal" 6-faced die (singular of dice) being rolled `N` times.
2. Store, in variable `nSixes`, the number of times a 6 was rolled. 
3. Store, in variable `average`, the average outcome.
4. Store, in variable `noTwoAdjSame`, the value `true` if none of two adjacent (one after the other) outcomes the same, `false` otherwise. 
5. Store, in variable `mostFreq`, the most frequent outcome.


```java
//1.
Random rand = new Random(); //needs import java.util.Random;
int N = rand.nextInt(1000); //N is in the range [0, 1000)
                            //`[` means inclusive, `)` means exclusive

ArrayList<Integer> outcomes = new ArrayList();
for(int i=0; i < N; i++) {
   int current = rand.nextInt(6) + 1;
	outcomes.add(current);
}
```

```java
//2.
int nSixes = 0;
for(int i=0; i < list.size(); i++) {
	if(list.get(i) == 6) {
		nSixes++;
	}
}
```
```java
//3.
int total = 0;
for(int i=0; i < list.size(); i++) {
	total = total + list.get(i);
}
double average = total / (double)list.size(); //without (double), it'd be int/int
```

```java
//4.
boolean noTwoAdjSame = true;
for(int i=0; i < list.size() - 1 && noTwoAdjSame; i++) { 
	//for all but last item and as long as noTwoAdjSame is true
	if(list.get(i) == list.get(i+1)) { //same outcome one after the other
		noTwoAdjSame = false;
	}
}	
```

```java
//5. 
int[] freqs = new int[6];
/*
frequency of rolling a one is stored at index 0
frequency of rolling a two is stored at index 1
...
frequency of rolling a six is stored at index 5
*/
for(int i=0; i < list.size(); i++) {
	freq[list.get(i) - 1]++; //updated frequency of encountered outcome
}

int maxIndex = 0; //assume 1 was rolled the most times (frequency is at index 0)
for(int i=1; i < freqs.length; i++) {
	if(freqs[i] > freqs[maxIndex]) {
		maxIndex = i;
	}
}

int mostFreq = maxIndex + 1; //add the offset to get outcome from index
```

### Example of methods operating on lists 

You can do this all of this in methods as well. Example for task 3 (average) provided.

#### Method definition

```java
public static double getAverage(ArrayList<Integer> data) {
	int total = 0;
	for(int i=0; i < data.size(); i++) {
		total = total + data.get(i);
	}
	return total / (double)data.size();
}
```


### Method call

```java
double average = getAverage(list);
```

