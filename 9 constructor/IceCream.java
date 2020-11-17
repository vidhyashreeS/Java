package constructor;

public class IceCream {

	int price;
	String brand;
	String flavour;
	String type;
	
	IceCream()
	{
		System.out.println("------Ice-Creams-----");
	}
	
	IceCream(int inPrice,String inBrand, String inFlavour,String inType)
	{
		price =  inPrice;
		brand = inBrand;
		flavour = inFlavour;
		type = inType;
	}
	
	
}
