class GradesToMarks
{
	public static void main(String args[])
	{
		System.out.println("-----GradesToMarks-----");
		char grade='A';
		switch (grade)
		{
			case 'A' : 
				System.out.println("Your percentage is between 85 - 100");
				break;
			case 'B' :
				System.out.println("Your percentage is between 60 - 85");
				break;
			case 'C' :
				System.out.println("Your percentage is between 35 - 60");
				break;
			default: System.out.println("Fail");
			break;
		}
	}
}