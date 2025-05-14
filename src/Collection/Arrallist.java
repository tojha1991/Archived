package Collection;

import java.util.ArrayList;

public class Arrallist {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();

		arr.add("Tiger");

		arr.add("Lion");

		arr.add("Fox");

		arr.add("Monkey");

		System.out.println(arr.size());

		System.out.println(arr);

		arr.add("Rabbit");

		arr.add("Rat");

		arr.add("kangaroo");

		System.out.println(arr);

		System.out.println("Next is for each loop execution");

		for (String abc : arr) {
			System.out.println(abc);

		}

//		ArrayList<String> fruit = new ArrayList<>();

//		fruit.add("Apple");
//		fruit.add("Banana");
//		fruit.add("Guava");
//		fruit.add("Orange");
//		fruit.add("Kiwi");
//		fruit.add("Dragon Fruit");
//		fruit.add("Watermelon");
//		fruit.add("muskmelon");
//		fruit.add("mango");
//		fruit.add("grapes");
//		fruit.add("litchi");
//
//		System.out.println("Size=:" + fruit.size());
//		System.out.println(fruit);
//
//		fruit.add("Apple");
//		fruit.add("Banana");
//		fruit.add("Guava");
//		fruit.add("Orange");
//
//		System.out.println(" ");
//		System.out.println("Size=:" + fruit.size());
//		System.out.println(fruit);
//
//		System.out.println(" ");
//
//		// Iterating the array
//		for (String frt : fruit) {
//			System.out.println(frt);
//		}

	}

}
