package june5MorningBatch;

import java.util.Scanner;

public class Armstrongno {
	public static void main(String [] args) 
	{
		int  S=0;
		Scanner dc= new Scanner(System.in);
		System.out.println("enter the no to check whether it is armstrong no or not ");
		int n= dc.nextInt();//n=153
		int t;
		int r=n;            //r=150
		while(n>0) {
			
			t=n%10;       //t=3,t=15%10=5 1%10=1  t=n%10
		//S=S+(t*t*t);       //s=0+27=27  27+125=152 152+1=153 s=s*10+t=diffeence between palidrom and armstrong
			S=(int) (S+Math.pow(t, r));
		n=n/10;            //153/10=15  15/10=1  n=n/10
		
		}
		if (S==r) {
			System.out.println("  is an armstrong no");
		}else {
			System.out.println( "  is not an armstrong no");
		}dc.close();
	}

}
