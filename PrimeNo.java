package june5MorningBatch;

import java.util.Scanner;

public class PrimeNo {
public static void main(String [] args) 
{
	Scanner p =new Scanner(System.in);
System.out.println("enter the no");
int n=p.nextInt();
  boolean isPrime= true;
  for(int i=2;i<n;i++){
	  if(n%i==0) 
	  {
		  isPrime = false;
		  break;
	  }	  
  }
  
  if(isPrime)
  {
	  if(n==1 || n==0) 
	  {
		  System.out.println("no is not prime nor composite");
	  }
	  else 
	  {
		  System.out.println("no is prime");
	  }
  }
  else
  {
	  System.out.println("no is not prime");
   }
  
  }

}
    
    


