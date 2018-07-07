---
title: Introduction
teaching: 120
exercises: 120
questions:
- "Introduction to COMP125 structure and contents"
objectives:
- "Understand the benefits of an automated version control system."
- "Understand the basics of how Git works."
keypoints:
- A typical java source file named `Hello.java` has a class named `Hello` that contains a `main` method that contains your code.
- A java source file named `Hello.java` is compiled to a class file named `Hello.class` using the command `javac Hello.java`.
- A java class file named `Hello.class` is executed on the Java Virtual Machine using the command `java Hello` (no `.class`).
---
# Welcome to the unit

This is the second-programming unit and is taught using Java as a programming language. The focus of the unit is on,

1. problem solving

2. classes and objects

3. searching and sorting algorithms and their performance

4. recursive algorithms

5. data structures

## Information specific to current offering

Please refer to the unit guide available at [http://unitguides.mq.edu.au/units](http://unitguides.mq.edu.au/units) for information specific to current offering. This includes,

1. Teaching staff

2. Unit schedule

3. Assessment tasks

4. Passing requirements

5. Important dates, including assessment deadlines

6. Academic honesty policy

# Pen and paper methodology

In the unit, we shall be doing a lot of work on computers, where your programs are auto-marked by the machine and instant feedback is given. However, one skill is critical for good understanding of programming and improving problem solving skills -

We will start with trace of some programs to establish what we expect students to do while tracing through code.

Trace the flow of the following program and determine the value of`result`at the end of it.

```java
int a = 5, b = 10;
int result;
if(a < b && b % a == 0 && a % 2 == 0) {
	result = a;
}
else {
	result = b;
}
```

>`a < b` is `true`
>
>`b % a == 0` is `true`
>
>`a % 2 == 0` is `false`
>
>The expression becomes `true && true && false`
>
>This is `false`
>
>Hence, the `else` block executes and `result` becomes `b (10)`.

---

Trace the flow of the following program and determine the value of `result` at the end of it.

```java
int a = 5, b = 10;
int result = 0;
if(a == b) {
	result = a;
}
else {
	b = b - a;
	if(a == b) {
		result = b;
	}
}
```

`a == b` is `false`, else executes `b` decreases by 5, becomes 5
`a == b` is `true`. Hence, the `if` block executes and `result` becomes `b (5)`.

Trace the flow of the following program.

```java
int result = -3;
for(int i=1; i <= 7; i++) {
	if(i%2 == 1) {
		result = result + i;
	}
}
```

SOLUTION (using a logic table)

| i | i&lt;=7 | i%2 | i%2==1 | result |
| --- | --- | --- | --- | --- |
| 1 | true | 1 | true | -3+1 = -2 |
| 2 | true | 0 | false | |
| 3 | true | 1 | true | -2+3 = 1 |
| 4 | true | 0 | false | |
| 5 | true | 1 | true | 1+5 = 6 |
| 6 | true | 0 | false | |
| 7 | true | 1 | true | 6+7 = 13 |
| 8 | false | | | |

Trace the flow of the following program.

```java
int a = 4, b = 12, c = 3;
boolean d = false;
int result = 4;
if(a > b || b % c == 0) {
	if(d == true) {
		result = result + 1;
	}
	else {
		result = result - 1;
	}
	result = result * 2;
}

if(d == false && a == b/c) {
	result = result + 1;
	a = a + 1;
	d = true;
}

if(d == false && a == b/c) {
	result = result + 2;
}
else {
	b = b - 2;
	c = c - 1;
	d = false;
}

if(d == false && a == b/c) {
	result = result + 3;
}
```

```java
int a = 4, b = 12, c = 3;
boolean d = false;
int result = 4;
if(a < b || b % c == 1) {
	//a < b: false, b%c==0: true, false || true: true
	if(d == true) { //false == true: false
		result = result + 1;
	}
	else { //else block executes
		result = result - 1; //result becomes 4 - 1 = 3
	}
	result = result * 2; //result becomes 3 * 2 = 6
}

if(d == false && a == b/c) {
	//false==false: true, 4 == 12/3: true, true && true: true
	result = result + 1; //result becomes 6 + 1 = 7
	a = a + 1; //a becomes 4 + 1 = 5
	d = !d; //d becomes !false (true)
}

if(d == false && a == b/c) {
	//true==false: false, false && anything: false
	result = result + 2;
}
else { //else block executes
	b = b - 2; //b becomes 12-2 = 10
	c = c - 1; //c becomes 3-1 = 2
	d = !d; //d becomes !true (false)
}

if(d == false && a == b/c) {
	//false==false: true, 5==10/2: true, true&&true: true
	result = result + 3; //result becomes 7+3 = 10
}
/*
at the end:
a = 5
b = 10
c = 2
d = false
result = 10
*/
```

# Compiling and running java programs from command prompt or terminal
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

You can see that it points to the line number \(3\) with syntactical errors so you can correct them. In this case, we change the`5+`to`5+3`, and our program compiles, and executes, successfully.

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(5+3);
	}
}
```

# Java

Some history about Java as a programming language follows.

* Java was developed at Sun Microsystems, and most of the work was carried out between 1991 and 1995.

* The development team included James Gosling, Mike Sheridan, Patrick Naughton, and their colleagues.

* Java 1.0 was released in 1995.

* Java has a C/C++ style compiler.

* It is the most popular programming language \(by far\) according to TIOBE index.

## How a java program compiles and executes

![](/fig/javaCompileExecute.png)

# Software to install and first program

Install the following software **in the order below**. You will be asked to choose your operating system for each software, and whether it's 32-bits or 64-bits. If not sure, use this [link](http://www.computerhope.com/issues/ch001121.htm) to determine the same.

1. Java Standard Development Kit (Java SDK), also called Java Standard Edition (Java SE). On the date of writing this document, the current version is 9u04 (version 9, update 4). You'll be fine as long as you have version 8 or above.

[Java SE Download Link](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

2. Eclipse IDE **for Java developers**.

[Eclipse IDE Download Link](https://eclipse.org/downloads/)

**NOTE:** You are free to use any other IDE besides Eclipse (such as NetBeans or IntelliJ) if you want. However, we shall be doing all screencasts and video tutorials using Eclipse.

## First java program

Once you have installed Java SE, you are ready to write and run Java programs. First we'll learn how to write and run a java program from command prompt.

Open notepad and type the following code in it.

```java
public class MyFirstProgram {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}
```

Save the file as `MyFirstProgram.java` \(case sensitive\).

Open command prompt \(or terminal on Mac\), go to the folder in which `MyFirstProgram.java` exists, and type the following:

~~~
javac MyFirstProgram.java
~~~
{: .bash}

> This is the *compilation* step.

If everything went ok, it would execute this command and generate a new file named `MyFirstProgram.class` in the same directory as`MyFirstProgram.java`. This is the *classfile* or *bytecode*. It's this file that actually executes. Once it's generated, you can even delete the source file \(`MyFirstProgram.java`\) provided you don't need to make any further changes\).

You run the classfile using the `java` command.

~~~
java MyFirstProgram
~~~
{: .bash}

> This is the *execution* step.

If there are no run-time errors, you will get the following output on the console.

```
Hello world!
```

<iframe width="560" height="315" src="https://www.youtube.com/embed/Atxj7fwu5Uk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>


{: .challenge}
> ## Write a simple java program
> Write a java program that initialises two variables,`distance, time`and give 
> them values of your choice. Calculate the speed and display on the console. 
> Compile and run the java program.
> > ## Solution
> > ```java
> > public class NeedForSpeed {
> > 	public static void main(String[] args) {
> > 		double distance = 34;
> > 		double time = 21;
> > 		double speed = distance/time;
> > 		System.out.println(speed);
> > 	}
> > }
> > ```
> {: .solution}
{: .challenge}

What's wrong with the following code?

```java
public class Worker {
	public static void main(String[] args) {
	}
	System.out.println("How do you do?");
}
```

Display statement exists outside the`main`method.

```java
public class Worker {
	public static void main(String[] args) {
		System.out.println("How do you do?");
	}
}
```

What's wrong with the following code?

```java
public static void main(String[] args) {
	public class Worker {
		System.out.println("How do you do?");
	}
}
```

`main`should be inside the`class`, not the other way round.

```java
public class Worker {
	public static void main(String[] args) {
		System.out.println("How do you do?");
	}
}
```

What's wrong with the following code?

```java
public class Worker {
	public static void main(String[] args) {
		System.out.println("How do you do?")
	}
}
```

Missing semi-colon at the end of line 3.

## First java program in Eclipse

<iframe width="560" height="315" src="https://www.youtube.com/embed/8DcIQcmwuSE" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

## Adding more functions to a java program

You will notice that the `main `function is labelled `static `by Java. Your program will not run if you remove this keyword. A function being static means that it doesn't need an object on which it operates \(more about this in week 2 and 3\), rather it's a stand-alone function. If you wish to add more functions in an *object-less* environment, those functions must be labelled `static `as well. So while in Processing, you would have defined a function as,

```java
boolean isPositive(int n) {
	if(n > 0)
		return true;
	else
		return false;
}
```

In Java, we write it as,

```java
public static boolean isPositive(int n) {
	if(n > 0)
		return true;
	else
		return false;
}
```

The`public`keyword is for consistency and will be used for all functions unless explicitly specified to be`private`\(again, more about this in week 2 and 3\).

<iframe width="560" height="315" src="https://www.youtube.com/embed/XS48hrWdm4Y" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

# Some problem solving to revise COMP115/WCOM115

## Problem 1: Determining if a given integer is prime

What is a prime number?_A number more than 1 that is divisible only by 1 and itself.

```
Is 37 a prime number?
Is 37 divisible by 2? No. So we carry on
...
Is 37 divisible by 36? No. This means 37 is not divisible by
any integer besides 1 and 37.
Thus, 37 is a prime number.
```

```
Is 77 a prime number?
Is 77 divisible by 2? No. So we carry on
...
Is 77 divisible by 7? Yes. This means 77 is divisible by
another integer besides 1 and 77.
Therefore, it's not a prime number.
```

**NOTE:**You can see that this is a kind of `violation` algorithm, where we continuously look for a violation (existence non-trivial divisor) to the problem in context (primality). As soon as a violation is encountered, our algorithm can exit with `failure (false)`status. Only if **no** violations are found, can the algorithm exit with `success (true)`status. The algorithm is,

```
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
```

The equivalent Java code would be,

```java
public static boolean isPrime(int n) {
	if(n < 2) {
		return false;
	}
	for(int i=2; i < n; i++) {
		if(n % i == 0) { //violation
			return false;
		}
	}
	//end of loop, no non-trivial divisor found
	return true;
}
```

Note: we really need to check only until $$\sqrt{n}$$ instead of `n-1`.

The way we can call this function from another function (say `main`) is as follows,


```java
public static void main(String[] args) {
	int num = 56;
	boolean np = isPrime(num);
	System.out.println(np);
}
```

## Problem 2: Determining if a String contains any space

As opposed to the prime checking example, this is a `validation` algorithm, where we look for a validation, and as soon as one is found, we can return `true`. If there is no validation found, then, at the end, we can return `false`.

```java
public static boolean containsSpace(String s) {
	for(int i=0; i < s.length(); i++) {
		if(s.charAt(i) == ' ') { //validation
			return true;
		}
	}
	//end of loop, no character is a space
	return false;
}
```

## Problem 3: Calculating the total of all items of an integer array

The process for this one is to go through each item of the array, and add it to a variable that should store the total

```java
public static int total(int[] a) {
	int result = 0;
	for(int i=0; i < a.length; i++) {
		result+=a[i];
	}
	return result;
}

public static void main(String[] args) {
	int[] taxicab = {1, 7, 2, 9};
	int myTotal = total(taxicab);
	System.out.println(myTotal);
}
```

This problem can be extended to more specific problems such as,

1. finding total of all even numbers in an integer array

2. finding total of all positive items in an integer array

3. finding total of all items above a certain value in an integer array

4. finding total of negative items in the first half of the array

Solutions for 1 and 4 are given below.

```java
public static int totalEven(int[] a) {
	int result = 0;
	for(int i=0; i < a.length; i++) {
		if(a[i] % 2 == 0) {
			result+=a[i];
		}
	}
	return result;
}
```

```java
public static int totalFirstHalfNegatives(int[] a) {
	int result = 0;
	for(int i=0; i < a.length/2; i++) {
		if(a[i] < 0) {
			result+=a[i];
		}
	}
	return result;
}
```

# Compiling and running java programs from command prompt / terminal

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
```



