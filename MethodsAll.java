package june4MorningBatch;



public class MethodsAll {
	int a=56;//instance variable
	int b=88;//instance variable or non static variable
 static int c=104;
 public void nilima(int c) {
	int a=77;//local variable
	System.out.println(this.a+b+c+a);
 }
 public static void nilima2() {
	 int e =78;
	 System.out.println(c+e);
	 
 }
  
 public static void main(String [] args) {
	 MethodsAll e = new MethodsAll();
	 e.nilima(8);
	  nilima2();
	  
		new ConstructorDemo();
		new ConstructorDemo( "pravir");
	
	
 }
}
