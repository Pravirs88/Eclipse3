package june4MorningBatch;

import java.util.Scanner;

public class FactorailNo {
	public static void main(String[] args) 
	{
		
		Scanner pg =new Scanner(System.in);
		System.out.println("enter the no of which factorial you have want");
		int n =pg.nextInt();
		System.out.println("you entered no is :  "+n);
		int factorial=1;
		int i=1;
		
		/*for(int i =1;i<=n;i++)
		{
			
			factorial=factorial*i;
	
		
		}System.out.println("factorial of given no "+" "+n+" is : "+factorial);*/
		
		while(n>i) 
		{ 
			i++;
			
			
			factorial=factorial*i;
			
			
		}
		
		System.out.println("factorial no is : "+factorial);
		
	}
	
	
}
