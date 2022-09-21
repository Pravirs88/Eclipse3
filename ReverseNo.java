package june4MorningBatch;

public class ReverseNo {

		
	public static void main(String[] args) {
		long number = 8866105442l;
	long s=0;
	 
   while(number != 0)   
{  
   long remainder = number % 10;  
 s = s * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + s);  
}  
	}
	  


