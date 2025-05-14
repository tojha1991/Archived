package newpackage;
import java.util.Scanner;


public class greatest_two_number {

	public static void main(String[] args) {

		int a,b;
		System.out.println("Enter any number");
	
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	
	//Two numbers logic
	if(a>b) {
		System.out.println("a is greater than b");
	}
	
	else  {
		System.out.println("b is greater than a");
		
	}
	
	
	
}
}
