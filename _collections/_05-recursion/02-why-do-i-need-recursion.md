---
title: "Why should I use recursion?"
---

# Why should I use recursion?

## Advantages

#### 1. Intuitiveness

Some solutions have an intuitive recursive design. Some examples (we assume n >= 0 for all examples):

	1. x<sup>n</sup> = x<sup>n-1</sup> * x (if n > 0, or 1 if n == 0)
	2. `nDigits(n)` = `nDigits(n/10) + 1` (if n > 0, or 0 if n == 0)
	3. `sum(n) = sum(n-1) + n` if(n > 0, or 0 if n == 0)

#### 2. Complex problems

While trivial problems have fairly obvious recursive **and** iterative solutions, it's much easier to find a recursive solution to the more complex problems. For example, creating a random permutation of the word "super".
 
> random permutation of the word "super"
> = random character from "super" (say 'u') + random permutation of the word "sper"

> random permutation of the word "sper"
> = random character from "sper" (say 'r') + random permutation of the word "spe"

> random permutation of the word "spe"
> = random character from "spe" (say 's') + random permutation of the word "pe"

> random permutation of the word "pe"
> = random character from "pe" (say 'e') + random permutation of the word "p"

> random permutation of the word "p"
> = random character from "p" (has to be 'p') + random permutation of the word ""

> random permutation of the word ""
> = "" (end case)

Plugging the values back:

> random permutation of the word "p"
> = 'p' + ""
> = "p"

> random permutation of the word "pe"
> = 'e' + "p"
> = "ep"

> random permutation of the word "spe"
> = 's' + "ep"
> = "sep"

> random permutation of the word "sper"
> = 'r' + "sep"
> = "rsep"

> random permutation of the word "super"
> = 'u' + "rsep"
> = "ursep"

#### 3. Recursive data structures

Advanced data structures (such as linked lists, trees and graphs) are recursive in nature and it is logical to operate recursively on them.
