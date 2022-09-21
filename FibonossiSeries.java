package june5MorningBatch;

import java.util.Scanner;

public class FibonossiSeries {
public static void main(String[]args) 
{
	int a=0, b=1,c;int i=0;
Scanner dc=new Scanner(System.in);
System.out.println("print value up to which find fibonossi series");
int n=dc.nextInt();
while(i<n)
     {        
	c=a+b;
	a=b;
	b=c;
	i++;
	System.out.print(" "+c);
     }dc.close();
     }
}
