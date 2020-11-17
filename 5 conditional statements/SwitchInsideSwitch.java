class SwitchInsideSwitch
{
	public static void main(String args[])
	{
		String x="karnataka";
		int y=2;
		
		switch (y)
		{
			case 1: System.out.println("mysore");
				break;
			case 2: 
				switch (x)
					{
						case "karnataka":
						System.out.println("karnataka");
						case "bangalore":
							System.out.println("bangalore is the capital city of karnataka");
							break;
						case "hassan":
							System.out.println("Hassan is city of karnataka");				
							break;
					}
			break;
		}
					
	}	
}