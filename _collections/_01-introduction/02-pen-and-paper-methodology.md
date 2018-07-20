---
title: Pen and Paper methodology
---
# Pen and paper methodology

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
