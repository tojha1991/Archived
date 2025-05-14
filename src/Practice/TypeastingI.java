package Practice;

//Widening type casting

//byte -> short -> char -> int -> long -> float -> double

public class TypeastingI {

	public static void main(String[] args) {

		int abc = 13;
		double dd = abc;

		System.out.println(dd);

		int x = 12;
		float f = x;

		System.out.println(f);

		double d = 12.4d;
		int i = (int) d;
		System.out.println(i);

		float fl = 12.45f;
		long ln = (long) fl;
		System.out.println(ln);

		float f12 = 34.56f;
		int int1 = (int) f12;
		System.out.println(int1);

		double d23 = 123456.789012;

		float f123 = (float) d23;

		System.out.println(f123);

		int max_score = 500;

		int user_score = 424;

		float ff = (float) user_score / max_score * 100;

		System.out.println(ff);

	}

}
