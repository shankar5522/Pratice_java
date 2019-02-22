package com.abstractClass;

public abstract class AbstractParent {

	/*
	 * according to rule
	 * variable only contain valid modifier like public, private, protected, static & final
	 */
	//abstract String str = "not allowed  abstract variable";

	final String str = "not allowed  abstract variable";

	protected AbstractParent() {
		// TODO Auto-generated constructor stub
		System.out.println("Abstract Parent Class Constructor");
	}

	public abstract void myAbstractMethod();

	public void abstractConcreteMetod() {
		System.out.println("This is Concrete method from abstract class");
	}

}
