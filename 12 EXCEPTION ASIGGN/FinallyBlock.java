package com.xworkz.exception;

public class FinallyBlock {
	 public static void main(String args[]) {
		 System.out.println("Start of program");
	      try{  
		 int num=18/0;  
		 System.out.println(num);  
	      }  
	      catch(ArithmeticException e){
	         System.out.println("Input divisor with non zero number");
	      }  
	      finally{
		 System.out.println("Finally");
	      }  
	      System.out.println("ËND OF PROGRAM");  
	   }   
}
