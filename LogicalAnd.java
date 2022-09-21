package june5MorningBatch;

public class LogicalAnd {
	public static void main(String[] args) {
		int a=20;
		int b=50;
		int c=80;
		System.out.println(a<b || a>b);//true || false=true
		System.out.println(b<c && a<c);//true && true=true
		System.out.println(b>a | a<b);//false | true=true
		System.out.println(c<b & c<a);//false & false=false
		new LogicalAnd();
		
	}LogicalAnd(){
		int a=100;
		int b=3;
		System.out.println(a<<b);//100 *(8)=800
		System.out.println(a>>b);//100/=100/8=12
	}}
	
	

