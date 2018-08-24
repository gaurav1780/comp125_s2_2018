---
title: "Selection Sort"
---

# Selection Sort

## Basic principle

The principle behind selection sort is:

> *Swap the smallest item in the* **unsorted part** *of the array, with the
first item of the* **unsorted part** *of the array*

Before we begin, lets take a look at a pretty sweet video to illustrate selection sort, by the good folks at CodeArchery. 

<iframe width="560" height="315" src="https://www.youtube.com/embed/R_f3PJtRqUQ" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

## Explanation

Green represents sorted region, red represents unsorted region. 

Original state:

><span style="color:red">17, 16, 23, 8, 15</span>

First item in unsorted part: `17`. Smallest item in unsorted part: `8`

After **first** iteration:
><span style="color:green">**8**</span>, <span style="color:red">16, 23, 17, 15<span style="color:red">

First item in unsorted part: `16`. Smallest item in unsorted part: `15`

After **second** iteration:
><span style="color:green">**8, 15**,</span> <span style="color:red"> 23, 17, 16</span>

First item in unsorted part: `23`. Smallest item in unsorted part: `16`

After **third** iteration:

><span style="color:green">**8, 15, 16**,</span> <span style="color:red"> 17, 23

First item in unsorted part: `17`. Smallest item in unsorted part: `17`

After **fourth** iteration:

><span style="color:green">**8, 15, 16, 17**,</span> <span style="color:red"> 23

Unsorted part has only one item left, which has to be the smallest item. Therefore, fifth iteration is not required.

**SORTED ARRAY:**

><span style="color:green">**8, 15, 16, 17, 23**


{: challenge}
> ## How many iterations are required to sort an array containing `n` items using selection sort?
>> ## SOLUTION
>>> `(n-1)` iterations
>{: .solution}
{: .challenge}


A second example is provided below:

<div> &nbsp; </div>
![](./../fig/04-searching-and-sorting/selection-sort.png)
<div> &nbsp; </div>

### Decomposing selection sort

Selection sort pseudo-code can be written as:

``` 
startIndex = 0
while(startIndex < arr.length - 1) {
	smallestIndex = index of smallest item starting at unsortedStartIndex
	swap items at startIndex, smallestIndex
	move unsorted region to the right by increasing startIndex
}
```

Java code is written as:

```java
public static void selectionSort(int[] arr) {
	int startIndex = 0;
	while(startIndex < arr.length - 1) {
		//find index of smallest item from index startIndex onwards
		int smallestIndex = getSmallestItemIndex(arr, startIndex);

		//swap the first and smallest items
		int temp = arr[startIndex];
		arr[startIndex] = arr[smallestIndex];
		arr[smallestIndex] = temp;
		
		//move unsorted range forward by 1
		startIndex++; 
	}
}
```

The method `getSmallestItemIndex` takes two parameters:

1. array, in which the smallest item's index needs to be determined.
2. index, starting index for the part of the array where the smallest item's index must be determined.

```java
public static int getSmallestItemIndex(int[] data, int firstIndex) {
	int result = firstIndex; 			//assume first item is the smallest item
	for(int i=firstIndex+1; i < arr.length; i++) {
		if(arr[i] < arr[result]) { 		//an even smaller item found
			result = i; 			//update result
		}
	}
	return result;
}
```

## Selection sort performance

The number of times `getSmallestItemIndex` method is called is `(n-1)`.

Inside `getSmallestItemIndex`, the number of times loop executes is:

- `(n-1)`, when `firstIndex = 0`.
- `(n-2)`, when `firstIndex = 1`.
- ...
- `1`, when `firstIndex = arr.length - 2`.

This gives a total of `1 + 2 + ... + n-1` = `n*(n-1)/2` executions of of the comparison `arr[i] < arr[result]`.

> Number of iterations in all cases: `n*(n-1)/2`