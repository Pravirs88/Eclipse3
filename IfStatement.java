package june5MorningBatch;

public class IfStatement {
	public void Prisha() {
		int marks=80;
				if (marks>=35 &&  marks<=60  ) {
		System.out.println("gread D");}
		else if (marks>60 && marks<=70){
		System.out.println("grade C");
	} 
		else if(marks >70 && marks <=80) {
			System.out.println("grade B");
				}
		else if  (marks >80 && marks <=100) 
		{ 
			System.out.println("grade A");
		}
		else {
			System.out.println("Fail");
		}}
				
 static public  void main(String[] args)
	{
		
	 	IfStatement	b=new IfStatement();
	 	b.Prisha();
	}

}
