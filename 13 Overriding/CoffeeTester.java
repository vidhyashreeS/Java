package com.xworks.inheritance.overriding;

public class CoffeeTester extends CoffeeDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the Tester class");
		CoffeeTester ct = new CoffeeTester();
		ct.Drinking();
		ct.location = "Banglore";
		ct.price = 120;
		ct.type = "cafe latte";
		ct.served="Cold";
		System.out.println("        Welcome to " +ct.location+ " CAFE COFFEE DAY       ");
		
		
		ct.DisplayDetails();
	}
	//Overriding
	void Drinking(){
		System.out.println("-------Anything can happen over a cup of coffee-------");
		
	}
	 
	 
}
