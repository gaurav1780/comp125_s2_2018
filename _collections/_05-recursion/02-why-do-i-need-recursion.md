---
title: "Motivation for searching and sorting algorithms"
---

# Why should I use recursion?

## Advantages

1. Some solutions have an intuitive recursive design. Some examples (we assume n >= 0 for all examples):

	1. x<sup>n</sup> = x<sup>n-1</sup> * x (if n > 0, or 1 if n == 0)
	2. `nDigits(n)` = `nDigits(n/10) + 1` (if n > 0, or 0 if n == 0)
	3. `sum(n) = sum(n-1) + n` if(n > 0, or 0 if n == 0)

2. 
>return `false`
{: challenge}
> ## Define a method that returns the highest number in an unsorted array. Return 0 if array is null or empty.
>> ## SOLUTION
>>> ```java
>>> public static int highestUnsorted(int[] arr) {
>>> 	if(arr == null || arr.length == 0) {
>>> 		return 0;
>>> 	}
>>> 	int result = arr[0];
>>> 	for(int i=1; i < arr.length; i++) {
>>> 		if(arr[i] > result) {
>>> 			result = arr[i];
>>>		}
>>> 	}
>>>	return result;
>>> }
>>> ```
>{: .solution}
{: .challenge}

{: challenge}
> ## Define a method that returns the highest number in an array sorted in ascending order. Return 0 if array is null or empty.
>> ## SOLUTION
>>> ```java
>>> public static int highestSorted(int[] arr) {
>>> 	if(arr == null || arr.length == 0) {
>>> 		return 0;
>>> 	}
>>> 	return arr[arr.length-1]; //last item is the highest item
>>> }
>>> ```
>{: .solution}
{: .challenge}

### Cost of sorting needs to be recognized

Of course, sorting involves a one-time fixed-cost of sorting the array, but the ongoing or variable cost of these operations reduces considerablly.