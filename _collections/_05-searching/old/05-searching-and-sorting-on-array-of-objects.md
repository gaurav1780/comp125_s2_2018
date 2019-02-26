---
title: "Searching and sorting an array of objects"
---

# Searching and sorting an array of objects

Searching is based on the primite operator `==`. As we have seen, objects cannot (actually, should not) be compared using `==`. Instead, the outcome of `compareTo` must be used.

Assuming that,

1. `a` and `b` are classes of some class `MyClass`,
2. `compareTo` is defined in the class,
3. `compareTo` criteria and sorting criteria are the same.

The expressions need to be changed as:

| Expression to compare variables `a` and `b`  of primitive data types | Equivalent expression to compare objects `a` and `b`  of the same class (assuming instance method compareTo is defined) |
|----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| `a == b`                                                             | `a.compareTo(b) == 0`                                                                                                   |
| `a > b`                                                              | `a.compareTo(b) == 1`                                                                                                   |
| `a < b`                                                              | `a.compareTo(b) == -1`                                                                                                  | 


For each of the three assuming array sorted based on areas
//and compareTo compares based on areas


## Modified binary search

```java
public static int binarySearch(Rectangle[] arr) {
	int first = 0;
	int last = arr.length - 1; 
	while(first <= last) {
		int median = (first+last)/2;
		if(target.compareTo(arr[median]) == 0) 	//same areas 
			return median;
		if(target.compareTo(arr[median]) == 1) 	//target has higher area
			first = median + 1; 		//right
		else 					//target has smaller area
			last = median - 1; 		//left
	}
	return -1;
}
```

## Modified selection sort

```java
public static void selectionSort(Rectangle[] arr) {
	int startIndex = 0;
	while(startIndex < arr.length - 1) {
		//find index of smallest item from index startIndex onwards
		int smallestIndex = getSmallestItemIndex(arr, startIndex);

		//swap the first and smallest items
		Rectangle temp = arr[startIndex];
		arr[startIndex] = arr[smallestIndex];
		arr[smallestIndex] = temp;
		
		//move unsorted range forward by 1
		startIndex++; 
	}
}

public static int getSmallestItemIndex(Rectangle[] data, int firstIndex) {
	int result = firstIndex; 	//assume first item is the smallest item
	for(int i=firstIndex+1; i < arr.length; i++) {
		if(arr[i].compareTo(arr[result]) == -1) {  
		//area of arr[i] is smallest so far
			result = i; 	//update result
		}
	}
	return result;
}
```

## Modified insertion sort

```java
public static void insertionSort(Rectangle[] arr) {
	int idx = 1;
	while(idx < arr.length) {
		Rectangle backup = arr[idx];
		int k = i-1;
		while(k >= 0 && arr[k].compareTo(backup) == 1) {
			arr[k+1] = arr[k]; 	//move item forward
			k--; 			//check item before it
		}
		arr[k+1] = backup; 		//move backup at index of last moved item
	}
}
```