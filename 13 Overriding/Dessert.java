package com.xworks.inheritance.overriding;

public class Dessert {
	String type;
	int price;
	
	public Dessert() {
		// TODO Auto-generated constructor stub
		System.out.println("--------------------------DESSERT------------------------");
		
	}
	void Details(){
		System.out.println("The type of dessert is " +type+ " and its cost is Rs."+price);
	}
	Dessert(String intype, int inprice){
		type = intype;
		price = inprice;
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
	void eating(){
		System.out.println("We all love to eat Desserts");
	}

}
