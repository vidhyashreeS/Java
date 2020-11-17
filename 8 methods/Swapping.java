package Methods;

public class Swapping {
	public static void swap() 
    {
	 int a=10,b=5;
	 System.out.println("before swap");
	 System.out.println("A="+a);
	 System.out.println("B="+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println("after swap");
	 System.out.println("A="+a);
	 System.out.println("B="+b);
}
 public static void main(String[] args) 
 {
	 swap();
 }
}
