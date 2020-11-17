package Methods;

public class ArithmeticOperations {
	public static void main(String[] args) {
		System.out.println("start");
		int a=10 ,  b=20;
		ArithmeticOperations add = new ArithmeticOperations();
		ArithmeticOperations sub = new ArithmeticOperations();
		ArithmeticOperations mul = new ArithmeticOperations();
		ArithmeticOperations div = new ArithmeticOperations();
		ArithmeticOperations mod = new ArithmeticOperations();
	    add.addition(a , b);
	    sub.subtraction(a , b);
	    mul.multiplication(a , b);
	    div.division(a , b);
	    mod.modulus(a , b);
		
		System.out.println("end");
		
	}
	public void addition(int x , int y) {
		int sum=x+y;
			System.out.println("sum of " + x + " & " + y + " is " + sum);
			}
	public void subtraction(int x , int y) {
		int sub=x-y;
			System.out.println("sub of " + x + " & " + y + " is " + sub);
			}
	public void multiplication(int x , int y) {
		int mul=x*y;
			System.out.println("mul of " + x + " & " + y + " is " + mul);
			}
	public void division(int x , int y) {
		int div=x/y;
			System.out.println("div of " + x + " & " + y + " is " + div);
			}
	public void modulus(int x , int y) {
		int mod=x%y;
			System.out.println("mod of " + x + " & " + y + " is " + mod);
			}
}
