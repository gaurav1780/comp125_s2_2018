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


# Incomplete list of links
navigation:
- id: Welcome to the unit
- id: Pen and paper methodology
- id: Compiling and running java programs from command prompt or terminal
- id: Java
- id: Software to install and first program
- id: Some problem solving to revise COMP115/WCOM115
---
* Table of contents.
{:toc}
{::options parse_block_html="true" /}

{% for item in site.data.navigation-list.navigation %}
    {{item.id}}
    {% for link in item.links %}
        {{link}}
    {% endfor %}
{% endfor %}

<div class="content-toggle">
# Welcome to the unit
</div>

<div class="collapsible-content">
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
</div>

<div class="content-toggle">
# Pen and paper methodology
</div>

<div class="collapsible-content">
In the unit, we shall be doing a lot of work on computers, where your programs are auto-marked by the machine and instant feedback is given. However, one skill is critical for good understanding of programming and improving problem solving skills -

We will start with trace of some programs to establish what we expect students to do while tracing through code.

{: .challenge}
> ## Tracing conditions
> Trace the flow of the following program and determine the value of `result` at the end of it.
> <script src="https://gist.github.com/gaurav1780/767824769b5456ddb080e63d84124d70.js"></script>
> > ## Solution
> >`a < b` is `true`
> >
> >`b % a == 0` is `true`
> >
> >`a % 2 == 0` is `false`
> >
> >The expression becomes `true && true && false`
> >
> >This is `false`
> >
> >Hence, the `else` block executes and `result` becomes `b (10)`.
> {: .solution}
{: .challenge}

---

{: .challenge}
> ## Tracing conditions
> Trace the flow of the following program and determine the value of `result` at the end of it.
> <script src="https://gist.github.com/gaurav1780/0f335474bbbf8fcf488150b7b411c33a.js"></script>
> > ## Solution
> >`a == b` is `false`,
> >
> > `else` executes
> >  
> > `b` decreases by 5, becomes 5
> > `a == b` is `true`.
> > `if` block executes and `result` becomes `b (5)`.
> {: .solution}
{: .challenge}


{: .challenge}
> ## Tracing condition and loop
> Trace the flow of the following program and determine the value of `result` at the end of it.
> <script src="https://gist.github.com/gaurav1780/0302ce7e20a43b1807584b4ca7f49ce7.js"></script>
> > ## Solution
> > > | i | i&lt;=7 | i%2 | i%2==1 | result |
> > > | --- | --- | --- | --- | --- |
> > > | 1 | true | 1 | true | -3+1 = -2 |
> > > | 2 | true | 0 | false | |
> > > | 3 | true | 1 | true | -2+3 = 1 |
> > > | 4 | true | 0 | false | |
> > > | 5 | true | 1 | true | 1+5 = 6 |
> > > | 6 | true | 0 | false | |
> > > | 7 | true | 1 | true | 6+7 = 13 |
> > > | 8 | false | | | |
> {: .solution}
{: .challenge}

{: .challenge}
> ## Tracing nested conditions
> Trace the flow of the following code -
> <script src="https://gist.github.com/gaurav1780/0b8969cabc916cff8ed88cfcde631560.js"></script>
> > ## Solution
> > At the end of the code,
> > `a = 5`, `b = 10`, `c = 2`, `d = false`, `result = 10`.
> > Explanation -
> > <script src="https://gist.github.com/gaurav1780/7edd01a8e4ae3182e3ddd7f6166a0e53.js"></script>
> {: .solution}
{: .challenge}

</div>

<div class="content-toggle">
# Compiling and running java programs from command prompt or terminal
</div>

<div class="collapsible-content">
After installing Java SDK, you can write a code in a basic text editor (like notepad, atom, sublime) and then compile and run Java programs from command prompt or terminal.

A java source file `HelloWorld.java` is compiled as

~~~
javac HelloWorld.java
~~~
{: .bash}

Once it is compiled, there will be java class file generated with name `HelloWorld.class`. What you execute is this class file, as,

~~~
java HelloWorld
~~~
{: .bash}

This is a good skill and the benefit of doing this over using an IDE like Eclipse include,

