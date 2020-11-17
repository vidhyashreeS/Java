package com.xworkz.exception;

public class ExceptionPropogation {
	void method1(){
		System.out.println("Method 1");
		      int arr[] = {11,15,14,18};
		      System.out.println(arr[2]);
		      System.out.println("Method 1 ends");
		   }
		   void method2() {
			   System.out.println("Method 2");
		      method1();
			   System.out.println("Method2 ends");
		   }
		   void method3(){ 
			   System.out.println("Method 3");
		      try {
		         method2();
		      } catch(ArrayIndexOutOfBoundsException ae) {
		         System.out.println("Exception occured");
		      }
		      System.out.println("Method 3 ends");
		   }
		   public static void main(String args[]) {
		      ExceptionPropogation obj = new ExceptionPropogation();
		      obj.method3();
		   }

}
