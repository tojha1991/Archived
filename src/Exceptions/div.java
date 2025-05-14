package Exceptions;


//Unchecked exception
import java.util.Scanner;

public class div {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter first number");

		int a = sc1.nextInt();

		System.out.println("Enter 2nd number");

		int b = sc1.nextInt();

		try {
			int div = a / b;

			System.out.println("Division of two number is " + div);
		}

		catch (Exception e) {

			System.out.println("Exception if any is " + e);
		}

		finally {

			sc1.close();
		}
		
		System.out.println("  ");
		
		System.out.println("Compilation continues....");

	}

}
