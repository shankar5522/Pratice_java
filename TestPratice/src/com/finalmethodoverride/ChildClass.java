package com.finalmethodoverride;

public class ChildClass extends ParentClass {

	public void demo() {
		System.out.println("Demo method from Child");
	}

	//This is not allowed - throwing compilation issuse
	/*	public final void demoFInal() {
			System.out.println("Demo final method from Parent");
		}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass childClass = new ChildClass();
		childClass.demo();
		childClass.demoFInal(); // <- only calling parent final but cannt override with child class

	}

}
