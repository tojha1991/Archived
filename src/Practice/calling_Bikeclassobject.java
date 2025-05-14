package Practice;

import java.util.Scanner;

public class calling_Bikeclassobject {

	public static void main(String[] args) {

		ObjectBike bk = new ObjectBike();

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter any number");

		int test = sc.nextInt();
		if (test == 1) {
			bk.Enginetype();
		}

		else if (test == 2) {
			bk.light();
		}

		else
			bk.wheels();

//		bk.Enginetype();
//		bk.light();
//		bk.wheels();
//
//		System.out.println(bk.wheels);
//
//		System.out.println(bk.headlight);

	}

}
