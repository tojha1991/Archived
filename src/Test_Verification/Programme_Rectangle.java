package Test_Verification;

import java.util.Scanner;

public class Programme_Rectangle {

	public static void rect() {
		System.out.println("Please enter 1st value ");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();

		System.out.println("Length of rectangle is " + x1);
		System.out.println("     ");


		System.out.println("Please enter 2nd value ");
		int x2 = sc.nextInt();
		System.out.println("Breadth of rectangle is " + x2);

		System.out.println("     ");
		int arofrect = x1 * x2;

		System.out.println("Area of rectangle is " + arofrect);

	}

	public static void main(String[] args) {

		Programme_Rectangle.rect();
	}

}
