package session1assignments;

import java.util.Scanner; //Imports Scanner class to read inputs from the keyboard
/**
 * This class shows the implementation of widening typecast between different
 * variables.
 */
public class WideningTypeCast
{
	/**
	 * This is the main method and execution starts here.
	 *
	 */
	public static void main(String[] args) 
	{
		byte byte_val; // Declaration of byte type variable
		short short_val; // Declaration of short type variable
		int int_val; // Declaration of integer type variable
		long long_val; // Declaration of long type variable
		float float_val; // Declaration of float type variable
		double double_val; // Declaration of double type variable
		
		Scanner readvalues = new Scanner(System.in); // To read the inputs using Scanner object readvalues
		
		System.out.println("Enter the byte value to be added"); // Prompts the user to input a value of type byte
		byte_val = readvalues.nextByte(); // Reads the input byte value and initializes byte variable
		
		System.out.println("Enter the short value to be added"); // Prompts the user to input a value of type short
		short_val = readvalues.nextShort(); // Reads the input short value and initializes short variable
		
		readvalues.close(); // Scanner object readvalues closed
		
		int_val = byte_val + short_val; // Calculates the sum of byte and short value and stores it as integer type
		System.out.println("The integer sum of byte and short value is: " + int_val); // Prints the integer value
		
		long_val = short_val + int_val; // Calculates the sum of short and integer value and stores it as long type
		System.out.println("The long sum of short and integer value is: " + long_val); // Prints the long value
		
		float_val = int_val + long_val; // Calculates the sum of integer and long value and stores it as float type
		System.out.println("The float sum of integer and long value is: " + float_val); // Prints the float value
		
		double_val = long_val + float_val; // Calculates the sum of long and float value and stores it as double type
		System.out.println("The double sum of long and float value is: " + double_val); // Prints the double value
	} // main method closed
} // Class closed
