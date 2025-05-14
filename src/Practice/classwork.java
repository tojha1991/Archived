package Practice;


public class classwork {

	public static void English() {

		System.out.println("English is my favourite subject");
	}

	public static void English(int a, int b) {

		int marks = a + b;

		System.out.println("Total int and external marks in English is " + marks);
	}

	public static void English(int a, int b, int c) {
		
		int avg=a+b+c;

		System.out.println("Total marks in English including viva,internal test and external viva as " + avg);
	}

	public static void English(int a, int b, int c, int d) {
		
		int avg_marks_of_whole_class=a+b+c+d;

		System.out.println("Average marks of english in whole class is " + avg_marks_of_whole_class);
	}

	public static void main(String[] args) {
		classwork.English();
		classwork.English(80, 20);
		classwork.English(20, 30, 40);
		classwork.English(10, 20, 30, 20);

	}

}
