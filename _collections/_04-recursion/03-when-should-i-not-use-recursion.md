---
title: "When should I not use recursion?"
---

# When should I not use recursion?

## Disdvantages

1. Each method call requires:
	1. Variables associated with that call to be stored in the memory, thereby requiring more memory.
	2. Caller to transfer the control to the method called (callee), and then the callee to execeute and return control, possible with a value, back to the caller, thus adding to processing time. Hence, recursive solutions are generally have a little processing time overhead.

We will see concrete examples of this once we talk about recursive implementation.