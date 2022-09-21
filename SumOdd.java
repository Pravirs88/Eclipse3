package june5MorningBatch;

import java.util.Scanner;

public class SumOdd {
public static void main(String [] args) 
       {
	int sum=0;
	Scanner pc=new Scanner(System.in);
	System.out.println("enter no up to which we find out addition ");
	int n=pc.nextInt();
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			
				sum=sum+i;
		}
			}System.out.println(sum);
			
		}
	}
	
	
       

