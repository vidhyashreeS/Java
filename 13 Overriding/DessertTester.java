package com.xworks.inheritance.overriding;

public class DessertTester extends Dessert{
	public static void main(String[] args) {
	System.out.println("This is a Tester class i.e child class");
	DessertTester dt = new DessertTester();
	dt.type = "Choco Mouse";
	dt.price = 160;
	dt.eating();
	dt.Details();
	System.out.println("---------------------------------------------------------");
	
	}
	//@Overriding
	void eating(){
		System.out.println("*********Overriding of a Desert class***************");
	}
}
