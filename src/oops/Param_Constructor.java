package oops;

public class Param_Constructor {

	int id = 1;

	String name = "Namo";

	public Param_Constructor(String name) {

		System.out.println("I am a parameterized constructor " + name);

	}
	
	//Non Parameterized constructor

	public Param_Constructor() {

		System.out.println("I am a non parametrized constructor");
	
	}

	public void Test1() {

		System.out.println("I am  Test1");
	}

	public void Test2() {

		System.out.println("I am Test2");
	}

	public void Test3() {

		System.out.println("I am Test3");
	}

}
