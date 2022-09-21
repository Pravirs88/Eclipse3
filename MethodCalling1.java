package june5MorningBatch;


public class MethodCalling1 {

	public static void main(String[] args) {
		car();
		car(30,65);
		car(30.5f,5.5f);
		
		

	}
	public static void car (){
			System.out.println("my name is pravir");
	}
	public static void car(int a,int b) {
	System.out.println(a+b);
	}
	public static void car(float f,float d) {
		System.out.println(f/d);
	
		
	}

		
	

}
