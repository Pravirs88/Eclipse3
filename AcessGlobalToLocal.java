package june4MorningBatch;

public class AcessGlobalToLocal {
 int a=50;//global variable
int b =70;
public void lesson() {
	int a=70;//local variable
	int b=80;
	
	System.out.println(a+this.b+b);}//variable call using this keyword
	
 AcessGlobalToLocal(int a,int c) {

	
	System.out.println(a+b);
	
}
public static void main(String[] args) {
	
	
 AcessGlobalToLocal p =new AcessGlobalToLocal(7,8);
 p.lesson();
}
}
