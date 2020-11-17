package com.xworkz.wrapper;

public class UsingDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Program Starts");
			
			double c = 10.369410111;
			System.out.println("value of c is : " +c);
			
			Double x = new Double(c);   //boxing
			System.out.println("value of x is : " +x);
			
			Double y = x;      //Auto-Boxing
			System.out.println("value of y is : " +y);
			
			double abc = Double.valueOf(x);		//Unwinding  or wrapping                                                                                                                        
			System.out.println("value of abc is : " +abc);
			
			double k =c;
			System.out.println("value of k is : " +k);
			
			System.out.println("End of Program");
			
	}

}
