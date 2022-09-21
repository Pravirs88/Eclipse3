package june5MorningBatch;

public class  KeywordPractice   {
	int a=5;
	 int b=10;
	int c=15;
	int d=88;
	public  void practice1 (int a,int b,int c,int d ) {

	
	System.out.println(this.a+b+c+this.d);//
	this.practice2(8, 9, 10);
		}
	
		
	public void practice2(int a,int b,int c) {
	System.out.println(a+b+this.c);	//85
	
	}
	public static void main (String [] args) {
		KeywordPractice p =new KeywordPractice();
		
		p.practice2(30,40,50);
		
		
	}
	}
