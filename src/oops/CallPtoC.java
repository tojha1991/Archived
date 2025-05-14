package oops;

public class CallPtoC extends ChildC2 {

	public static void main(String[] args) {

		Parent P = new Parent();

		P.p1behaviour1();

		P.p2behaviour2();

		P.p3behaviour3();

		ChildC1 Ch = new ChildC1();

		Ch.c1behaviour();

		Ch.c2behavioir();

		Ch.p1behaviour1();

		Ch.p2behaviour2();

		Ch.p3behaviour3();

		ChildC2 Child = new ChildC2();

		Child.C2behaviour();

		Child.C3behaviour();

		Child.c1behaviour();

		Child.c2behavioir();

		Child.C3behaviour();

		Child.p1behaviour1();

		Child.p2behaviour2();

		Child.p3behaviour3();

	}

}
