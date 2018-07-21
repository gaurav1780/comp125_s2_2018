---
title: Compiling and running java programs
---
# Compiling and running java programs from command prompt or terminal

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
