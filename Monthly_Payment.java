/******************************************************************************
 * 
 * Purpose: to check the monthly payments for given amount ,duration and rate.
 *
 ******************************************************************************/

package nunit_problem;
import java.util.Scanner;

public class Monthly_Payment {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter principal ,year and rate");
		double p = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		sc.close();
		System.out.println("mothly payment is " + Util.monthlyPayment(p, y, r));

	}

}
