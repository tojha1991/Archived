package Practice_methods_resusablity;

import Practice.classwork;

public class callclasswrkfromanotherpackage {


	public static void main(String[] args) {
		classwork.English();

		classwork.English();
		classwork.English(10, 20);
		classwork.English(20, 30, 20);
		classwork.English(20, 10, 20, 10);
	}

}
