---
title: "What is recursion?"
---

# What is recursion?

There are two classical approaches to solving algorthmic problems:

1. Iterative
2. Recursive

## Iterative solution

The distinctive property of *iterative* solutions is that they do not reduce a problem to a simpler form of itself.

### EXAMPLE 

Add all integers between `low` and `high` (inclusive on both sides, and assuming `low` <= `high`), I can go through each integer and add it to an accumulating variable, say `total`.

```java
public static int sum(int low, int high) {
	if(low % 2 != 0) {
		low++;
	}
	int total = 0;
	for(int i=low; i<=high; i++) {
		total = total + i;
	}
	return total;	
}
```

## Recursive solution

The distinctive property of *recursive* solutions is that they reduce a problem to a simpler form of itself.

### EXAMPLE

For the same problem statement used for iterative solutions, we can say that the sum of all integers from `low` to `high` is:

```
if low <= high: 
	sub = sum of all integers from (low+1) to high
	return (low + sub)
else
	return 0
```

Focus on the part 

>```
>sum of all integers from `low+1` to `high`
>```

It is the same problem as the original problem, except there is one less number to handle, and thus is *simpler*.

## Equivalence

It has been proven that there is a recursive solution for every iterative solution and vice versa. We will soon look at some of the aspects to consider while deciding on which approach to take.