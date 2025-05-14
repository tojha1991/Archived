package oops;

public class AccessModifiers {

	public void publicMthd() {
		System.out.println("I am a public method");
	}

	private void privatemthd() {

		System.out.println("I am a Private method");
	}

	protected void protectedmthd() {
		System.out.println("I am a Protected method");
	}

	void defaultmthd() {
		System.out.println("I am a default method");
	}

	public static void main(String[] args) {

		AccessModifiers acc = new AccessModifiers();

		acc.publicMthd();

		acc.privatemthd();

		acc.protectedmthd();

		acc.defaultmthd();

	}
}
