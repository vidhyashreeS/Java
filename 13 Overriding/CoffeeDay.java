package com.xworks.inheritance.overriding;

public class CoffeeDay{
	String type;
	int price;
	String location;
	String served;
	
	
	CoffeeDay(){
		System.out.println("----------Welcome to cafe coffee day-----------" );
	}
	void DisplayDetails(){
		System.out.println("		location :" +location+ "\n"+ "		type :" +type+ "\n" +"		price :Rs." +price+ "\n" +"		Served :" +served+ "\n");
	}
	CoffeeDay(String inType, int inPrice ,String inLocation){
		type = inType;
		price = inPrice;
		location = inLocation;
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	void Drinking(){
		System.out.println("Coffee is Love");
	}
	
}
