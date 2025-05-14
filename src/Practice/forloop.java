package Practice;

import java.util.Scanner;

//Print even numbers between 1 t 10

public class forloop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println("Table of the entered number is " + number * i);
		}
//
//		int num = 2;
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(num * i);
//		}
//		for (i = 0; i <= 10; i = i + 2) {
//			System.out.println(i);
//		}
	}

}
