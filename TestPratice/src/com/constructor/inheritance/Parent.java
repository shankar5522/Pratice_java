package com.constructor.inheritance;

//https://beginnersbook.com/2013/03/inheritance-in-java/

// here checking the constrcutore with callin default parameter concept

public class Parent {

	public Parent(int a) {
		System.out.println("Parent Class Constructor : " + a);
	}

	public Parent() {
		System.out.println("Parent Class DEFAULT Constructor : ");
	}
}
