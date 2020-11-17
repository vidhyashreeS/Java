package com.xworkz.wrapper;

public class UsingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		
		char c = 'Z';
		System.out.println("character c is : " +c);
		
		Character x = new Character(c);   //boxing
		System.out.println("character x is : " +x);
		
		Character y = x;      //Auto-Boxing
		System.out.println("character y is : " +y);
		
		char abc = Character.valueOf(x);		//Unwinding  or wrapping                                                                                                                        
		System.out.println("character abc is : " +abc);
		
		char k =c;
		System.out.println("character k is : " +k);
		
		System.out.println("End of Program");
		
		
	}

}
