/**
 * 
 */
package com.staticcontext;

/**
 * @author Shankar
 *
 */
public class NestedStaticContext {
	private static String str = "BeginnersBook";
	public int a = 4;

	public NestedStaticContext() {
		System.out.println("Main Constructor");
	}

	public static void display() {
		System.out.println("Main Class Static Method Display()");
	}

	public void mainMethod() {
		System.out.println("Normal Main Method");
	}

	// Static class
	static class MyNestedClass {
		// non-static method
		int a = 5;

		public MyNestedClass() {
			System.out.println("Nested Constructor");
			System.out.println(a);
		}

		public void disp() {

			new NestedStaticContext().mainMethod();

			/*
			 * If you make the str variable of outer class non-static then you will get
			 * compilation error because: a nested static class cannot access non- static
			 * members of the outer class.
			 * 
			 * System.out.println(a);
			 */

			System.out.println(str);
			NestedStaticContext.display();

		}

		public static void nestedBlock() {
			System.out.println("Nested Block");
		}
	}

	public static void main(String[] args) {

		// NestedStaticContext.MyNestedClass obj1 = new
		// NestedStaticContext.MyNestedClass();
		// obj1.disp();

		NestedStaticContext obj = new NestedStaticContext();
		obj.mainMethod();

		// new NestedStaticContext.MyNestedClass();
	}
}