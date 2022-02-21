package nunit_problem;
import java.util.Scanner;
public class Binary_Search {
	/**
	  * Main method to test the class
	  * 
	  * @param args
	  * @throws Exception if input is not integer
	  */
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("enter size of array");
			int[] arr = new int[s.nextInt()];
			System.out.println("enter elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println("enter element to search ");
			int n = s.nextInt();
			// int[] arr = { 1, 2, 3, 4, 5 };
			int f = Utility.binary(arr, n);
			if (f > 0)
				System.out.println("element found at index" + f);
			else
				System.out.println("not found");
		} catch (Exception e) {
			System.out.println("enter correct input is integer ");
		} finally {
			s.close();
		}


	}

}
