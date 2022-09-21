package june5MorningBatch;

import java.util.Scanner;

public class PrimeUpto100 {
public static void main(String [] args) 
{
	
	
	
	int input;
	do {
		Scanner pc= new Scanner(System.in);
		System.out.println("enter your no");
		int n=pc.nextInt();
	for (int i=1;i<=n;i++) 
	{
		int c=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
              c++;
              }
				}
				
				 if(c==1) {
			System.out.print(" "+i);
			}
				 }System.out.println("if you want to continue perss 1");
				 input =pc.nextInt();
				 pc.close();
				}while(input==1);
}
}

		
		
		
	


