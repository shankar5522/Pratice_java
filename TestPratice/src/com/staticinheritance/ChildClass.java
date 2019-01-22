/**
 * 
 */
package com.staticinheritance;

/**
 * @author Shankar
 *
 */

/*
 * static method cannot be inherited in the sub class because they belong to the
 * class in which they have been declared.
 * 
 * https://beginnersbook.com/2013/05/static-constructor/
 */
public class ChildClass extends StaticParentContext {

	public void normalChildMethod() {
		System.out.println("Normal Child Method");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass childClass = new ChildClass();
		childClass.normalChildMethod();
		childClass.parentNprmalMethod();
		childClass.parentStaticMethod();

		StaticParentContext.parentStaticMethod();

	}

}
