package Methods;
public class Palindrome
{
	public static void palindrome()
	{
		int r,sum=0,num;    
		int n=4532354;
		num=n;    
		while(n>0)
		{    
			r=n%10;  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(num==sum)    
			System.out.println(num+" is a palindrome number ");    
		else    
			System.out.println(num+ " is not palindrome");    
	}  
	public static void main(String[] args) 
	{
	 palindrome();
	}
}  