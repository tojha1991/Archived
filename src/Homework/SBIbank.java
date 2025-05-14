package Homework;
//We are achieving multiple inheritance
//It is also called Is a relationship in inheritance
public class SBIbank implements USbankInterf, ICICIbank {

	@Override
	public void credit() {

		System.out.println("Credit account should be opened");
	}

	@Override
	public void debit() {

		System.out.println("Debit card should be there to access SBI services");
	}

	@Override
	public void moneytransfer() {

		System.out.println("SBI helps in transaction process");
	}

	public void loan() {
		System.out.println("Loan Interest rate in SBI is very low");
	}

	public void carloan() {
		System.out.println("Car loan is there in SBI");
	}

	@Override
	public void ICmutualfund() {

		System.out.println("Mutual fund of ICICI bank interface");

	}

}
