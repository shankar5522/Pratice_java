/**
 * 
 */
package com.interfaces;

/**
 * @author Shankar
 *
 */
public interface MyInterface {

	String str = "My Interface";
	public static final int a = 5;

	//int c;    // interface variable must be initialized in the interface otherwaise it's  throws an error

	void method1();

	public abstract int method(int a); // checking interface contain return values or not

}
