package Exceptions;

import java.util.Scanner;

public class Vote {

	public void criteria() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter any number");

		int age = sc.nextInt();

		if (age >= 18) {

			System.out.println("user is eleigible ");
		}

		/*
		 * else {
		 * 
		 * System.out.println("user is not eleigible"); }
		 */

		else {
			throw new Exception("exception found");
		}
	}

}
