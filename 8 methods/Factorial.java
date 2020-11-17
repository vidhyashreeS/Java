package Methods;

public class Factorial {
	public static void factorial() {

        int num=6 ,result = 1;

        int i=num;
        while ( i>= 1)
        {
        
            result *= i;
            --i;
        }

        System.out.println("the factorial of the given num " +num+  " is " + result);
}
	public static void main(String[] args) {
		factorial();
	}
}
