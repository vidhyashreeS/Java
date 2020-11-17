package com.xworkz.arrays.assignments;

public class IceCreamTester {
public static void main(String args[]){
		
		IceCream[] IceCreamTester = new IceCream[3];
		
		IceCream amul = new IceCream();
		
		amul.brand = "AMUL";
		amul.flavour = "Butterscotch";
		amul.price = 45;
		amul.type = "Cone";
		IceCreamTester[0] = amul;
		
		IceCream Kwality_walls = new IceCream();
		
		Kwality_walls.brand = " KWALITY WALL'S ";
		Kwality_walls.flavour = "chocolate";
		Kwality_walls.price = 100;
		Kwality_walls.type = "Magnum";
		IceCreamTester[1] = Kwality_walls;
		
		IceCream aruns = new IceCream();
		
		aruns.brand = "ARUNS";
		aruns.flavour = "black current";
		aruns.price = 450;
		aruns.type = "Family pack";
		IceCreamTester[2] = aruns;
		
		
		for(IceCream i:IceCreamTester){
			if(i!=null)
				i.printDetails();
			System.out.println("\n");
		}
}
}
