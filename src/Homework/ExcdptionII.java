package Homework;

//Null pointer exception

public class ExcdptionII {

	public static void main(String[] args) {

		String st = null;

		try {
			System.out.println("value of string is " + st.toLowerCase());
		} catch (Exception e) {
			System.out.println("Valeu of exception is " + e);
		}
	}

}
