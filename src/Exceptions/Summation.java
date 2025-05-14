package Exceptions;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("first number is ");

		int a = sc.nextInt();

		System.out.println("Second number is ");

		int b = sc.nextInt();

		try {
			int div = a / b;
			System.out.println("Div of two number is " + div);

		} catch (Exception e) {

			System.out.println("Value of exception is " + e);
		}

		finally {
			sc.close();

		}
		System.out.println("Compilation continues.");
	}

}
