package Methods;

public class Prime 
{   
		 public static void prime(){    
		  int i,m=0,flag=0;      
		  int n=6;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   i=2;
		   while (i<=m){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }  
		    i++;
		   }      
		   if(flag==0)  
		   { 
			   System.out.println(n+" is prime number");
			   }  
		  }  
		}    
		 public static void main(String[] args)
		 {
			 prime();
		 }
}   




