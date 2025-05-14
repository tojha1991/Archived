package newpackage;
import java.util.Scanner;

public class Swapping_usingthird_variable {

	public static void main(String[] args) {

		int a,b,temp;
		
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Before swap number is "+ a+" "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap number is "+ a+" "+b);

		
		
	}

}
