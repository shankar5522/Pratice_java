package com.inheritance.multipleinheritance;

public class Maruti800 extends Maruti {

	/*	public Maruti800() {
			System.out.println("Maruti Model: 800");
		}*/

	public void speed() {
		//super.speed();
		System.out.println("Max: 80Kmph");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		Maruti800 obj = new Maruti800();
				obj.vehicleType();
				obj.brand();
				obj.speed(); *///while creating object, here calling of child class speed.
								// if want to call parent class method override method then use super keyword in line 10

		Maruti obj = new Maruti800();
		obj.speed(); // here not able to get the metohd from Mariti800 - speed metho but why ????

	}

}
