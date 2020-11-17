class DecrementOperator{
	public static void main(String args[]){
		System.out.println("Unary DecrementOperator");
		int num=6;
		System.out.println("post Decrement number is: "+num);
		System.out.println("the num after post Decrement is "+num--);
		System.out.println("the num after post Decrement is "+num--);
		int num1=22;
		System.out.println("pre Decrement number is: "+num1);
		System.out.println("the num after pre Decrement is "+ --num1);
		System.out.println("the num again after pre Decrement is "+ --num1);
		
		System.out.println("-------Equation for decrement operator--------");
		int n1=12;
		System.out.println("the value of n1 is: "+n1);
		int val;
		val =--n1 + (n1-- +20) - --n1;
		System.out.println("the value of equation val = --n1 + (n1-- +20) - --n1 is :" +val);
	}
}