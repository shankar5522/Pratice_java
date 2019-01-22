package com.constructor.inheritance;

public class Child extends Parent {

	public Child(int a) {
		System.out.println("Child Class Constructor : " + a);
	}

	public Child() {
		System.out.println("Child Class DEFAULT Constructor : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child child = new Child(5);

		Child child = new Child();
	}

}
