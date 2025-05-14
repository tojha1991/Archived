package oops;

public class calling_aadharcard {

	public static void main(String[] args) {

		Aadharcard adhar = new Aadharcard();

		adhar.Aadhar_address();

		adhar.Aadhar_id();

		adhar.Aadhar_name();

		adhar.Aadhar_number();

		adhar.Aadhar_qrcode();
		
		System.out.println("****************************************");

		System.out.println("Page Size of Adhar card is " + adhar.page);

		System.out.println("Photo Size of Aadhar card is " + adhar.Size);

		System.out.println("Facing side of Aadhar card is " + adhar.facingside);

	}

}
