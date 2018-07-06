---
title: Unit Testing
teaching: 120
exercises: 120
questions:
- Unit testing and JUnit
objectives:
- Understand the concept and importance of unit testing
- Get an introduction to JUnit test suite
- Using JUnit test cases effectively
- Writing good-quality JUnit test cases
keypoints:
- Test cases should be comprehensive and test a variety of scenarios including boundary scenarios
- Exceptional scenarios (what happens when input is `null`) should be handled.
---

# What is "unit testing"?

<img src="/fig/cogs.png" alt="cogs in a machine" style="width: 400px;"/>

*A system is but a collection of cogs working together.*

Unit testing allows us to check that each method of our code, individually, works correctly. Of course, it doesn't guarantee that the the methods interact correctly or not.

Unit testing is based on the fundamental assumption that for a given input, there is an expected output. Creating a list of such input-output mappings, we can determine if the method, in fact, works correctly.

Conside a method supposed to return the highest of three numbers. An input-output mapping for such a method is listed below.

| Input      | Output |
|------------|--------|
| 5, 7, 9       | 9      |
| 1, 10, 100 | 100     |
| 0, 0, 0          | 0      |

{: challenge}
> ## Is the above set of mappings sufficient? 
>> ## SOLUTION
>> No, in all cases, the third value is the answer. A method that simply returns the third value will pass this insufficient test
>{: .solution}
{: .challenge}

A more comprehensive set of mappings is provided below.

| Input      | Output |
|------------|--------|
| 5, 7, 9    | 9      |
| 100, 1, 10 | 100    |
| 0, 8, 0    | 8      |
|-5, -100, -1 | -1 |
| -9, -9, 0 | 0 |
| 6, 6, 6 | 6 |

{: challenge}
> ## Write a set of input-output mappings - 1
> Write a set of input-output mappings for a method that when passed an integer, returns `true` if all the digits in the integer are even (0/2/4/6/8), and `false` otherwise.
>> ## SOLUTION
>>> | Input      | Output |
>>> |------------|--------|
>>> | 284666604    | true      |
>>> | 284661604 | false    |
>>> | 148   | false      |
>>> | 227 | false |
>>> | -2486 | true |
>>> | -9486 | false |
>>> | 0 | true |
>{: .solution}
{: .challenge}

{: challenge}
> ## Write a set of input-output mappings - 2
> Write a set of input-output mappings for a method that when passed an integer array, returns `true` if the array is in ascending order (for each item of thearray, the item is less than or equal to the next item (if any)), and `false` otherwise.
>> ## SOLUTION
>>> | Input      | Output |
>>> |------------|--------|
>>> | {5, 8, 12, 100}    | true      |
>>> | {6, 6, 6} | true    |
>>> | {20}   | true      |
>>> | {} | true |
>>> | null | not well-defined |
>>> | {5, 8, 12, 11} | false |
>>> | {6, 4, 4, 8} | false |
>{: .solution}
{: .challenge}

{: challenge}
> ## Write a set of input-output mappings - 3
> Write a set of input-output mappings for a method that when passed an integer array, returns `true` if each item of the array occurs exactly once, and `false` otherwise. Return `false` if the array is `null`.
>> ## SOLUTION
>>> | Input      | Output |
>>> |------------|--------|
>>> | {5, 8, 12, 100}    | true      |
>>> | {6, 6, 6} | false    |
>>> | {20}   | true      |
>>> | {} | true |
>>> | null | false |
>>> | {2, 7, 1, 9, 3, -5, -5} | false |
>>> | {2, -5, 7, 1, 9, 3, -5} | false |
>{: .solution}
{: .challenge}

# JUnit test cases 

JUnit is a unit testing framework for Java. It operates using assertions to determine if a particular test passes or not.

A list of important assertions are given below:

* `assertTrue(boolean expression)`: passes if the boolean expression passed to the assertion is `true`, fails otherwise.


	For example,
	
	
	`assertTrue(5 > 3)` passes
	
	`assertTrue(6 == 12/3)` fails
	
* `assertFalse(boolean expression)`: passes if the boolean expression passed to the assertion is `false`, fails otherwise.


	For example,
	
	
	`assertFalse(2 >= 3)` passes
	
	`assertFalse(6 == 12/2)` fails
	

* `assertEquals(expected integer value, integer expression)`: passes if the integer expression passed to the assertion equals the expected integer value, fails otherwise.


	For example,
	
	
	`assertEquals(5.2, 5.16, 0.05)` passes
	
	`assertEquals(5.2, 5.16, 0.01)` fails
	

* `assertEquals(expected floating-point value, floating-point expression, tolerance)`: passes if the floating-point expression passed to the assertion is within tolerance distance of the expected floating-point value, fails otherwise.

	For example, 
	
	
	`assertEquals(1.2, 1.21, 0.02)` passes
	
	`assertEquals(1.2, 1.23, 0.02)` fails

* `assertNull(reference)`: passes if the reference (object/array) passed to the assertion is `null`, fails otherwise.

	For example, 
	
	
	`assertNull(null)` passes
	
	`assertNull(new int[]{1,7,2,9})` fails

* `assertNotNull(reference)`: passes if the reference (object/array) passed to the assertion is not `null`, fails otherwise.


	For example, 
	
	
	`assertNotNull(new int[]{1,7,2,9})` passes

	`assertNotNull(null)` fails
	

* `assertArrayEquals(expected integer array, actual integer array)`: passes if the actual integer array passed to the assertion equals the expected integer array, fails otherwise.


	For example, 
	
	Assuming three arrays created as following:
	
	```java
	int[] a = {1,7,2,9};
	int[] b = {1,7,2};
	int[] c = {1,7,2,9};
	```
	
	`assertArrayEquals(a,c)` passes

	`assertArrayEquals(a,b)` fails
	
	
## How to write a JUnit test

First you need a method that you need to test. 

Let's take a look at the following code that contains a single method `sumEven`.

<script src="https://gist.github.com/gaurav1780/b3df9f0a24fcf9a0c41cc75cdb8616a3.js"></script>

The JUnit test is a separate class created to 

