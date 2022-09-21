package june5MorningBatch;

import java.util.Scanner;

public class ForLoop1 {
	public static void main(String []args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter number which you want table");
		int n =p.nextInt();
		
	for(int i=1;i<=10;i++) {
		
		System.out.print( " " +n*i);
	}p.close();

}
}