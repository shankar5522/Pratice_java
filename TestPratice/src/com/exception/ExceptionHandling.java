package com.exception;

public class ExceptionHandling {

	public static void main(String args[]) {
		System.out.println(print());
	}

	public static String print() {
		try {
			System.out.println("Executing try block");
			int a = 5 / 0;
			System.out.println("Value of a " + a);
			// return "Return from try block";
			System.out.println("Print");
		} catch (Exception e) {
			// return "Catch Blcok";
			e.printStackTrace();

		} finally {
			System.out.println("Executing finally block");
			return "Return from finally block";
		}
	}
}
