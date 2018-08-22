---
title: "Insertion Sort"
---

# Insertion Sort

## Basic principle

The principle behind insertion sort is:

> *Put the first item of the unsorted part at the right place in the sorted part.*

A great video to illustrate insertion sort from our awesome peeps at GeeksForGeeks:

<iframe width="560" height="315" src="https://www.youtube.com/embed/OGzPmgsI-pQ" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

For example, if pipe symbol ( \| ) separates the sorted and the unsorted parts, such that items on the left of \| are sorted and the ones on the right are unsorted, 

Original state: 

>```
>17,| 16, 23, 8, 15
>```

The reason we consider the first item to be sorted initially is because if that's the only item so far, it is in sorted order.

First item in unsorted part: `16`. Right place for it: before `17`.

After first iteration:

>```
>16, 17,| 23, 8, 15
>```

First item in unsorted part: `23`. Right place for it: after `17`.

After second iteration:

>```
>16, 17, 23,| 8, 15
>```

First item in unsorted part: `8`. Right place for it: before `16`.

After third iteration:

>```
>8, 16, 17, 23,| 15
>```

First item in unsorted part: `15`. Right place for it: before `16`

After fourth iteration:

>```
>8, 15, 16, 17, 23
>```


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

Lets say the current state of the array is:

>```
>16, 17, 23,| 8, 15
>```

Item 8 needs to be inserted at the right place. All items before it (16, 17 and 23) need to move forward.

If we move 16 forward, the array will become

>```
>16, 16, 23, 8, 15
>```

and we'll lose 17 completely.

However, if we begin moving from right to left, we can move 23 first.

>```
>16, 17, 23, 23, 15
>```

Losing 8 is ok as we have kept in backup.

We can then move 17

>```
>16, 17, 17, 23, 15
>```

And finally 16

>```
>16, 16, 17, 23, 15
>```

We can now move our backup at the index of the last item moved.

>```
>8, 16, 17, 23, 15
>```

Thereby, moving 8 in its rightful place.


Java code is written as:

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

## Insertion sort performance analysis

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


