---
title: "Motivation for searching and sorting algorithms"
---

# Motivation for searching and sorting algorithms

## Searching algorithms

Searching for *something* is one of the most fundamental operations on
which more complex algorithms are based. 

Consider some of the following real-life scenarios (you can stop when you are convinced that searching is a critical operation),

-   Check if a particular student is enrolled in a unit.

-   Check if there are any items between a certain price range in the
    bill.

-   Compute the number of debit transactions over a certain amount in
    your monthly credit card statement.

-   Determine a mutually suitable time for a meeting between 2 people
    (and more broadly $n$ people) based on their calendars.

-   Determine the number of public holidays on a Friday/Monday (Yes!)

-   Find the number of rows in a spreadsheet that have a keyword in it.

-   Find the number of rows in a spreadsheet that have any one of $n$
    keywords in it.

-   Find the number of rows in a spreadsheet that have every one of $n$
    keywords in it.

All these problems rely on searching through some data set.

So, it’s really very simple! You need searching to become good at
algorithms that build on top of it.

## Sorting algorithms

Sorting makes searching incredibly easy! Yes, that's about it.

### Example 1

You need to check if an array contains any item that occurs more than twice. 

#### Solution with an unsorted array :(

Without sorting the array, you'll need to implement a classic *handshake algorithm* given below,

```java
public static boolean containsDuplicateUnsorted(int[] data) {
	for(int i=0; i < data.length; i++) {
		for(int k=i+1; k < data.length; k++) {
			if(data[i] == data[k]) {
				return true;
			}
		}
	}
	return false;
}
```

#### Solution with an sorted array :)

But if you assume that the array is sorted (in this case it doesn't matter whether it's sorted in ascending or descending order), the code becomes incredibly easy, as multiple occurrences of an item (if present) would be next to each other.

```java
public static boolean containsDuplicateSorted(int[] data) {
	for(int i=0; i < data.length - 1; i++) {
		if(data[i] == data[i+1]) {
			return true;
		}
	}
	return false;
}
```

### Example 2

Finding if two arrays have the same items is much easier if you sort the arrays and them compare for them being identical.

>{10, 40, 20, 90} and {90, 20, 10, 40} have the same items

>{10, 40, 20, 90} and {90, 20, 30, 40} do not have the same items

#### Solution with unsorted arrays :(

```
public static boolean sameItemsUnsorted(int[] a, int[] b) {
	if(a.length != b.length)
		return false;
	for(int i=0; i < a.length; i++) {
		if(count(a, a[i]) != count(b, a[i])) {
			return false;
		}
	}
	return true;
}

//helper
public static int count(int[] data, int item) {
	int result = 0;
	for(int i=0; i < data.length; i++) {
		if(data[i] == item) {
			result++;
		}
	}
	return result;
}
```

#### Solution with sorted arrays :)

```
public static boolean sameItemsSorted(int[] a, int[] b) {
	if(a.length != b.length)
		return false;
	for(int i=0; i < a.length; i++) {
		if(a[i] != b[i]) {
			return false;
		}
	}
	return true;
}
```

**Case 1**: Comparing `{10, 70, 20, 90}` with `{10, 70, 20, 90}`

>Compare first items
>
><span style="color:green">10</span>	70	20	90
>
><span style="color:green">10</span>	70	20	90

<p>&nbsp;</p>

>Compare second items
>
>10	<span style="color:green">70</span>	20	90
>
>10	<span style="color:green">70</span>	20	90

<p>&nbsp;</p>

>Compare third items
>
>10	70	<span style="color:green">20</span>	90
>
>10	70	<span style="color:green">20</span>	90

<p>&nbsp;</p>

>Compare fourth items
>
>10	70	20	<span style="color:green">90</span>
>
>10	70	20	<span style="color:green">90</span>

<p>&nbsp;</p>

>return `true`

**Case 2**: Comparing `{10, 70, 20, 90}` with `{10, 80, 20, 90}`

>Compare first items
>
><span style="color:green">10</span>	70	20	90
>
><span style="color:green">10</span>	80	20	90

<p>&nbsp;</p>

>Compare second items
>
>10	<span style="color:red">70</span>	20	90
>
>10	<span style="color:red">80</span>	20	90

<p>&nbsp;</p>

>return `false`
{: challenge}
> ## Define a method that returns the highest number in an unsorted array. Return 0 if array is null or empty.
>> ## SOLUTION
 ```java
 public static int highestUnsorted(int[] arr) {
 	if(arr == null || arr.length == 0) {
 		return 0;
 	}
 	int result = arr[0];
 	for(int i=1; i < arr.length; i++) {
 		if(arr[i] > result) {
 			result = arr[i];
		}
 	}
	return result;
 }
 ```
>{: .solution}
{: .challenge}

{: challenge}
> ## Define a method that returns the highest number in an array sorted in ascending order. Return 0 if array is null or empty.
>> ## SOLUTION
 ```java
 public static int highestSorted(int[] arr) {
 	if(arr == null || arr.length == 0) {
 		return 0;
 	}
 	return arr[arr.length-1]; //last item is the highest item
 }
 ```
>{: .solution}
{: .challenge}

### Cost of sorting needs to be recognized

Of course, sorting involves a one-time fixed-cost of sorting the array, but the ongoing or variable cost of these operations reduces considerablly.