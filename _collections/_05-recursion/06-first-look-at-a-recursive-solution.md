---
title: "First look at a recursive solution"
---

# First look at a recursive solution

### PROBLEM STATEMENT

Define a method that when passed an integer, returns the sum of all integers from 1 to that integer.

Examples:

> Input = 4 -> return 1 + 2 + 3 + 4 (10)

> Input = 6 -> return 1 + 2 + 3 + 4 + 5 + 6 (21)

Let's call the method `sum` and the the formal parameter `n`

> sum(n) = 1 + 2 + ... + (n-1) + n

can be written as:

> sum(n) = [1 + 2 + ... + (n-1)] + n

But 

> [1 + 2 + ... + (n-1)] is sum(3) 

(by the problem statement)

Hence,

> sum(n) = sum(n-1) + n

### First attempt

```java
public static int sum(int n) {
	return sum(n-1) + n;
}
```

But this version will result in the method calling itself indefinitely, until JVM causes `StackOverflowError`. We need to address the end case:

> sum(0) = 0

### Seond attempt

```java
public static int sum(int n) {
	if(n == 0) {
		return 0;
	}
	//control reaches here only if n is not 0
	return sum(n-1) + n;
}
```

What happens if the client, maliciously, calls the method with parameter -3?

sum(-3) -> sum(-4) -> sum(-5) ...

Since the parameter is never equal to 0, the method, when initially called with a negative value, calls itself indefinitely, until JVM causes `StackOverflowError`.

### Third (and correct) version

```java
public static int sum(int n) {
	if(n <= 0) { //return 0 for anything less than 1
		return 0;
	}
	//control reaches here only if n is more than 0
	return sum(n-1) + n;
}
```

### Trace

```
sum(4)	= sum(3) + 4
```

```
	sum(3)	= sum(2) + 3
```

```
		sum(2)	= sum(1) + 2
```

```
			sum(1) = sum(0) + 1
```

```
				sum(0)	returns 0 (terminal case)
```

```
			sum(1) returns 0 + 1 (1)
```

```
		sum(2) returns 1 + 2 (3)
```

```
	sum(3) returns 3 + 3 (6)
```

```
sum(4) returns 6 + 4 (10)
```

### Summarized trace

```
main(null) calls sum(4)
	sum(4) calls sum(3)
		sum(3) calls sum(2)
			sum(2) calls sum(1)
				sum(1) calls sum(0)
				sum(0) returns 0 to sum(1)
				sum(1) adds 1 to the received value (0) and returns 1 to sum(2)
			sum(2) adds 2 to the received value (1) and returns 3 to sum(3)
		sum(3) adds 3 to the received value (3) and returns 6 to sum(4)
	sum(4) adds 4 to the received value (6) and returns 10 to main()
main(null) uses the received value (10) as needed
```				

{: challenge}
> ## Define a method that returns number of digits in the integer passed. Return 0 if the integer passed is 0. Tip: when a number is divided by 10,   we get a number without its last digit.
>> ## SOLUTION
>>> ```java
>>> public static int nDigits(int n) {
>>> 	if(n == 0)
>>> 		return 0;
>>> 	int numberWithoutLastDigit = n/10;
>>> 	return 1 + nDigits(numberWithoutLastDigit);
>>> }
>>> ```
>{: .solution}
{: .challenge}