package Practice;

import java.util.Scanner;
public class Programme_Votingeligibility {

	public static void main(String[] args) {
  
		Scanner sc=new Scanner(System.in);
		
		//Voting eligibility
		
		int age=sc.nextInt();

		if(age>=18) {
			
			System.out.println("You are eligible for voting ");
			
		}
		
		else{
			
			System.out.println("You are not eligible for voting ");
		}
		
		
	}

}
