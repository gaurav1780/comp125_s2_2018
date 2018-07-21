---
title: COMP115 recap
---
# Some problem solving to revise COMP115/WCOM115

## Problem 1: Determining if a given integer is prime

What is a prime number?_A number more than 1 that is divisible only by 1 and itself._

~~~
Is 37 a prime number?
Is 37 divisible by 2? No. So we carry on
...
Is 37 divisible by 36? No. This means 37 is not divisible by
any integer besides 1 and 37.
Thus, 37 is a prime number.
~~~
{: .output}

~~~
Is 77 a prime number?
Is 77 divisible by 2? No. So we carry on
...
Is 77 divisible by 7? Yes. This means 77 is divisible by
another integer besides 1 and 77.
Therefore, it's not a prime number.
~~~
{: .output}

**NOTE:** You can see that this is a kind of `violation` algorithm, where we continuously look for a violation (existence non-trivial divisor) to the problem in context (primality). As soon as a violation is encountered, our algorithm can exit with `failure (false)` status. Only if **no** violations are found, can the algorithm exit with `success (true)`status. The algorithm is,

~~~
INPUT: Integer n
PROCESS:
if n is less than 2
begin condition
	OUTPUT false (integers less than 2 are not primes)
end condition

for integer candidate from 2 to n-1
begin loop
	if n is divisible by candidate
	begin condition
		OUTPUT false (as a non-trivial divisor was found)
	end condition
end loop
~~~
{: .output}

The equivalent Java code would be,

<script src="https://gist.github.com/gaurav1780/dfe61c931d2b637931ffcd4a4d25f765.js"></script>

Note: we really need to check only until square root of `n` instead of `n-1`.

The way we can call this function from another function (say `main`) is as follows,

<script src="https://gist.github.com/gaurav1780/2f84e7676a8fc2009b9c7df8b3bad1a6.js"></script>

## Problem 2: Determining if a String contains any space

As opposed to the prime checking example, this is a `validation` algorithm, where we look for a validation, and as soon as one is found, we can return `true`. If there is no validation found, then, at the end, we can return `false`.

<script src="https://gist.github.com/gaurav1780/a70018542384418de6724f5c5b9acd45.js"></script>


## Problem 3: Calculating the total of all items of an integer array

This is an `accumulation` algorithm. We go through each item of the array, and add it to a variable that stores the total.

<script src="https://gist.github.com/gaurav1780/990f005dee2573083528b3d0e6283a3f.js"></script>

Once we know how to do this, we can apply this to other problems such as,

{: .challenge}
> ## Finding total of all even numbers in an integer array
> Define a method that when passed an array, returns the sum of all even numbers in the array
> > ## Solution
> > <script src="https://gist.github.com/gaurav1780/b1abbb1a3bab1ef55c1c0cf4815482b9.js"></script>
> {: .solution}
{: .challenge}

{: .challenge}
> ## Finding total of all positive items in an integer array
> Define a method that when passed an integer array, returns the sum of all positive numbers in the array.  Solution is not provided for this problem.
{: .challenge}

{: .challenge}
> ## Finding total of all items above a certain value in an integer array
> Define a method that when passed an integer array and another integer (say `val`), returns the sum of all items numbers in the array that are **more than** `val`. Solution is not provided for this problem.
{: .challenge}


{: .challenge}
> ## Finding total of negative items in the first half of the array
> Define a method that when passed an integer array, returns the sum of all negative numbers in the first half of the array. For example, if array is `{-6, -8, -1, -2, 9}`, return `-14`, and if array is `{-6, -5, -8, -12, -1, 9}`, return `-19`.
> > ## Solution
> > <script src="https://gist.github.com/gaurav1780/671b713a16b53872f45a36c1659464ea.js"></script>
> {: .solution}
{: .challenge}

<!--# Compiling and running java programs from command prompt / terminal

After installing Java SDK, you can write a code in a basic text editor (like notepad, atom, sublime) and then compile and run Java programs from command prompt or terminal.

A java source file`HelloWorld.java`is compiled as

~~~
javac HelloWorld.java
~~~
{: .bash}

Once it is compiled, there will be java class file generated with name`HelloWorld.class`. What you execute is this class file, as,

~~~
java HelloWorld
~~~
{: .bash}

This is a good skill and the benefit of doing this over using an IDE like Eclipse include,

1. reducing reliance on auto-complete done by Eclipse.

2. not relying on Eclipse to tell you each time there is a syntactical error.

3. program will not compile, and therefore the class file will not be generated to execute if there is a syntactical error.

4. Helps with pen and paper design.

Let's say, following are the contents of`HelloWorld.java`

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(5+);
	}
}
```

When you compile the program, you'll get the following message,

~~~
I-2:intro gauravgupta$ javac HelloWorld.java
HelloWorld.java:3: error: illegal start of expression
System.out.println(5+);
^
1 error
I-2:intro gauravgupta$
~~~
{: .bash}

You can see that it points to the line number \(3\) with syntactical errors so you can correct them. In this case, we change the `5+` to `5+3`, and our program compiles, and executes, successfully.

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(5+3);
	}
}
```-->
