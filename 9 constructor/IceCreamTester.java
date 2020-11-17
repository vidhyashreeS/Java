package constructor;

public class IceCreamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("STARTING");
		
		IceCream amul = new IceCream();
		amul.brand = "AMUL";
		amul.flavour = "Butterscotch";
		amul.price = 45;
		amul.type = "Cone";
		System.out.println("1. The cost " +amul.brand+ " icecream " +amul.type+ " , "  +amul.flavour+ " flavour is : Ruppees " +amul.price);
		
		IceCream Kwality_walls = new IceCream();
		Kwality_walls.brand = " KWALITY WALL'S ";
		Kwality_walls.flavour = "chocolate";
		Kwality_walls.price = 100;
		Kwality_walls.type = "Magnum";
		System.out.println("2. The cost " +Kwality_walls.brand+ " icecream  " +Kwality_walls.type+ " , "  +Kwality_walls.flavour+ " flavour is : Ruppees " +Kwality_walls.price);
		
		IceCream aruns = new IceCream();
		aruns.brand = "ARUNS";
		aruns.flavour = "black current";
		aruns.price = 450;
		aruns.type = "Family pack";
		System.out.println("3. The cost " +aruns.brand+ " icecream " +aruns.type+ " , "  +aruns.flavour+ " flavour is : Ruppees " +aruns.price);
	}

}
