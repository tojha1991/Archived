package Practice;

import java.util.Scanner;

public class IfElseI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Passenger age");

		int age = sc.nextInt();

//		System.out.println("Enter second number");
//
//		int b = sc.nextInt();

		if (age <= 4) {
			System.out.println("You are a kid passenger");
		}

		else if (age <= 19) {
			System.out.println("You are a teenager passenger");
		}

		else if (age == 20) {
			System.out.println("You are an Adult passenger");
		}

		else if (age >= 60) {
			System.out.println("You are a Senior Citizen passenger");
		}

		else {
			System.out.println("You are an infant passenger");
		}
	}

}
