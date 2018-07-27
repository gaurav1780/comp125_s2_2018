---
title: Class containing array(s) 
---

# Class containing array(s)

In this unit, we’ll extensively see classes containing arrays.

We must remember that both arrays and objects are references and refer
to the memory holding the actual data (in the case of array, it’s the
array items, and in the case of objects, it’s the instance variables).

Take the following as an example (instance variables are `public` for
simplicity),
```java
    public class DynamicArray {
        public int[] data;
        public int nItems;
    }
```

The client is as follows,

```java
    public class Client {
        public static void main(String[] args) {
            DynamicArray list = new DynamicArray();
        }
    }
```

At this stage, the memory state looks like,
 
<div>&nbsp;</div> 
![](./../fig/03-classes-and-objects/classesObjects1-figure8.png)  
<div>&nbsp;</div>

If we change the values of the instance variables as,

```java
    public class Client {
        public static void main(String[] args) {
            DynamicArray list = new DynamicArray();
            list.data = new int[4];
            list.nItems = 0;
        }
    }
```

It now becomes,	

<div>&nbsp;</div> 
![](./../fig/03-classes-and-objects/classesObjects1-figure9.png) 
<div>&nbsp;</div>

Finally, we can modify the items of the array as,

```java
    public class Client {
        public static void main(String[] args) {
            DynamicArray list = new DynamicArray();
            list.data = new int[4];
            list.data[0] = 5;
            list.data[1] = 12;
            list.nItems = 2;
        }
    }
```

This gives us,  
<div>&nbsp;</div> 
![](./../fig/03-classes-and-objects/classesObjects1-figure10.png) 
<div>&nbsp;</div>
