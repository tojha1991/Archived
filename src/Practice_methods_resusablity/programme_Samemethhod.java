package Practice_methods_resusablity;

public class programme_Samemethhod {

	public static void Nursery() {

	}

	public static void Nursery(int a) {

		int str = a;

		System.out.println("Total strrength of Nursery class is " + str);

	}

	public static void Nursery(int a, int b) {

		int abcd = a + b;

		System.out.println("Average Percentage of Class UKG is " + abcd);
	}

	public static void Nursery(float ft) {

		double db = 5000 / ft;

		System.out.println("Average Percentage of Class UKG is " + db);
	}

	public static void main(String[] args) {

		programme_Samemethhod.Nursery();
		programme_Samemethhod.Nursery(89);
		programme_Samemethhod.Nursery(87, 98);
		programme_Samemethhod.Nursery(96.3f);

	}

}
