package Practice_methods_resusablity;

import java.util.Scanner;

public class Area_of_Square {

	public static void Arofsq() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of one side ");

		int a1 = sc.nextInt();

		System.out.println("Enter value of Second side ");

		int a2 = sc.nextInt();

		// Area of rectangle

		int A = a1 * a2;

		// Float f=3.14f*A;

		// Area of Circle

		double D = 3.14 * A;

		// Area of Square

		int B = a1 * a1;

		System.out.println("Area of rectangle is " + A);
		System.out.println("Area of circle is " + D);
		System.out.println("Area of square is " + B);

	}

	public static void main(String[] args) {

		Area_of_Square.Arofsq();
	}
}