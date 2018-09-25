---
title: "What are arrays not good enough?"
---

# What are arrays not good enough?

## Example - copying over a subset

Consider an array `src` holding 100 integers. Some negative, some positive.
We need to copy all negative items over to a new array `dest`.

As an example, if

`src` is `{10, 20, 50, 0, -40, 30, 90, 60, -10, -50, 80}`

`dest` should be `{-40, -10, -50}`

In order to do this, we need to,

1. Count the number of required (negative) values in the array `src`
2. Create an array `dest` of that size
3. Copy items over to `dest`.

### Step 1

```java
int count = 0;
for(int i=0; i < src.length; i++) {
	if(src[i] < 0) {
		count++;
	}
}
```

### Step 2

```java
int[] dest = new int[count];
```


### Step 3

We are copying,

`src[4]` into `dest[0]`

`src[8]` into `dest[1]`

`src[9]` into `dest[2]`

So, in addition to the current index of `src`, we also need to keep track of the current index of `dest` into which the item must be copied.

```java
int idx = 0; //index where item must be copied
for(int i=0; i < src.length; i++) {
	if(src[i] < 0) {
		dest[idx] = src[i]; //another item copied
		idx++; //move destination index forward
	}
}
```

### Final solution

```java
int count = 0;
for(int i=0; i < src.length; i++) {
	if(src[i] < 0) {
		count++;
	}
}

int[] dest = new int[count];

int idx = 0; //index where item must be copied

for(int i=0; i < src.length; i++) {
	if(src[i] < 0) {
		dest[idx] = src[i]; //another item copied
		idx++; //move destination index forward
	}
}
```

### Solution using List (just focus on how easy and intuitive it is)

A solution to the same problem when `src` and `dest` are lists instead of arrays is,

```java
ArrayList<Integer> dest = new ArrayList();
for(int item: src) {
	if(item < 0) {
		dest.add(item);
	}
}
```

# <span style="color:ForestGreen">I KNOW!</span>
		

<!--## Example 2 - reading student names outcomes from a file

Consider a file that holds student names in the format `FIRST_NAME LAST_NAME`.
A sample file looks something like:

```
Cedric Diggory
Alvaro Morata
Rose Granger-Weasley
Albus Potter
Luna Lovegood
Lionel Messi
```

In order to store the names in an array, we need to do one of two things,

1. Create a String array so big that it will definitely be big enough to hold all items from the file.
2. Traverse the file once to count the number of names, then create an array of that size, and then traverse the file again, adding the items in the array.
-->
