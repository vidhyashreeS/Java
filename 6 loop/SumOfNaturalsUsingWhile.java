package vidhya;

public class SumOfNaturalsUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5, num= 25,sum = 0;


        while(i<=num)
        {
            // sum = sum + i;
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);


	}

}
