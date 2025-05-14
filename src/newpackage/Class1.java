package newpackage;

public class Class1 {
	
	String uid="Tripurari"; // This is default String global variable
	String pwd="mypassword123"; // This is default String global variable
	
	public void login() // No parameterized method 
	{
		System.out.println("My login username is " + uid);
		System.out.println("My login password is " + pwd);
	}
	
	public void parameterizedlogin(String username,String password) {
		
		uid=username;
		pwd=password;
		
		System.out.println("My paramlogin is "+ uid +" and " + pwd);
	}
	void show() {
		int x=10;
		int y=20;
		int z=x+y;
		
		System.out.println("value of z is " + z);
	}
	
	static int age; // Global/instance object will be instantiated in 3 ways
	
	public static void main(String[] args) {
		
		
		Class1 test=new Class1(); // This is also called as default constructor
		test.show();
		test.login();
		age=22;
		System.out.println("output of age is "+ age);
		
		
		Class1 test1=new Class1();// One type of Login example
		test1.uid="Tripurari1";
		test1.pwd="password";
		test1.login();
		
		Class1 test2=new Class1();// Second type of Login example
		test2.parameterizedlogin("tripurari ojha", "java class");
	}
	
	   

}
