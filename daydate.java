/******************************************************************************
 * 
 * Purpose:  to read a date from user and give that weekday as output
 *
******************************************************************************/

package nunit_problem;
import java.util.Scanner;

public class daydate {	
  /**
	* main function to test the class
	*/
	public static void main(String[] args) {
		int d, m, y;
		Scanner s = new Scanner(System.in);
		System.out.println("enter date in day month year");
		d = s.nextInt();
		m = s.nextInt();
		y = s.nextInt();
		System.out.println("day is "+Util.dayOfWeek(d, m, y));
		s.close();
	}

}
