package Homework;

import java.util.Scanner;

public class ExceptionIII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int z = sc.nextInt();

		int y = sc.nextInt();

		try {

			int a = z / y;

			System.out.println("Divison of two numbers is " + a);

		}

		catch (Exception e) {

			System.out.println("Caught exception is " + e);
		}

		finally {

			System.out.println("Exception caught");
		}

		System.out.println(" ");
	}

}
