package oops;

// 1. Constructor name should be same as that of the class name 2. Constructor is of Default, Parameterized and Non parameterized type

// 3. Constructor does not have any return type 4. If we do not create a Constructor, JVM is going to create a constructor by default 

public class Aadharcard {

	int adhar_id = 234;

	String aadhar_name = "Albert Eintein";

	int aadhar_number = 456789321;

	String aadhar_address = "New-Delhi";

	String aadhar_qrcode = "QR Code";

	public Aadharcard() {

		System.out.println("I am a non parametrized constructor");
	}
	
	String facingside="frontside";
	
	int page=2;
	
	String Size="Rectangle";

	public void Aadhar_id() {

		System.out.println("My aadhar id is " + adhar_id);

	}

	public void Aadhar_name() {

		System.out.println("My aadhar name is " + aadhar_name);

	}

	public void Aadhar_number() {

		System.out.println("My Aadhar number is " + aadhar_number);

	}

	public void Aadhar_address() {

		System.out.println("My Aadhar address is " + aadhar_address);

	}

	public void Aadhar_qrcode() {
		
		System.out.println("My Aadhar QR code is " + aadhar_qrcode);

	}

//	public static void main(String[] args) {
//
//		Aadharcard nm = new Aadharcard();
//
//		System.out.println(nm.adhar_id);
//
//		System.out.println(nm.aadhar_name);
//
//	}

}
