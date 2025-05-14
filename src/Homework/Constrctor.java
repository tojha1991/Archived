package Homework;

//Constructor

public class Constrctor {

	public Constrctor() {

		System.out.println("This is default constructor");

	}

	public Constrctor(int a) {

		System.out.println("This is a single parameterized constructor " + a);

	}

	public Constrctor(int a, int c) {
		System.out.println("This is two parametrized constructor " + a);

		System.out.println("This is second value of parametrized constructor " + c);
	}

	public static void main(String[] args) {
		Constrctor def = new Constrctor();

		Constrctor oneprm = new Constrctor(100);

		Constrctor twoprm = new Constrctor(100, 200);

	}

}
