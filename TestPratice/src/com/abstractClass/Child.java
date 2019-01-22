package com.abstractClass;

public class Child extends AbstractParent {

	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Child Class Constructor");
	}

	@Override
	public void myAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("impl for Abstract method in  child class");

	}

	public void childMethod() {
		System.out.println("Child normal method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Child(); // this will only call parent class then child class constructor

		//AbstractParent obj = new AbstractParent();    // Abstract class can't be intantiated, throwing Compile err

		/*
		 * here creating object of child but reference of Parent,
		 * so can be able to call parent class method by using the inheritance concept
		 */
		/*AbstractParent obj = new Child();
		obj.myAbstractMethod();
		obj.abstractConcreteMetod();*/
		//obj.childMethod();      // throwing compile time error because of inheritance concept, use below inheritance concept

		Child obj = new Child();
		obj.myAbstractMethod();
		obj.abstractConcreteMetod();
		obj.childMethod();
		System.out.println("Parent Valrialbe : " + obj.str); //can access in child class, because of inheritance concept
	}

}
