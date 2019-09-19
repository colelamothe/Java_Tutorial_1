import java.text.DecimalFormat; // imports the ability to format decimal output
import java.util.Scanner; // imports input library

/*
1.What is the value of ‘a’ after each of the following expressions?
a.int ​a =​​3 ​/​​2​;
b.float ​a =​​3 ​/​​2​;
c.float ​a =​​3 ​/​​2f​;
d.float ​a = ​(​5 ​*​​5 ​-​​4​) ​/​​6​;
e.float ​a =​ (​float​) ​3 ​/​​2​;

2.You have recently taken a multiple choice biology exam for which no partial marks are awarded.
 Write a program to convert your score (out of 63) to a percent and print the result.
 You may optionally incorporate I/O in your program to read input from the user

 */



public class Tutorial_1 {

	public static void main(String[] args) {
		// Problem 1
		int a = 3/2;
		float b = 3/2;
		float c = 3/2f; // the f after the 2 is a shorthand for casting that variable to float
		float d = (5*5-4)/6;
		float e = (float)(3/2); // the process inside the bracket is evaluated as int then cast to float then assigned as float

		System.out.println("a = " + a); // 1
		System.out.println("b = " + b); // 1.0
		System.out.println("c = " +c); // 1.5
		System.out.println("d = " +d); // 3.0
		System.out.println("e = " + e); // 1.0

		// Problem 2
		Scanner scan = new Scanner(System.in); // Loads the scanner object
		int marks;
		double percent;
		double totalPossible = 63; // defines the grade the test is out of
		System.out.println("Enter your mark out of 63: ");
		marks = scan.nextInt(); // accepts user input of the integer form
		
		percent = (marks/totalPossible)*100; // evaluates properly because total marks is a double.
		DecimalFormat df = new DecimalFormat("#.##"); // defines a format object to get the right decimal format
		
		System.out.println("Your percentage is: " + df.format(percent)); // uses the format property to change the decimal output
		System.out.println("Cole Lamothe 100711084");

	}
}
