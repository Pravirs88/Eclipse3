package june4MorningBatch;

public class StaticNonstatic {

	//Static Method
	public static void lesson1(){
		System.out.println("Welcome to our Velocity family");
		System.out.println("My name is Pravir Salunkhe and I am from satara");
	}
	public static void lesson2() {
		System.out.println("Today we learnt Static and NonStatic Representataion");
	}
	//Nonstatic Method
	public void lesson3() {
		System.out.println("Non static methods mostly used  in JAVA");
		System.out.println("main() method is the Brain of the program");
	}
	public void lesson4() {
		System.out.println("because it dosen't take any memory location or it's mean object oriented");
	}
	//Call to main() Method
	public static void main(String []args) {
		lesson1();
		lesson2();
		StaticNonstatic p = new StaticNonstatic();
		p.lesson3();
		p.lesson4();
	}
}

