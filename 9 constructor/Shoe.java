package constructor;

public class Shoe {
	String brand;
	String color;
	int size;
	double price;
	
	Shoe()
	{
		System.out.println("Initializing");
	}
	
	Shoe(String inBrand,String inColor,int inSize,double inPrice ){
		System.out.println("Initializing Brand,Color, Size, Price ");
		brand = inBrand;
		color = inColor;
		size = inSize;
		price = inPrice;
	}
		
	public void running () {
		System.out.println("Shoes is used for Running");

	}
	public void jogging(){
		System.out.println("Shoes is used for Jogging");
	}
	public void walking(){
		System.out.println("Shoes is used for Walking");	
	}
	public void dancing(){
		System.out.println("Shoes is used for Dancing");
	}
	public void playing(){
		System.out.println("Shoes is used for Playing");
	}
}
	
	

