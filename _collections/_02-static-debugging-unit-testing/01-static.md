---
title: What is "static"?
---

# What is "static"?

`static` members (variables and methods) are properties of a class rather than of each `object`. Thus, you don't need to create an `object` to access a `static` variable or call a `static` method

They are also called `class variables` and `class methods`.

`static` methods can only access `static` variables.

Typically, `static` methods operate on the parameters passed.

### Example of a class method

```java
public class ArrayService {
	/**
	 * @param data
	 * @return true if array is in ascending order, false otherwise
	public static boolean isAscending(int[] data) {
		for(int i=0; i < data.length - 1; i++) { //go only to second last item
			if(data[i] > data[i+1]) { //violation to ascending order
				return false;
			}
		}//end of loop means no violations
		return true;
	}
}
```

The method `isAscending` is labelled as `static`. This means, it can be called directly on the class.

```java
public class Client {
	public static void main(String[] args) {
		int[] a = {1, 7, 2, 9};
		boolean status = ArrayService.isAscending(a); 
		//class method isAscending called directly on class, operates on array passed
	}
}
```		

### Example of an instance method

On the other hand, instance methods operate on objects or instances of a class.
 
**!!! We will cover this in the subsequent lecture !!!**

```java
public class Rectangle {
	public double length, breadth;
	
	public double area() {
		return length * breadth;
	}
}
```

```java
public class Client {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(); 	//instance of class created
		r.length = 4; 			//instance variables set
		r.breadth = 6;
		int val = r.area();					
		//instance method area called on object, has knowledge of instance variables
	}
}
```


<!--
You might have heard that Java is an *object-oriented* language. We'll see what this means very soon.

Until then, take the following example to understand the meaning of term *static*.

### EXAMPLE 1: Being Human

#### Collective/ Class
Humans are a species or a `class`.

##### Class attributes

The attributes of this species are (exceptions not considered):

- number of eyes: 				`2`
- number of hearts: 			`1`
- number of ears: 				`2`
- number of limbs: 				`4`
- number of digits (fingers/toes) per limb:	`5`
- opposable thumbs:				`true`
- reproduction:					`sexual`
- kill partner after mating: 	`false`
- can fly: 						`false`
- can breathe: 					`true`
- can breathe under water: 	`false`
- can breathe outside water: 	`true`
- and more...

This means every single human has these attributes.

##### Functions of class attributes

We can derive other information from these attributes. For example, 

`totalDigits` = `limbCount * digitPerLimb`

We say `totalDigits` is a function of attributes `limbCount, digitsPerLimb` and is computed on an as-you-need basis.


#### Individual/ Object


Instances of humans are called `objects` of the class `Human`.
Objects can have additional attributes specific to them. Such as:

- height
- weight
- age

Each instance will have a value for these attributes, specific to them. So you can have 4 people:

- John: height = 177, weight = 75.2, age = 24
- Yana: height = 169, weight = 61.7, age = 37
- Ling: height = 142, weight = 37.1, age = 12
-->


