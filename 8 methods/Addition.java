package Methods;

public class Addition
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10,b=21;
		Addition add = new Addition();
		add.addition(a, b);
	}
	public void addition(int x,int y)
	{
		System.out.println("first value is: " +x);
		System.out.println("second value is: " +y);
		
		int sum = x+y;
		System.out.println("sum of " +x+ " and" +y+ " is :" +sum);
		
	}

}
