/**
 * 
 */
package com.staticcontext;

/**
 * @author Shankar
 *
 */

/*
 * Not able to access non static context in inside static context
 */
public class Static {

	/**
	 * @param args
	 */
	int a = 2;

	public static void staticMethod() {
		// a = 6; <- not able to access
	}

	public void a() {
		a = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
