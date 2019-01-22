/**
 * 
 */
package com.interfaces;

/**
 * @author Shankar
 *
 */
public class InterfaceImpl implements MyInterface {

	InterfaceImpl() {
		System.out.println("Constructor of Child class in Interface");
	}

	/* (non-Javadoc)
	 * @see com.interfaces.MyInterface#method1()
	 */
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface :  method 1");

	}

	/* (non-Javadoc)
	 * @see com.interfaces.MyInterface#method(int)
	 */
	@Override
	public int method(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	public void normalMethod() {
		System.out.println("Child class normal method");
	}

	public static void main(String args[]) {

		// not allow to create object of Interface
		//MyInterface obj = new MyInterface();   

		int b = a;
		System.out.println("Variable from Interface : " + b + "   " + str);

		/*		MyInterface myInterface = null;
				InterfaceImpl obj = new InterfaceImpl();
				obj.normalMethod(); // calling child class normal method
		
				myInterface = obj;
				myInterface.method1();
				System.out.println("Interface return : " + myInterface.method(10));
				System.out.println("Caling child Class normal method from Interface Reference : ");*/

		//myInterface.normalMethod(); // not allow to call normal method from child class method via interface reference 

		MyInterface obj = new InterfaceImpl();
		obj.method1();
		obj.method(50);

		System.out.println("call Interface variable : " + MyInterface.a);
	}

}
