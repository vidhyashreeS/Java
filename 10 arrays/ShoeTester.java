package com.xworkz.arrays.assignments;

public class ShoeTester {
	public static void main(String[] args){ 
		Shoe[] shoeTester = new Shoe[4];
		
		Shoe puma = new Shoe();
		puma.brand = "puma";
		puma.color = "black";
		puma.size = 38;
		puma.price = 6999.00;
		shoeTester[0]=puma;
		
		Shoe bata = new Shoe();
		bata.brand = "bata";
		bata.color = "Pink";
		bata.size = 40;
		bata.price = 8989.00;
		shoeTester[1]=bata;
		
		Shoe nike = new Shoe();
		nike.brand = "nike";
		nike.color = "Neon_Green";
		nike.size = 38;
		nike.price = 11499.00;
		shoeTester[2]=nike;
		
		for(Shoe s: shoeTester){
			if(s!=null)
			s.printDetails();
			
		}
		}
}
