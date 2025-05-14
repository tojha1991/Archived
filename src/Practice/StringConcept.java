package Practice;

public class StringConcept {

	public static void main(String[] args) {
		String name = "Ram";

		String name1 = "Ram";

		String name2 = new String("Ram");

		String name3 = new String("Ram");

		System.out.println(".equals() ");
		// .equals() :- content

		System.out.println(name.equals(name1)); // true

		System.out.println(name2.equals(name3)); // true

		System.out.println(name3.equals(name)); // true

		System.out.println(" ");
		System.out.println("==");

		// == :- it compare memory

		System.out.println(name == name1);// true

		System.out.println(name2 == name3);// true , false

		// .concat()
		System.out.println(" ");
		System.out.println("concat()");

		System.out.println(name.concat(name1));

		// .length()
		System.out.println(" ");
		System.out.println("length()");

		System.out.println(name.length());

	}

}
