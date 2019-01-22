/**
 * 
 */
package com.interface_2;

/**
 * @author Shankar
 *
 */
public class Impl implements A, B {

	public static void main(String args[]) {
		/* reference to x is ambiguous both variables are x
		    * so we are using interface name to resolve the 
		    * variable
		    */
		//System.out.println(x);       // compile time error
		System.out.println(A.x);
		System.out.println(B.x);
	}

}
