package Homework;

public class Testoverrdng {

	public static void main(String[] args) {

		// Static or compile time polymorphism
		child ch = new child();

		ch.hair();
		ch.height();
		ch.tummy();
		ch.skincolor();

		System.out.println("  ");

		// this is runtime polymorphisn or dynamic polymorphism- Here Child class
		// objects are referred by parent class reference variable

		parent p = new child();

		p.height();

		p.skincolor();

		p.tummy();

	}

}
