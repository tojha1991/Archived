package newpackage;

public class Typecasting {

	public static void main(String[] args) {

		//byte>short>int>long
		//float>double
	
		//Widening or implicit
		
		short s=45;
		int i;
		i=s;
		System.out.println(i);

		int i1=10;
		long l;
		l=i1;
		System.out.println(l);
		
		long l1=20;
		double d;
		d=l1;
		System.out.println(d);
		
		float f=99;
		double d1;
		 d1=f;
		 System.out.println(d1);
		 

		 //Narrowing or explicit
		 
		 float f2=25;
		 short s2;
		 s2=(short)f2;
		 System.out.println(s2);
		 
		 
		
	}

}
