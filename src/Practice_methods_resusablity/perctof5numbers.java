package Practice_methods_resusablity;

import java.util.Scanner;

public class perctof5numbers {

	public static void main(String[] args) {

		System.out.println("Please enter number");

		Scanner sc = new Scanner(System.in);

		float f1 = sc.nextFloat();

		System.out.println("Enter first number " + f1);

		float f2 = sc.nextFloat();

		System.out.println("Enter second number " + f2);

		float f3 = sc.nextFloat();

		System.out.println("Enter third number " + f3);

		float f4 = sc.nextFloat();

		System.out.println("Enter fourth number " + f4);

		float f5 = sc.nextFloat();

		System.out.println("Enter fifth number " + f5);

		float perct_of_5_numbers = (f1 + f2 + f3 + f4 + f5) / 500 * 100;

		System.out.println();

		System.out.println("Percentage of 5 number is " + perct_of_5_numbers);

	}

}
