package Homework;

public class TestIterf {

	public static void main(String[] args) {

		System.out.println("Min balance to open a/c in HSBC is " + USbankInterf.min_bal);

		SBIbank sbi = new SBIbank();

		sbi.carloan();

		sbi.credit();

		sbi.debit();

		sbi.loan();

		sbi.moneytransfer();

		sbi.ICmutualfund();

		System.out.println(" ");

		// Child class ref can be accessed by parent interface ref
		// Only overridden metods can be called

		USbankInterf usb = new SBIbank();

		usb.credit();
		usb.debit();
		usb.moneytransfer();

	}
}
