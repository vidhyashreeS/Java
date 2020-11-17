package OOpsConcept;

public class ShoesTester
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
			//calling method
				//object=Shoes
				//state=brand,color,friction,price............> instance variables
				
				System.out.println("Begin  of prgm");
				int i=10;
				Shoes puma = new Shoes();
				puma.brand = "puma";
				puma.color = "Pink_and_black";
				puma.friction = true;
				puma.price = 2799.99;
				
				puma.running();
				puma.jogging();
				puma.dancing();
				puma.playing();
				puma.walking();
			}
			
}
			
