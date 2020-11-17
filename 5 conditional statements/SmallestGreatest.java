class SmallestGreatest
{
	public static void main(String args[])
	{
		int a=10,b=20,c=5;
		System.out.println("a= " +a+ ",b= " +b+ ",c= " +c);
		if (a>b)
		{
			if(a>c)
			{
				System.out.println(" a is greater");
			}
			else
			{
				System.out.println(" c is greater");
			}
		}
		else if (b>c)
		{
			System.out.println(" b is greater");
		}
		if (a<b)
		{
			if(a<c)
			{
				System.out.println(" a is Smallest");
			}
			else
			{
				System.out.println(" c is Smallest");
			}
		}
		else if (b<c)
		{
			System.out.println(" b is Smallest");
		}
	}
	
}