package Collection;

public class ary {

	public static void main(String[] args) {

		String[] abc = { "a", "b", "c", "d" };

		System.out.println(abc.length);

		System.out.println(abc[0]);

		// System.out.println(abc[3]);

		try {

			System.out.println(abc[10]);
		}

		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("  ");

		for (int i = 0; i < abc.length; i++) {

			System.out.println(abc[i]);

		}

		System.out.println("Now its turn for each loop");

		for (String test : abc) {

			System.out.println(test);
		}

	}

}
