package june5MorningBatch;

import java.util.Scanner;

public class Prime2 {
	public static void main(String [] args) 
	{
		Scanner pc = new Scanner(System.in);
		System.out.println("enter your no");
		int n=pc.nextInt();
		int c=0;
		if(n==1 || n==0) {
			System.out.println("no is not prime nor composite");}
		else {
		
		for (int i=1;i<=n;i++) {
			
			 
				if(n%i==0) 
				{          
					c++;
				}
			}
	
			if(c==2) 
				System.out.println("no is prime");
			else {
			System.out.println("no is not prime");
			}
			
		}
		
		}
	}


