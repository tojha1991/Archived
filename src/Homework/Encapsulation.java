package Homework;

//Encapsulation is defined as wrapping of Data members and variables into a single unit
//In Encapsulation,we should declare data as Private and methods as public

public class Encapsulation {

	private String EmpCode;

	private int EmpSalary;

	private int Prjctcode;

	public String getEmpCode() {
		return EmpCode;
	}

	public void setEmpCode(String empCode) {
		EmpCode = empCode;
	}

	public int getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}

	public int getPrjctcode() {
		return Prjctcode;
	}

	public void setPrjctcode(int prjctcode) {
		Prjctcode = prjctcode;
	}

	public static void main(String[] args) {

		Encapsulation enc = new Encapsulation();

		enc.setEmpCode("TKO1991");
		enc.setEmpSalary(100000);
		enc.setPrjctcode(5678);

		System.out.println("Value of Employee code is : " + enc.getEmpCode());

		System.out.println("Employess salary whose emp code TKO1991 is: " + enc.getEmpSalary());

		System.out.println("Employees Project code is : " + enc.getPrjctcode());

	}

}
