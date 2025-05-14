package Practice;

import java.util.Scanner;

public class Programme_Calculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("String value is ");
		
		String str=sc.next();
		
		System.out.println("1st value is ");

		
		int a=sc.nextInt();
		
		System.out.println("2nd value is");

		
		int b=sc.nextInt();
		

		if(str.equals("+")) {
		
		int sum=a+b;
		System.out.println("Result is " + sum);
		}
		
		if(str.equals("-")) {
		
			int sub=a-b;
			System.out.println("Result is " + sub);
		}
		
		else if(str.equals("/")) {
		
		int div=a/b;
		System.out.println("Result is " + div);
		
		}
		
		else if(str.equals("*"))
		{
		int mul=a*b;
		System.out.println("Result is " + mul);
		}
		
		else {
			System.out.println("Invalid result ");
		}
		
		
	}

}
