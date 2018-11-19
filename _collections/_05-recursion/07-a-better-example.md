---
title: "A better example"
---

# A better example

### PROBLEM STATEMENT

Define a method that when passed a String, returns the reverse of the String.

For example, 

| Input String  | Returned String |
|---------------|-----------------|
| "Superman"    | "namrepuS"      |
| "Voila!"      | "!alioV"        |
| "nicely done" | "enod ylecin"   |

Let's call the method `reverse` and the the formal parameter `str` and take an example:

> reverse("fine") = "enif"

But,

> "eni" is reverse("ine")

So, our first task is to split the first character ('f') and the rest of the String ("ine").

```java
char first = str.charAt(0);
char rest = str.substring(1);
```

Next, we compute reverse of the rest of the String,

```java
String revRest = reverse(rest);
```

Finally, we add the first character to the **end** of the reverse of the rest of the String and return the resulting String.

```java
String result = revRest + first;
return result;
```

Putting it all together:

```java
public static String reverse(String str) {
	char first = str.charAt(0);
	char rest = str.substring(1);
	String revRest = reverse(rest);
	String result = revRest + first;
	return result;
}
```

Did we forget anything...? Oh yes - **the end case**!

### Second attempt

Reverse of an empty String is an empty String. Adding this as an end case, we get:

```java
public static String reverse(String str) {
	if(str.equals("")) { //empty string
		return "";
	}
	//reaches here only if string is not empty
	char first = str.charAt(0);
	char rest = str.substring(1);
	String revRest = reverse(rest);
	String result = revRest + first;
	return result;
}
```

### Trace

```
reverse("super") = reverse("uper") + 's'
	reverse("uper") = reverse("per") + 'u'
		reverse("per") = reverse("er") + 'p'
			reverse("er") = reverse("r") + 'e'
				reverse("r") = reverse("") + 'r'
					reverse("") returns ""
				reverse("r") = "" + 'r' = "r"
			reverse("er") = "r" + 'e' = "re"
		reverse("per") = "re" + 'p' = "rep"
	reverse("uper") = "rep" + 'u' = "repu"
reverse("super") = "repu" + 's' = "repus"
```

### Summarized trace

```
main(null) calls reverse("super")
	reverse("super") calls reverse("uper")
		reverse("uper") calls reverse("per")
			reverse("per") calls reverse("er")
				reverse("er") calls reverse("r")
					reverse("r") calls reverse("")
				 		reverse("") returns "" to reverse("r")
				 	reverse("r") returns "" + 'r' = "r" to reverse("er")
				reverse("er") returns "r" + 'e' = "re" to reverse("per")
			reverse("per") returns "re" + 'p' = "rep" to reverse("uper")
		reverse("uper") returns "rep" + 'u' = "repu" to reverse("super")
	reverse("super") returns "repu" + 's' = "repus" to main(null)
main(null) uses the received value ("repus") as needed
```				

{: challenge}
> ## Define a method that returns `true` if the String passed is purely numeric (all characters are between '0' and '9'), false otherwise. Return `true` if String is empty.
>> ## SOLUTION
 ```java
 public static boolean isNumeric(String str) {
 	if(str.equals(""))
 		return true;
 	char first = str.charAt(0);
 	if(first < '0' || last > '9') 
 		return false;
 	String rest = str.substring(1);
 	return isNumeric(rest);
 }
 ```
>{: .solution}
{: .challenge}