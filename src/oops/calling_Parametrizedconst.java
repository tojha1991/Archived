package oops;

public class calling_Parametrizedconst {

	public static void main(String[] args) {

		Param_Constructor pc = new Param_Constructor();

		pc.Test1();

		pc.Test2();

		pc.Test3();

		System.out.println(pc.id);

		System.out.println(pc.name);
		
		System.out.println("------------------------------------");

		Param_Constructor pc1 = new Param_Constructor("Amit Shah");

		pc1.Test1();

		pc1.Test2();

		pc1.Test3();

	}

}
