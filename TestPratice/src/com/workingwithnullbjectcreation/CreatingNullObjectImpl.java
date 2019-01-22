/**
 * 
 */
package com.workingwithnullbjectcreation;

/** @author Shankar
 * 
 *         This class is used to implement purpose
 * 
 *         Package :
 *         com.workingwithnullbjectcreation; Class
 *         : SimpleClass.java */
public class CreatingNullObjectImpl {

	public static void main(String arg[]) {
		// creating object of class and access the normal
		// methods

		/* SimpleClass simple = new SimpleClass();
		 * System.out.println("Can be Access ");
		 * simple.simpleMethod(); */

		// now creating object with null and access the
		// normal method
		// SimpleClass obj = null;
		// obj.simpleMethod(); // once compiler reach to
		// here then it throws null pointer exception

		/* now accessing the static method in normal ways
		 * we can access the static method with object or
		 * without object(but using class Name) */

		/* SimpleClass obj = new SimpleClass();
		 * obj.normalMethod(); SimpleClass.normalMethod();
		 * obj.simpleMethod(); */

		// now creating null object and accessing static
		// method from that object
		SimpleClass object = null;
		object.normalStaticMethod(); // <-Static method Can be call via null object
		object.simpleMethod();// <- but when the compiler reached this line it
								// throws an error
	}

}
