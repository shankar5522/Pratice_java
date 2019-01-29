package com.inheritance.multiple.objects;

public class SubChildClass extends ChildClass {

	public SubChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Sub Child Class Constructor");
	}

	public void subChild() {
		System.out.println("Sub Child Class Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * Here calling corresponding constrcutor of class after new keyword
		 */

		/* ParentClass parent = new ParentClass();
		ChildClass child = new  ChildClass();
		SubChildClass sub = new SubChildClass();*/

		//this is not allowed as usuall as cann't hold parent class object
		//ChildClass child2 = new ParentClass();


		/*
		 * now creating reference of parent n object of child
			now concern here which class method i can able to call
			
			Checking the relation between ChildClass n ParentClass & similary we can find
			the relation between any 2 classed and only able to access the method of parent class 
		 */
		/*ParentClass parent2 = new ChildClass();
		parent2.parent();*/
		//parent2.child();         //  <- cann't access it due to inheritance rule
		//parent2.myStatic()      // even not able to call static method 
		
		
		/*
		 * here checking the relation between 
		 */
		ParentClass parent = null;
		ChildClass child = new ChildClass();
		child.child();
		child.parent();
		
		// now assign child object to parent reference variable then ????
		parent = child;
		parent.parent();
		
		
		
		//child = parent;            <- not allowed due to inheritance concept?? but which concetp, just think about it. Hint : 3rd rule


	}

}
