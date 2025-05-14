package newpackage;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {

		int n;
		
		System.out.println("Enter any number");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		if(n%2==1) {
			
			System.out.println("Number is odd");
			
		}
		
		else 
		{
			System.out.println("Number is even");
			
		}
			
		}
	}


