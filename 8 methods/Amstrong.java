package Methods;

public class Amstrong {
	
		 public static void armstrong(int n){  
		    int c=0,a,temp;    
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("is armstrong number");   
		    else  
		        System.out.println(" Is Not armstrong number");   
		   } 	 

public static void main(String[] args)  
{ 
	int n=400;

armstrong(n); 
} 
}

