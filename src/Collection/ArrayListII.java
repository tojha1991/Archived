package Collection;

import java.util.ArrayList;

//Arraylist in collection is mostly used due to its faster access

public class ArrayListII {

	public static void main(String[] args) {

		ArrayList<Integer> in = new ArrayList<>();

		in.add(1);

		in.add(2);

		in.add(3);

		in.add(4);

		System.out.println(in.size());

		System.out.println(in);

		in.remove(2);

		try {

			in.remove(4);

			System.out.println(in);
		}

		catch (Exception e) {
			System.out.println("exception is " + e);
		}
	}

}
