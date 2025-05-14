package Collection;

import java.util.LinkedList;

// Linked List in collection is used for faster execution

public class linkedlistI {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();

		ll.add("Dell");
		ll.add("HP");
		ll.add("Lenovo");
		ll.add("Acer");
		ll.add("Samsung");

		System.out.println("Size of linked list is " + ll.size());
		System.out.println(" ");
		System.out.println(ll);

		ll.add("Sony Vaio");
		ll.add("Toshiba");
		System.out.println(ll);

		ll.remove("Acer");
		ll.remove("Toshiba");
		System.out.println(ll);

	}

}
