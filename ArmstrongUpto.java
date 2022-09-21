package june5MorningBatch;

import java.util.Scanner;

public class ArmstrongUpto {
	public static void main(String [] args ) 
	{
		
		Scanner pc =  new Scanner(System.in); 
		System.out.println(" print range of three digits  limit to find armstrong no witin that no");
		int n =pc.nextInt();
		int t;
		
		int i;
		for ( i=1;i<=n;i++) 
		{
			int s=0;
			int j=i;
			while(j>0) {
			t=j%10;
			s=s+(t*t*t);
			j=j/10;
			}
		if (s==i) {
			System.out.println(i);
		}
		
		}
	}

}
