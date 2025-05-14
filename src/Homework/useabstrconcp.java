package Homework;

public class useabstrconcp extends abstrctconcpt {

	public static void main(String[] args) {

		abstrctconcpt ab = new useabstrconcp();

		ab.pencil();
		ab.pen();

	}

	@Override
	void pencil() {

		System.out.println("Pencil method has been overridden");
	}

}
