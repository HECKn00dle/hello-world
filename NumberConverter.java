import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int decimalInput;
		String binaryOutput;
		Integer num1 = 10;
		Double num2 = 3.14;
		String str1 = "32";
		int regularInt = 20;

		
		System.out.print("Enter a decimal number: ");
		decimalInput = scnr.nextInt();
		
		binaryOutput = Integer.toBinaryString(decimalInput);
		
		System.out.println("The binary representation of " + decimalInput +
				" is " + binaryOutput);


		/**
		toString()	Returns a String containing the decimal representation of the value contained by the wrapper class object.
		
		num1.toString() // Returns "10"
		num2.toString() // Returns "3.14"
		Integer.toString(someInteger)	Returns a String containing the decimal representation of the value of someInteger. someInteger may be an Integer object, a int variable, or an integer literal. This static method is also available for the other wrapper classes (e.g.,  Double.toString(someDouble)).
		
		Integer.toString(num1)       // Returns "10"
		Integer.toString(regularInt) // Returns "20"
		Integer.toString(3)          // Returns "3"
		Integer.parseInt(someString)	Parses someString and returns an int representing the value encoded by someString. This static method is also available for the other wrapper classes (e.g., Double.parseDouble(someString)), returning the corresponding primitive type.
		
		Integer.parseInt(str1)    // Returns int value 32
		Integer.parseInt("2001") // Returns int value 2001
		Integer.valueOf(someString)	Parses someString and returns a new Integer object with the value encoded by someString. This static method is also available for the other wrapper classes (e.g., Double.valueOf(someString)), returning a new object of the corresponding type.
		
		Integer.valueOf(str1)    // Returns Integer object with value 32
		Integer.valueOf("2001") // Returns Integer object with value 2001
		Integer.toBinaryString(someInteger)	Returns a String containing the binary representation of someInteger. someInteger may be an Integer object, a int variable, or an integer literal. This static method is also available for the Long classes (e.g.,  Long.toBinaryString(someLong)).
		
		Integer.toBinaryString(num1)       // Returns "1010"
		Integer.toBinaryString(regularInt) // Returns "10100"
		Integer.toBinaryString(7)          // Return "111"
		*/