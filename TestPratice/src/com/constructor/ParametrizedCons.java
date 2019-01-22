package com.constructor;

// https://beginnersbook.com/2013/03/constructors-in-java/

public class ParametrizedCons {

	int a;

	/*	public ParametrizedCons() {
			System.out.println("Default");
		}*/

	public ParametrizedCons(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Parameter Constructor");
		this.a = a;
	}

	public int getValue() {
		//System.out.println("Value of a : " + a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametrizedCons obj = new ParametrizedCons(5);
		System.out.println("Value of a : " + obj.getValue());

		/*ParametrizedCons obj1 = new ParametrizedCons();
		System.out.println("Value of a : " + obj1.getValue());*/
	}

}
