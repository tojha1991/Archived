package Practice;

//Whenever you are creating an object a constructor is going to get created

	// Constructor name should be same as of the class name

	// Constructor does not have any type

	// You don't need to call a constructor it is going to initliaze itself
	// automatically

	// Constructor :- Default , non parameterized , parameterized

	// non parameterized

public class ObjectBike {
	


	public void wheels() {

		System.out.println("Bike has two wheels");
	}

	int wheels=1;
	
	String headlight="Amoled";
	
	public void light() {

		System.out.println("Bke now comes with LED light");
	}

	public void Enginetype() {
		
		int enginetype=121;

		System.out.println("Bike comes with either one engine or Two Engine " + enginetype);
	}

}
