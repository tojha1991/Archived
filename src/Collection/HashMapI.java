package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapI {

	public static void main(String[] args) {

		HashMap<Integer, String> login = new HashMap<>();
		login.put(1, "Dell");
		login.put(2, "HP");
		login.put(3, "Lenovo");
		login.put(4, "Acer");

		System.out.println(login.size());
		// System.out.println(login);

		System.out.println(" ");
		System.out.println(login.keySet());
		System.out.println(" ");
		System.out.println(login.values());

		// Integrating only keys using for each loop
		System.out.println(" ");

		for (Integer intr : login.keySet()) {

			System.out.println(intr);
		}

		System.out.println(" ");
		// Integrating only values using for each loop

		for (String sr : login.values()) {
			System.out.println(sr);
		}

		System.out.println(" ");

		// Integrating both keys and values using for each loop

		for (Entry<Integer, String> ent : login.entrySet()) {
			System.out.println(ent);

		}
	}
}
