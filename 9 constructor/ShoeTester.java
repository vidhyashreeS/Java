package constructor;

public class ShoeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of program");
		
		Shoe puma = new Shoe();
		puma.brand = "puma";
		puma.color = "black";
		puma.size = 38;
		puma.price = 6999.00;
		
		System.out.println("Brand of Shoe is : " +puma.brand );
		System.out.println("Color of " +puma.brand+ " Shoe is : " +puma.color );
		System.out.println("Size of " +puma.brand+ " Shoe is : " +puma.size );
		System.out.println("Price of " +puma.brand+ " Shoe is : " +puma.price );
		
		Shoe bata = new Shoe();
		bata.brand = "bata";
		bata.color = "Pink";
		bata.size = 40;
		bata.price = 8989.00;
		System.out.println("Brand of Shoe is : " +bata.brand );
		System.out.println("Color of " +bata.brand+ " Shoe is : " +bata.color );
		System.out.println("Size of " +bata.brand+ " Shoe is : " +bata.size );
		System.out.println("Price of  " +bata.brand+ " Shoe is : " +bata.price );
		
		Shoe nike = new Shoe();
		nike.brand = "nike";
		nike.color = "Neon_Green";
		nike.size = 38;
		nike.price = 11499.00;
		System.out.println("Brand of Shoe is : " +nike.brand );
		System.out.println("Color of " +nike.brand+ " Shoe is : " +nike.color );
		System.out.println("Size of " +nike.brand+ " Shoe is : " +nike.size );
		System.out.println("Price of " +nike.brand+ " Shoe is : " +nike.price );
	
		System.out.println("End of program");
	}

}
