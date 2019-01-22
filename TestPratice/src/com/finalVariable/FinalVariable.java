/**
 * 
 */
package com.finalVariable;

/**
 * @author Shankar
 * 
 *         https://beginnersbook.com/2014/07/final-keyword-java-final-variable-method-class/
 *
 */
public class FinalVariable {

	final int MAX_VALUE = 99;

	public void myDisplay() {
		// MAX_VALUE = 100; // not allowed
		// System.out.println("My Method : " + MAX_VALUE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable obj = new FinalVariable();
		System.out.println("Variable : " + obj.MAX_VALUE);
		obj.myDisplay();
	}

}
