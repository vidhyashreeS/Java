import java.util.Scanner;
class Branch
{
	public static void main(String args[])
	{
	System.out.println("enter letters for full form of branch names:");
	Scanner sc=new Scanner(System.in);
	String branch=sc.nextLine();
	switch (branch)
	{
	  case "CS":
		System.out.println("COMPUTER SCIECNE");
		break;
	  case "IS":
		System.out.println("INFORMATION SCIENCE");
		break;
	  case "EC":
		System.out.println("ELECTRONICS AND COMMUNICATION");
		break;
	  case "CV":
		System.out.println("CIVIL");
		break;
	  case "EEE":
		System.out.println("ELECTRICAL");
		break;
	  case "AE":
		System.out.println("AERONAUTICAL");
		break;
	  case "ME":
		System.out.println("MECHANICAL");
		break;
	}
	}
}