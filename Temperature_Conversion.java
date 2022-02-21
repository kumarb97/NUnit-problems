/******************************************************************************
 * Purpose:  To Convert the temperature from celcius to fahreinheit and vice-versa.
 *
 ******************************************************************************/
package nunit_problem;
import java.util.Scanner;
public class Temperature_Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp in c or f");
		int tem = sc.nextInt();
		char t = sc.next().charAt(0);
		
		if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
			System.out.println("enter correct input");
			main(args);
			return;
		}
		tem = Util.temperaturConversion(tem, t);
		System.out.println("coverted temp is " + tem);
        sc.close();
	}

}
