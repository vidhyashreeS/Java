package com.xworkz.assignment;

public class LargeSmall {
	
		public static void main(String[] args) 
		{
			int[] arrLS = new int[] { 36,12,24,55,268,20,47,10,3,02,174,159 };

			int min = arrLS[0];
			int max = arrLS[0]; 

			for (int i = 1; i < arrLS.length; i++)  
			{
				if (arrLS[i] > max) 
				{
					max = arrLS[i];
				}
				if (arrLS[i] < min) 
				{
					min = arrLS[i];
				}
			}

			System.out.println("Largest Num in a given array is : " + max);
			System.out.println("Smallest Num in a given array is : " + min);
		}
}
