package Homework;

public interface USbankInterf {

	int min_bal = 1000;

	public void credit();

	public void debit();

	public void moneytransfer();
}


// Only method prototypes
// In Interface we can decalare the variables, and variables are by default static in nature.
// we cannot change the value of variables ie. it is final in nature
// No static methods in Interface
// No main method in Interface
// we cannot create the object of Interface,as Interface are Abstract in nature
