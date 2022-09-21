package june4MorningBatch;


public class MethodOverloading 
{
	public void mehodoverloding() 
	{
		int a=55;
		int b=60;
	    int sum =a+b;
	    System.out.println("THE Arithmatic operations IS :"+sum);
	}
	public void mehodoverloding(int a,int b) 
	{this.mehodoverloding();
		System.out.println(a*b);
		
		}
	public void mehodoverloding(String name) 
	{
		System.out.println("My name is :"+name);
		}
public static void main(String [] args) 
{
	MethodOverloading  n = new MethodOverloading ();
	n.mehodoverloding();
	n.mehodoverloding(23,25);
	
	
}
}
