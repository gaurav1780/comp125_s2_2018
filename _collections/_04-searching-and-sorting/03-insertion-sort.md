---
title: "Insertion Sort"
---

# Insertion Sort

## Basic principle

The principle behind insertion sort is:

> *Put the first item of the unsorted part at the right place in the sorted part.*

A great video to illustrate insertion sort from our awesome peeps at GeeksForGeeks:

<iframe width="560" height="315" src="https://www.youtube.com/embed/OGzPmgsI-pQ" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

Green represents region that is sorted **so far**, red represents region left to check.

Original state: 

><span style="color:green">**17**,</span><span style="color:red"> 16, 23, 8, 15</span>

The reason we consider the first item to be sorted initially is because if that's the only item so far, it is in sorted order.

First item in unsorted part: `16`. Right place for it: before `17`.

After **first** iteration:
><span style="color:green">**16, 17**,</span><span style="color:red"> 23, 8, 15

First item in unsorted part: `23`. Right place for it: after `17`.

After **second** iteration:
><span style="color:green">**16, 17, 23**,</span><span style="color:red"> 8, 15

First item in unsorted part: `8`. Right place for it: before `16`.

After **third** iteration:
><span style="color:green">**8, 16, 17, 23**,</span><span style="color:red"> 15

First item in unsorted part: `15`. Right place for it: before `16`

After **fourth** iteration:
><span style="color:green">**8, 15, 16, 17, 23**</span>


{: challenge}
> ## How many iterations are required to sort an array containing `n` items using insertion sort?
>> ## SOLUTION
>>> `(n-1)` iterations
>{: .solution}
{: .challenge}


A second example is provided below:

<div> &nbsp; </div>
![](./../fig/04-searching-and-sorting/insertion-sort.png)
<div> &nbsp; </div>

### Decomposing insertion sort

Insertion sort pseudo-code can be written as:

```
idx = 1
while(idx < arr.length) {
	backup = arr[idx]
	move all items higher than backup one index ahead
	copy backup at the index of the last item moved forward
}
```

### SCENARIO 1: Current item needs to move to the front

Assumed current state: 

><span style="color:green">**16, 17, 23**,</span><span style="color:red"> 8, 15</span>

Our job is to move 8 into its rightful place in the green region.
First, we copy 8 into `backup`.

Should we move  23 forward? Yes, as it is more than `backup` (8)

><span style="color:green">**16, 17, 23, 23**,</span><span style="color:red"> 15

Remember, we have 8 stored in `backup`.

Should we move  17 forward? Yes, as it is more than `backup` (8)

><span style="color:green">**16, 17, 17, 23**,</span><span style="color:red"> 15

Should we move  16 forward? Yes, as it is more than `backup` (8)

><span style="color:green">**16, 16, 17, 23**,</span><span style="color:red"> 15

Now, there is nothing left to move forward, so we can now move `backup` at the index of the last item moved (index 0).

><span style="color:green">**8, 16, 17, 23**,</span><span style="color:red"> 15

Thereby, moving 8 in its rightful place.

### SCENARIO 2: Current item needs to move somewhere in the middle of the sorted region

Assumed current state: 

><span style="color:green">**16, 17, 23**,</span><span style="color:red"> 18, 15</span>

Our job is to move 18 into its rightful place in the green region.
First, we copy 18 into `backup`.

Should we move  23 forward? Yes, as it is more than `backup` (18)

><span style="color:green">**16, 17, 23, 23**,</span><span style="color:red"> 15

Remember, we have 18 stored in `backup`.

Should we move  17 forward? No, as it is NOT more than `backup` (18)

So we can now move `backup` at the index of the last item moved (index 2).

><span style="color:green">**16, 17, 18, 23**,</span><span style="color:red"> 15

Thereby, moving 18 in its rightful place.

### SCENARIO 3: Current item is already at the right place
Assumed current state: 

><span style="color:green">**16, 17, 23**,</span><span style="color:red"> 28, 15</span>

Our job is to move 28 into its rightful place in the green region.
First, we copy 28 into `backup`.

Should we move  23 forward? No, as it is NOT more than `backup` (28)

In this case backup need not be moved at all. 

><span style="color:green">**16, 17, 23, 28,**</span><span style="color:red">  15</span>

This is also handled by the code below.

```java
public static void insertionSort(int[] arr) {
	int idx = 1;
	while(idx < arr.length) {
		int backup = arr[idx];
		int k = i-1;
		while(k >= 0 && arr[k] > backup) {
			arr[k+1] = arr[k]; 	//move item forward
			k--; 			//check item before it
		}
		arr[k+1] = backup; 		//move backup at index of last moved item
	}
}
```

## Insertion sort performance

### Best case scenario

In the best case, the array is already sorted in ascending order. The boolean expression `(k >= 0 && arr[k] > backup)` is never true and the inner loop never executes. 

Thus, in the best case, there are `n-1` executions of the expression `(k >= 0 && arr[k] > backup)`

> Number of iterations in worst case: `n-1`

### Worst case scenario

In the best case, the array is already sorted in ascending order. The boolean expression `(k >= 0 && arr[k] > backup)` is true for all `k >= 0`, the inner loop executes the following number of times:

- 1 time, for `idx = 1`
- 2 times, for `idx = 2`
- ...
- `n-1` time, for `idx = arr.length - 1`

Thus, in the worst case, there are `1+2+...+n-1` = `n*(n-1)/2` executions of the expression `(k >= 0 && arr[k] > backup)`

> Number of iterations in worst case: `n*(n-1)/2`


