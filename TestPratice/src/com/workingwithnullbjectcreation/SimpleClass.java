/**
 * 
 */
package com.workingwithnullbjectcreation;

/** @author Shankar */
public class SimpleClass {

	/** This is class is used to check the,whether
	 * does creating null obj for this class can
	 * access the methods or not(both static as well
	 * as non static method) */

	public void simpleMethod() {
		System.out.println("This is from Simple Method calling from null object");
	}

	public static void normalStaticMethod() {
		System.out.println("This is the Normal static method");
	}

}
