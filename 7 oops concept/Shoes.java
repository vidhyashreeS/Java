package OOpsConcept;

public class Shoes {
	//object=Shoes
	//state=brand,color,friction,price............> instance variables
	
	
	String brand;
	String color;
	boolean friction;
	double price;
	
	//behaviour=running,jogging,walking,dancing,playing_games
	
	// modifier return_type method_name(parameter list)
	public void running() {
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
