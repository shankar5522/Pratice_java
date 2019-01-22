package com.runwithoutmainmethod;

/*Ans: The atleast blank main method is compulsory in case of jdk >5 along with static block.
Otherwise throwing an runtime issue(means compile time it’s work)*/


public class Impl {


	static {
		System.out.println("Can be Run");
		Classcaller obj = new Classcaller();
		obj.test();
		System.out.println("Last line in static block");
		
		String a[] = {"s", "rf"};
		//main(a);
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside Main");
	}*/

}
