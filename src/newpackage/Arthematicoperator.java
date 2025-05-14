package newpackage;
import java.util.Scanner;

public class Arthematicoperator {

	public static void main(String[] args) {

		// +,_,*,/,%
		//division value only takes quotient value in the output
		//modulo value only takes remainder vale in the output
		
		/*int a=20;
		int b=10;
		//int c=a+b;
		System.out.println(a+b); //o/p is 30
		System.out.println(a*b); //o/p is 200
		System.out.println(a-b); //o/p is 10
		System.out.println(a/b); //o/p is 2
		System.out.println(a%b); //o/p is 0
		*/
		
		int a;
		int b;
		System.out.println("Enter any number");
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Addition of a and b is " + (a+b));
		System.out.println("Substraction of a and b is " + (a-b));
		System.out.println("Multiplication of a and b is " + (a*b));
		System.out.println("Division of a and b is " +(a/b));
		System.out.println("Modulo of a and b is " +(a%b));
		
		
	}

}
