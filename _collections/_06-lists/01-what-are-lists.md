---
title: "What are lists?"
---

# What are lists?

Lists are data structures, much like arrays. The differences being,

### 1. Lists must hold objects

Arrays can hold a collection of primitive data types or a collection of objects, while lists can hold a collection of objects, **not** primitive data types.

### 2. Lists grow as required

The size of array needs to be specified at the time of creating an array. The size of a list need not be specified. You can add as many items as you want to a list (permitting system memory).

### 3. Lists have a range of instance methods

With arrays (assuming array name is `arr`), the only operators you have to work with are `arr.length` and `arr[i]`. Anything and everything you need to do must be done using these two operators. Several life-saving methods are applicable on list objects, such as: 
	
- `get(int)` //similar to arr[i]
- `size()` //similar to arr.length
- `add(Object)`	//add item at the end of the list
- `remove(Object)` //parameter represents item to be removed
- `remove(int)` //parameter represents index
- `indexOf(Object)` //parameter represents item being searched
- `lastIndexOf(Object)` //parameter represents item being searched

