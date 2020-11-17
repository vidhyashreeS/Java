package Methods;

public class Digits {
	public static void digits() {

        int count = 0, num = 10124;

       do
        {
            // num = num/10
            num /= 10;
            ++count;
        } while(num != 0);

        System.out.println("Number of digits in 10124 is : " + count);
    }
        public static void main(String[] args)
        {
        	digits();
        }
}
