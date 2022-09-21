package june4MorningBatch;

import java.util.Scanner;

public class GcdOf2 {
public void gcd() 
    {
	Scanner pc=new Scanner(System.in);
	System.out.println("enter values of a and b");
	int a=pc.nextInt();
	int b=pc.nextInt();
	while(a!=b) {
		
		if(a>b) 
		{
			
			a=a-b;
			
		}else 
		{
			b=b-a;
			
		}
		}System.out.println("GCD IS " +a);
	}
	public static void main(String[]args) {
		GcdOf2 g=new GcdOf2();
		g.gcd();
	}
    }

