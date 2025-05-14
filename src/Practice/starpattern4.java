package Practice;

public class starpattern4 {

	public static void main(String[] args) {

		// To print star in this pattern upto 4 row and 4 column
		// *
		// **
		// ***
		// ****

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");

			}
			System.out.println();

		}

	}

}
