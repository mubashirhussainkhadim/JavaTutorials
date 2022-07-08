
# JavaTutorials

## First Program 

###### Write a program to accept name and total marks of N number of students in two single subscript arrays name[ ] and totalmarks[ ].
Calculate and print:
(i) The average of the total marks obtained by N number of students.
[average = (sum of total marks of all the students)/N]
(ii) Deviation of each student's total marks with the average.
[deviation = total marks of a student - average]

## Data Types 
###### Data types are divided into two groups:
Primitive data types - includes byte, short, int, long, float, double, boolean and char
 Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
 
## Java Strings

###### how to create them, and various methods of the String class with the help of examples.

In Java, a string is a sequence of characters. For example, "hello" is a string containing a sequence of characters 'h', 'e', 'l', 'l', and 'o'.

We use double quotes to represent a string in Java. For example,

// create a string
String type = "Java programming";

Here, we have created a string variable named type. The variable is initialized with the string Java Programming.

## String Method In Java

###### The String class has a set of built-in methods that you can use on strings.
https://www.w3schools.com/java/java_ref_string.asp
* charAt() 	Returns the character at the specified index (position) 	char
* codePointAt() 	Returns the Unicode of the character at the specified index 	int
* codePointBefore() 	Returns the Unicode of the character before the specified index 	int
* codePointCount() 	Returns the number of Unicode values found in a string. 	int
* compareTo() 	Compares two strings lexicographically 	int
* compareToIgnoreCase() 	Compares two strings lexicographically, ignoring case differences 	int
* concat() 	Appends a string to the end of another string 	String
* contains() 	Checks whether a string contains a sequence of characters 	boolean
* contentEquals() 	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer 	boolean
* copyValueOf() 	Returns a String that represents the characters of the character array 	String
* endsWith() 	Checks whether a string ends with the specified character(s) 	boolean
* equals() 	Compares two strings. Returns true if the strings are equal, and false if not 	boolean
* equalsIgnoreCase() 	Compares two strings, ignoring case considerations 	boolean
* format() 	Returns a formatted string using the specified locale, format string, and arguments 	String
* getBytes() 	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array 	byte[]
* getChars() 	Copies characters from a string to an array of chars 	void
* hashCode() 	Returns the hash code of a string 	int
* indexOf() 	Returns the position of the first found occurrence of specified characters in a string 	int
* intern() 	Returns the canonical representation for the string object 	String
* isEmpty() 	Checks whether a string is empty or not 	boolean
* lastIndexOf() 	Returns the position of the last found occurrence of specified characters in a string 	int
* length() 	Returns the length of a specified string 	int
* matches() 	Searches a string for a match against a regular expression, and returns the matches 	boolean
* offsetByCodePoints() 	Returns the index within this String that is offset from the given index by codePointOffset code points 	int
* regionMatches() 	Tests if two string regions are equal 	boolean
* replace() 	Searches a string for a specified value, and returns a new string where the specified values are replaced 	String
* replaceFirst() 	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement 	String
* replaceAll() 	Replaces each substring of this string that matches the given regular expression with the given replacement 	String
* split() 	Splits a string into an array of substrings 	String[]
* startsWith() 	Checks whether a string starts with specified characters 	boolean
* subSequence() 	Returns a new character sequence that is a subsequence of this sequence 	CharSequence
* substring() 	Returns a new string which is the substring of a specified string 	String
* toCharArray() 	Converts this string to a new character array 	char[]
* toLowerCase() 	Converts a string to lower case letters 	String
* toString() 	Returns the value of a String object 	String
* toUpperCase() 	Converts a string to upper case letters 	String
* trim() 	Removes whitespace from both ends of a string 	String
* valueOf() 	Returns the string representation of the specified value 	String

## Java Conditions and If Statements

###### Java supports the usual logical conditions from mathematics:

  *  Less than: a < b
  *  Less than or equal to: a <= b
  *  Greater than: a > b
  *  Greater than or equal to: a >= b
  *  Equal to a == b
  *  Not Equal to: a != b

###### You can use these conditions to perform different actions for different decisions.

###### Java has the following conditional statements:

*    Use if to specify a block of code to be executed, if a specified condition is true
*    Use else to specify a block of code to be executed, if the same condition is false
*    Use else if to specify a new condition to test, if the first condition is false
*    Use switch to specify many alternative blocks of code to be executed
 
 
## Java Logical Operators

###### Logical operators are used to check whether an expression is true or false. They are used in decision making.
Operator
			
			
* && (Logical AND)
					expression1 && expression2
					true only if both expression1 and expression2 are true
			
*  || (Logical OR)
					expression1 || expression2
					true if either expression1 or expression2 is true
			
*  ! (Logical NOT)
					!expression
					true if expression is false and vice versa
## Java Switch Statements

###### Use the switch statement to select one of many code blocks to be executed.


  *  The switch expression is evaluated once.
  *  The value of the expression is compared with the values of each case.
  *  If there is a match, the associated block of code is executed.
  *  The break and default keywords are optional, and will be described later in this chapter

```ruby
import java.util.Scanner;
public class SwitchStatementsInjava {
    
	public static void main(String[] args) {
//		int age = 56;
		System.out.println("Enter U Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		switch(age){
		case 18:
			System.out.println("Your AGE IS GRATER THAN 18 YOU DRIVE");
			break;
		case 50:
			System.out.println("Your age is greater 50 plz take rest you cannot drive");
			break;
		case 17:
			System.out.println("Your Age is les than 18 u cannot drive ");
			break;
		
		default :
			System.out.println("Enoy uour Life");
		
	}}
}

```
