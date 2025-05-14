package Homework;

public class ThisConstrctr {

	String name;

	int i;

	public ThisConstrctr(String name, int i) {

		this.name = name;
		this.i = i;

		System.out.println(name);
		System.out.println(i);
	}

	public static void main(String[] args) {
		ThisConstrctr cnst = new ThisConstrctr("Tommy", 100);
	}

}
