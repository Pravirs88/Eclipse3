package june5MorningBatch;

import java.util.Scanner;

public class Swapping {
public static void main(String []args) 
    {
	int c;
	Scanner dc=new Scanner(System.in);
	System.out.println(" print values of a & b");
	int a=dc.nextInt();
	int b=dc.nextInt();
	//a=a+b;
	//b=a-b;
	//a=a-b;
	c=a;
	a=b;
	b=c;
	System.out.println("values of a after swapping is  " +a+ "\n value of b after swapping is  " +b);
	dc.close();
    }
}
