package Keywrds_final;

public class ChildC1 extends Parent {

	public void c1behaviour() {

		System.out.println("Child's behaviour is c1");
	}

	public void c2behavioir() {

		System.out.println("Child's behaviour is c2");
	}

	public void Hair() {
		System.out.println("Both My fathers and mine hair is curly");
	}

	public void combo() {
		this.Hair();

		super.Hair();
	}

}
