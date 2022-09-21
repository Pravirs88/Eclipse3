package june4MorningBatch;

public class Return {
int sum;
int a=10;int b=12;

public int addition(int a,int b) {
a=this.a;
sum=a+b;
	return sum;
	
}public static void main(String[] args) {
	Return e=new Return();
	System.out.println(e.addition(4, 5));
	System.out.println(5*e.addition(10,5));  ///reuse return value
}
}
