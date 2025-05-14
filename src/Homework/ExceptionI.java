package Homework;

import java.util.Scanner;

//Arithmetic exception

public class ExceptionI {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();

		int b = sc1.nextInt();

		try {

			int c = a / b;

			System.out.println("value of c is " + c);

		}

		catch (Exception e) {

			System.out.println("exception found is " + e);

		}

	}

}
