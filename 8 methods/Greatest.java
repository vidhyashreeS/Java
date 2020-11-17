package Methods;

public class Greatest {
	public static void great(int num1,int num2,int num3)
	 {
	if( num1 >= num2 && num1 >= num3)
       System.out.println(num1+" is the largest Number among 43,29,10");

   else if (num2 >= num1 && num2 >= num3)
       System.out.println(num2+" is the largest Number 43,29,10");

   else
       System.out.println(num3+" is the largest Number 43,29,10");
}
	 public static void main(String[] args) 
	 {
		 great(43,29,10);
	 }
}