1. reducing reliance on auto-complete done by Eclipse.

2. not relying on Eclipse to tell you each time there is a syntactical error.

3. program will not compile, and therefore the class file will not be generated to execute if there is a syntactical error.

4. Helps with pen and paper design.

Let's say, following are the contents of `HelloWorld.java`

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

</div>

<div class="content-toggle">
# Java
</div>

<div class="collapsible-content">
Some history about Java as a programming language follows.

* Java was developed at Sun Microsystems, and most of the work was carried out between 1991 and 1995.

* The development team included James Gosling, Mike Sheridan, Patrick Naughton, and their colleagues.

* Java 1.0 was released in 1995.

* Java has a C/C++ style compiler.

* It is the most popular programming language \(by far\) according to TIOBE index.

## How a java program compiles and executes

![](/fig/javaCompileExecute.png)
</div>

<div class="content-toggle">
# Software to install and first program
</div>

<div class="collapsible-content">
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

~~~
Hello world!
~~~
{: .output}

<iframe width="560" height="315" src="https://www.youtube.com/embed/Atxj7fwu5Uk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>


{: .challenge}
> ## Write a simple java program
> Write a java program that initializes two variables, `distance`, `time`, and give
> them values of your choice. Calculate the speed and display on the console.
> Compile and run the java program.
> > ## Solution
> > <script src="https://gist.github.com/gaurav1780/905f1681f5c75e60a7a4f3715355e14f.js"></script>
> {: .solution}
{: .challenge}

{: .challenge}
> ## Debug a simple program
> What's wrong with the following code?
>
> ```java
> public class Worker {
>	public static void main(String[] args) {
>	}
>	System.out.println("How do you do?");
>}
>```
>
> > ## SOLUTION
> > Display statement exists outside the `main` method.
> > Corrected version:
> >
> >```java
> >public class Worker {
> >	public static void main(String[] args) {
> >		System.out.println("How do you do?");
> >	}
> >}
> >```
> {: .solution}
{: .challenge}


{: .challenge}
> ## Debug a simple program
> What's wrong with the following code?
>
> ```java
> public static void main(String[] args) {
> 	public class Worker {
> 		System.out.println("All right!");
>	}
>}
>```
>
> > ## SOLUTION
> > `main` should be inside the `class`, not the other way round.
> > Corrected version:
> >
> > ```java
> > public class Worker {
> > 	public static void main(String[] args) {
> > 		System.out.println("All right!");
> > 	}
> > }
> > ```
> {: .solution}
{: .challenge}

{: .challenge}
> ## Debug a simple program
> What's wrong with the following code?
>
> ```java
> public class Worker {
> 	public static void main(String[] args) {
>		System.out.println("Wassup!")
>	}
> }
> ```
>
> > ## SOLUTION
> > Missing semi-colon at the end of line 3.
> > Corrected version:
> >
> > ```java
> > public class Worker {
> > 	public static void main(String[] args) {
> > 		System.out.println("Wassup!");
> > 	}
> > }
> > ```
> {: .solution}
{: .challenge}  


## First java program in Eclipse

<iframe width="560" height="315" src="https://www.youtube.com/embed/8DcIQcmwuSE" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

## Adding more functions to a java program

You will notice that the `main` function is labelled `static` by Java. Your program will not run if you remove this keyword. A function being `static` means that the only data it operates on (if any) are the parameters passed.

Equivalent versions of the same function in `Processing` and `Java` are provided below -

| Processing                                                                                      | Java |
|-------------------------------------------------------------------------------------------------|------|
| <script src="https://gist.github.com/gaurav1780/b3653c5a7bc5b8918bae111279542573.js"></script> |    <script src="https://gist.github.com/gaurav1780/b9c62caf13fa64d008ee6770525158af.js"></script> |


The `public` keyword is for consistency and will be used for all functions unless explicitly specified to be `private` \(again, more about this in week 2 and 3\).

<iframe width="560" height="315" src="https://www.youtube.com/embed/XS48hrWdm4Y" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
</div>

<div class="content-toggle">
# Some problem solving to revise COMP115/WCOM115
</div>

<div class="collapsible-content">
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

## How a java program compiles and executes

Test

</div>
