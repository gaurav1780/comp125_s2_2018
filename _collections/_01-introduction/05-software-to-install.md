---
title: Software to install and first program
---
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
