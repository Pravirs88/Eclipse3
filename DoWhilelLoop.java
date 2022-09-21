package june5MorningBatch;

import java.util.Scanner;

public class DoWhilelLoop {
public static void main(String[] args) 
    {
	Scanner p= new Scanner(System.in);
int input;
	do {
		System.out.println("input marks of student");
		int marks =p.nextInt();
		if (marks>=90) {
			System.out.println("this is better");
		}else if(marks>=60 && marks<=89) {
			System.out.println("this is good");
		}else if (marks>0 && marks<=59) {
			System.out.println("this is also good but keep practicing");
		}else {
			System.out.println("need to prepare hard and focus on study");
		}System.out.println("want to continue ? (yes then press 1 or no then press 0)");
		 input =p.nextInt();
	}
	while(input==1);
	
	
	
	p.close();
	
    }
}
