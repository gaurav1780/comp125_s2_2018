---
title: "What happens during a method call?"
---

# What happens during a method call?

Before we jump into a method calling itself, it's important to understand what happens when a method is called. Consider the following example:

```java
public static void main(String[] args) {
	int c = 1729;
	int d = foo(c);
	System.out.println(d);
}

public static int foo(int a) {
	int temp = bar(a);
	return result = temp * temp;
	return result;
}

public static int bar(int b) {
	int answer = b % 10;
	return answer;
}
```

> ### STEP 1: main method is invoked by JVM

<div>&nbsp;</div>
![](./../fig/05-recursion/callingMethods-figure0.png)
<div>&nbsp;</div>

Method call is placed on the stack. Note that parameter is `null` because we typically do not pass any arguments to main, at least in this unit.

> ### STEP 2: main method calls `foo` with parameter `c`

<div>&nbsp;</div>
![](./../fig/05-recursion/callingMethods-figure1.png)
<div>&nbsp;</div>

Another entry is made for the call to `foo` and placed on the stack.


> ### STEP 3: `foo` calls `bar` with parameter `a`

<div>&nbsp;</div>
![](./../fig/05-recursion/callingMethods-figure2.png)
<div>&nbsp;</div>

A third entry is made for the call to `bar` and placed on the stack.


> ### STEP 4: `bar` returns value to `foo`

<div>&nbsp;</div>
![](./../fig/05-recursion/callingMethods-figure3.png)
<div>&nbsp;</div>

Entry for `bar` is taken off the stack. `foo` becomes the active method.

> ### STEP 5: `foo` returns value to `main`

<div>&nbsp;</div>
![](./../fig/05-recursion/callingMethods-figure4.png)
<div>&nbsp;</div>

Entry for `foo` is taken off the stack. `main` becomes the active method.

> ### STEP 6: Rest of main executes

<div>&nbsp;</div>
![](./../fig/05-recursion/callingMethods-figure5.png)
<div>&nbsp;</div>

# Formal parameters vs. actual parameters

Each method expects zero or more values and gives the passed values some name. These are called *formal parameters*.

When the method is called, appropriate type of values (hopefully) are passed to it. These are called *actual parameters*.

Consider the following example:

```java
public static int foo(int a) {
	int b = a*a;
	return b;
}
```

In the above example, `a` is the name of the formal parameter in method `foo`. Whenever, `foo` is called with a value of the right type (int), it (the passed value) is copied into variable `a` that stays in memory during the current execution of `foo`.

> Here, `a` is the *formal parameter*.

Now let's say the client code is:

```java
public static void main(String[] args) {
	int p = 10;
	int q = foo(p);
	System.out.println(q);
}
```

The variable `p` is being passed as a parameter to method `foo`. Java checks it's of the right type (`int`) and copies it into variable `a` during the execution of `foo(p)`. 

> Here, `p` is the *actual parameter*.

Now consider a different client code:

```java
public static void main(String[] args) {
	int a = 10;
	int result = foo(a);
	System.out.println(a);
}
```

Now we have a variable `a` in method main (represented by `main: a`) being passed to `foo` and copied into variable `a`, represented by `foo(10): a`. This is ok since the two variables, although with the same name, exist in different scopes. The following figure summarizes the transaction.

<div>&nbsp;</div>
![](./../fig/05-recursion/actualParametererFormalParameter-figure0.png)
<div>&nbsp;</div>
