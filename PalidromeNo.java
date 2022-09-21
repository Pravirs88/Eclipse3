package june4MorningBatch;

import java.util.Scanner;

public class PalidromeNo {
	public static void main(String [] args) 
	{
	Scanner pc =new Scanner (System.in);

	System.out.println("Please Enter  your no : ");
	int n = pc.nextInt();
	System.out.println("your no is : "+n);
      int s=0;
       int t,r;
       r=n;
    while(n>0)
      {
	t=n%10;
	s=s*10+t;
	n=n/10;
	}
    if (s==r)
     {
	System.out.println(s+"   is palidrome no. ");
     }
    else 

{System.out.println("\n\n "+s+"  is not pallidrome no.");
pc.close();
	}
	
	}
}
