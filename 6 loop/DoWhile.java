package WhileLoop;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, num = 345289;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
	}

}
