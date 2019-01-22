/**
 * 
 */
package com.staticconstructor;

/**
 * @author Shankar
 *
 */
public class ChildConstructor extends StaticConstructor {

	/**
	 * 
	 */
	public ChildConstructor() {
		System.out.println("Child Class Constructor");
	}

	public static void main(String arg[]) {
		ChildConstructor childConstructor = new ChildConstructor();
	}

}
