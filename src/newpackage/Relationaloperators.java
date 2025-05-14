package newpackage;
import java.util.Scanner;

public class Relationaloperators {

	public static void main(String[] args) {

		int a;
		int b;
		System.out.println("Enter any to numbers");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("true/false " + (a>b));
		System.out.println("true/false " + (a<b));
		System.out.println("true/false " + (a>=b));
		System.out.println("true/false " + (a<=b));
		System.out.println("true/false " + (a==b));
		System.out.println("true/false " +(a!=b));

		
	}

}
