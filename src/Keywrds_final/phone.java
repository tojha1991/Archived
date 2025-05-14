package Keywrds_final;

public class phone {

	// if we use final keyword with variable then we cannot change it

	// we cannot override a final method
	final int torch = 2;

	public void call() {

		System.out.println("Cellular phone has calling process");
	}

	public final void SMS() {

		System.out.println("My phone has messaging service");
	}

	public void Torch() {

		// torch = 4;
		System.out.println("My phone has Torchlighyt and count is " + torch);
	}
}
