package june4MorningBatch;

public class ConstructorDemo   
{ 
	// initialization //
int a,b,sum;
  String name;
	
	
	ConstructorDemo() // method of  non argument constructor
	{  
		// declaration //
		a = 18;
		b = 22;
		sum = a + b;
		System.out.println(sum);
	} 
	ConstructorDemo( String name) // method of parameterized constructor
	{
		this();
	System.out.println("MY NAME IS : " +name);
		
	}
	ConstructorDemo( int f,float p) //method of parameterized constructor
	{this("nilima");
	
	
		
		System.out.println(p * f);
		
	
		
	
		}
		public static void main (String [] args) //call to constructor method
	{
	
		
				new ConstructorDemo( 8,12.1f);
		
		
	}
	
}

