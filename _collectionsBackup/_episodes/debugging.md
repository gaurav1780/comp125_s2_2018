---
title: Debugging
teaching: 120
exercises: 120
questions:
- "The power of debugging"
objectives:
- Understand that if the output is wrong, there are bug(s) somewhere.
- Debugging is the process of locating the bugs and removing them.
- Tracing code is a crucial skill
- IDEs provide debuggers which make life so much easier for you.
keypoints:
- Re-visit the logic and design of your solution rather than making random changes and hoping code will "magically" work.
- Practise pen and paper tracing and get comfortable with it.
- Use debugger provided by IDE in real-life.
---

<img src="/fig/power.png" alt="Power of Debugging" style="width: 200px;"/>

# What is debugging?

For any given problem, we design a solution and then implement it. 

As an example, let's say that we are writing a program that gives you the number of digits in an integer. We expect the following *input-output mappings*.


| Input      | Output |
|------------|--------|
| 1729       | 4      |
| 1234567890 | 10     |
| 0          | 0      |
| -888       | 3      |

Now, it's possible that the actual outputs you get from your code are as follows,

| Input      | Output |
|------------|--------|
| 1729       | 4      |
| 1234567890 | 10     |
| 0          | `1`      |
| -888       | `4`      |

We need to find out why do some inputs have incorrect outputs. So we go through our design and implementation looking for possible bugs. A logical way to do this is to trace every variable at every stage and see where does the program deviate from the expected.

## Example 1

Consider the following code that is supposed to return the product of all integers from 1 to `n` (n >= 1). 

<script src="https://gist.github.com/gaurav1780/71d8008cd4cc632dc6119b1594dcfe88.js"></script>

The input-output mappings are - 

| Input      | Expected Output | Actual Output |
|------------|--|---|
| 4       | 24 	| 0 |
| 6 		| 720 	| 0 |
| 7      	| 5040	| 0 |
| 1      	| 1 	| 0 |

If you trace the program, you'll see that the loop executes when `i=1` and `result` becomes `result (0) * i (1) = 0`. And every subsequent time, `result` becomes `0 * i = 0`. A trace for `n=4` using *logic table* is provided below,

| i | i < 4 | result |
|---|-------|--------|
| 1 |  true | 0\*1 = 0|
| 2 |  true | 0\*2 = 0|
| 3 |  true | 0\*3 = 0|
| 4 |  false | |

Thus, the first bug is `result` should be initalized to 1 and not 0.

Our partially fixed code:

<script src="https://gist.github.com/gaurav1780/526b68d197c7c3a705780af2fcef93c1.js"></script>

The new input-output mappings are - 

| Input      | Expected Output | Actual Output |
|------------|--|---|
| 4       | 24 	| 6 |
| 6 		| 720 	| 120 |
| 7      	| 5040	| 720 |
| 1      	| 1 	| 1 |

A trace for `n=4` using *logic table* is provided below,

| i | i < 4 | result |
|---|-------|--------|
| 1 |  true | 1\*1 = 1|
| 2 |  true | 1\*2 = 2|
| 3 |  true | 2\*3 = 6 (not the expected output)|
| 4 |  false | |

It can now be seen that the loop **should** execute for `i=4` and multiply it into the `result` but it doesn't. By changing `i < n` to `i <= n`, we fix this problem.

<script src="https://gist.github.com/gaurav1780/331fb94f328322b2fc4bd781ef22d18e.js"></script>

To confirm, we trace once more for `i=4`.

| i | i < 4 | result |
|---|-------|--------|
| 1 |  true | 1\*1 = 1|
| 2 |  true | 1\*2 = 2|
| 3 |  true | 2\*3 = 6| 
| 4 |  true | 6\*4 = 24 (expected output)|
| 5 |  false | |

{: .challenge}
> ## Debug a method
> Debug the following method for which the expected input-output mappings are provided in the javadoc (comment above the method).
> <script src="https://gist.github.com/gaurav1780/111f98632dbb6068d4056df295341cf3.js"></script>
> **CRITICAL STEP!!!** Write down the actual input-output mappings after every iteration of debugging
> > ## Solution
> > <script src="https://gist.github.com/gaurav1780/7556eea66978a974423447f544150841.js"></script>
> {: .solution}
{: .challenge}

## Performing debugging in Eclipse

Most of the modern Integrated Development Environments (IDEs) have a comprehensive debugging feature that let's you trace the variables as your program executes. 

In the IDE we are using (Eclipse), the debugger relies of placing `breakpoints` that are like pitstops in car race. The program runs till the next breakpoint where you can see the values of all the variables and when you hit `resume`, it goes to the next breakpoint.

<iframe width="560" height="315" src="https://www.youtube.com/embed/NQTQVYhmsL0" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

