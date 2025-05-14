package Practice;

//2:- Write a java code for creating a class with 2 methods , one method write down logic for fact of 5 and on another method write down logic for addition of num upto 100.
public class misclaneus {

	public static void factof5() {

		int fact = 1;
		int num = 5;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

			System.out.println("factorialof 5 is " + fact);

		}

	}

	public static void additionof100num() {

		int a = 1;
		int sum = 0;

		for (a = 1; a <= 100; a++) {
			sum = sum + a;

			System.out.println("sum of 100 numbers is " + sum);
		}

	}

	public static void main(String[] args) {

		misclaneus.factof5();
		misclaneus.additionof100num();

	}

}
