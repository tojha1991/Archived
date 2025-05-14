package oops;

public class Phone_methodcl {

	public static void main(String[] args) {

		Phone_Overiding phovr = new Phone_Overiding();

		phovr.SMS();

		phovr.network();

		phovr.calling();

		Smartphone_ovrdng sm = new Smartphone_ovrdng();

		sm.camera();

		sm.FiveGNetwork();

		sm.SMS();

		sm.calling();

		sm.network();

	}

}
