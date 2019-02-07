package com.inheritance.inheritance.method_overriding;

public class ChildClass extends BaseClass {

	public ChildClass() {
		System.out.println("Constructor of Child");
	}
	public void disp(){
		System.out.println("Child override Method");
		//Calling the disp() method of parent class
		//super.disp();
	}
	
	public void childMethod() {
		System.out.println("child display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		ChildClass child = new ChildClass();
		child.disp();           // <- here it call child override method 1st, because creating object of child class
		child.childMethod();
		child.parentMethod();   // accessing parent class method because of inheritance concept
*/		
		
		
		BaseClass base = new BaseClass();
		base.disp();            // <- here it call only parent class overridde method, becuase creating object of parent class
		base.parentMethod();
		
		/*BaseClass base = new ChildClass();
		base.disp();            // here it call child override method 1st, in case of method override call is made according
								// to the type of refenced object, not according to to the reference.

		base.parentMethod();    // but normal method from parent class only (it is not comes under method override concept)
		*/
		//base.childMethod();   // <- not allowed throwing an compile time err
	}

}
