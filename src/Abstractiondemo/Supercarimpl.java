package Abstractiondemo;

public class Supercarimpl implements Supercar, Flyingcar {

	@Override
	public void torque() {

		System.out.println("This is Torque of car");
	}

	@Override
	public void displacement() {

		System.out.println("This is displacement of car");
	}

	@Override
	public void run() {
		System.out.println(" Running speed of car is 200mph");
	}

}
