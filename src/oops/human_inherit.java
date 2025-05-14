package oops;

public class human_inherit {

	public static void main(String[] args) {

		Inheritance_concept inct = new Inheritance_concept();

		inct.father_dressingsense();

		inct.father_wearspecs();

		inct.fathers_foodchoice();

		System.out.println("     ");

		SubInheritnace sbinct = new SubInheritnace();

		sbinct.child_rituals();

		sbinct.child_speaks();

		sbinct.father_dressingsense();

		sbinct.father_wearspecs();

		sbinct.fathers_foodchoice();

		System.out.println("          ");

		Super_subinheritance lvl = new Super_subinheritance();

		lvl.grand_child1();

		lvl.grand_child2();

		lvl.child_rituals();

		lvl.child_speaks();

		lvl.father_dressingsense();

		lvl.father_wearspecs();

		lvl.fathers_foodchoice();

	}

}
