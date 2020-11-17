package Methods;

public class SquareOfNum {
	public static double square(int n) 
	 {
		 return n*n;
	 }
	 public static void main(String[] args) 
	 {
		 double res=0;
		 int n=10;
		 res = square(n);
		 System.out.print("Square of 10 is: "+res);
	 }
}
