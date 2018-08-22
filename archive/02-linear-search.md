---
title: "Linear search"
---
# Linear search

-   Simplest search algorithm.
-   Look at each element of the array in turn.
-   If you find the target, stop.
-   If you don’t find the target by the end, it’s not there.

### Version 1 - Buggy linear search

```java
/**
 * Perform a linear search for a given integer in the array.
 * @return true if target present, false otherwise
 */
public static boolean buggyContais(int[] arr, int target) {
   for( int i=0; i < arr.length; i++ ) {
      if (arr[i] == target) {
         return true;
      } else {
         return false;
      }
   }
}
```

Trace the above code with the following pair of values:

-   `arr = {10, 70, 20, 90}`, `target = 10`
-   `arr = {10, 70, 20, 90}`, `target = 80`
-   `arr = {10, 70, 20, 90}`, `target = 90`

When `target = 10`, the first item (10) matches the target and the method
returns `true` correctly.

When `target = 80`, the first item (10) **DOES NOT** match the target and
the method immediately returns `false` - which is incidentally correct.

When `target = 90`, the first item (10) **DOES NOT** match the target and
the method immediately returns `false` - .

The problem is the `else` block. The code returns `false` as
soon as an item doesn’t match the target.

So, if the target exists in the array at any index other than 0, the
method incorrectly returns `false`.

{: challenge}
> ## Write a corrected version of the linear search code from above.
>> ## SOLUTION
>>> ```java
>>> public static boolean contains(int[] arr, int target) {
>>>   for( int i=0; i < arr.length; i++ ) {
>>>      if (arr[i] == target) {
>>> 	     return true;
>>>      }
>>>   }
>>>   return false;
>>> }
>>> ```
>{: .solution}
{: .challenge}

{: challenge}
> ## Write a modified version of linear search that returns the first index at which the target is found, and -1 if the target is not found in the array.
>> ## SOLUTION
>>> ```java
>>> public static int indexOf(int[] arr, int target) {
>>>   for( int i=0; i < arr.length; i++ ) {
>>>      if (arr[i] == target) {
>>> 	     return i;
>>>      }
>>>   }
>>>   return -1;
>>> }
>>> ```
>{: .solution}
{: .challenge}

{: challenge}
> ## Write a modified version of linear search that returns the **last** index at which the target is found, and -1 if the target is not found in the array.
>> ## SOLUTION
>>> ```java
>>> public static int lastIndexOf(int[] arr, int target) {
>>>   for( int i=0; i < arr.length; i++ ) {
>>>      if (arr[i] == target) {
>>> 	     return i;
>>>      }
>>>   }
>>>   return -1;
>>> }
>>> ```
>{: .solution}
{: .challenge}


{: challenge}
> ## Consider an array `arr = {1, 2, \cdots, n}` (such that `arr.length = n`). In which case will the method 
>> ## SOLUTION
>>> ```java
>>> public static boolean linearSearch(int[] arr, int target) {
>>>   for( int i=0; i<arr.length; i++ ) {
>>>      if (arr[i] == target) {
>>> 	     return true;
>>>      }
>>>   }
>>>   return false;
>>> }
>>> ```
>{: .solution}
{: .challenge}

What information did you deduce from the above exercise?

-   In the best case scenario (fastest possible), the loop executes just
    once (irrespective of the value of $n$)

-   In the worst case scenario (slowest possible), the loop executes $n$
    times. Thus, the time taken is proportional to $n$ (as time is
    proportional to number of loop executions and number of loop
    executions is proportional to $n$).

Version 2
---------

{: challenge}
> ## Consider an array `arr = {1, 2, \cdots, n}` (such that `arr.length = n`). In which ca
>> ## SOLUTION
>>> ```java
>>> public static boolean linearSearch(int[] arr, int target) {
>>>   for( int i=0; i<arr.length; i++ ) {
>>>      if (arr[i] == target) {
>>> 	     return true;
>>>      }
>>>   }
>>>   return false;
>>> }
>>> ```
>{: .solution}
{: .challenge}

[8][Code for linear search - version 2] Write a method in java that
implements the pseudo-code from Algorithm [lsv2]

[H] set `idx` to first item’s index (0 in java) set `result` to `false`
return `result`

    public static boolean linearSearchV2(int[] arr, int target) {
        boolean result = false;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == target) {
                result = true;
            }
        }
        return result;
    }

[8][Analysis of linear search - version 2] Consider an array
`arr = {1, 2, \cdots, n}` (such that `arr.length = n`). How many times
is the loop executed in linear search - version 2 code to search for,

-   `target = 1`

-   `target = n/2`

-   `target = n + 1`

-   `target = 1: n times`

-   `target = n/2: n times`

-   `target = n + 1: n times`

Comparison of versions 1 and 2
------------------------------

[5][Comparison of versions 1 and 2] Which version is better - 1 or 2?

The loop in both versions executes $n$ times in the worst case scenario,
but in the best case scenario, version 1 loop executes only once
(compared to $n$ executions of the loop in version 2). Therefore,

Returning index instead of true/false
-------------------------------------

Returning `true` if an item is found in an array (and `false` otherwise)
is fine, but returning the index at which it is found (and -1 if it
isn’t) is even better!

[8][Modify linear search to return index] Write a method that when
passed,

-   an integer array `arr`

-   an integer `target`

returns,

-   the first index in `arr` at which `target` exists

-   -1 if `target` is not found in `arr`

public static int linearSearch(int[] arr, int target) <span> for(int
i=0; i \< arr.length; i++) <span> if(arr[i] == target) <span> return i;
</span> </span> return -1; </span>

Handling `null` array
---------------------

Since we’ll be dealing with arrays and other containers throughout this
unit, it’s important to think about the scenario where a `null` array or
object is passed to a method.

The code that we wrote will raise a `NullPointerException` because we’d
be accessing `arr.length` for a `null` array. This is no good. We must
handle a `null` array scenario before accessing the array.

The course of action is dependent on the problem.

[5][Handling `null` array] What value should we return if a `null` array
is passed to a linear search algorithm, and why?

The method should return -1 if you try to search for an item in a `null`
array, since -1 is not a valid index, hence it is a clear error code
indicating that the array was `null`.
