/******************************************************************************
* Purpose:  Program to find the square root of a given number.
*
******************************************************************************/
package nunit_problem;
import java.util.Scanner;

public class SquareRoot {
	
	/**
	 * Main method to test the class
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter no to find square root");
		double c = s.nextDouble();
		System.out.println("square root is " + Util.sqrt(c));
		s.close();

	}

}
