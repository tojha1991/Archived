package Practice;

import oops.AccessModifiers;

public class cal1stacsmdf extends AccessModifiers {

	public void test() {
		System.out.println("This is of another package");
	}

	public static void main(String[] args) {

		AccessModifiers mf = new AccessModifiers();

		mf.publicMthd();

		System.out.println("  ");
		
		
		//we can call protected method is child class which is inheriting paent class

		// Calling methods from current package to different package
		cal1stacsmdf twig = new cal1stacsmdf();

		twig.protectedmthd();

		twig.publicMthd();

		// Private method cannot be called

	}

}
