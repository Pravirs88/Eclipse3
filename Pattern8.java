package june4MorningBatch;

public class Pattern8 {
	public static void main(String[]args)
	
{
		for(int i=1;i<=9;i++) 
		{
			System.out.print(" ");
			}System.out.print("P");
		System.out.println();
for(int i=2;i<=5;i++)
{
	
for (int j=4;j>=i;j--)
{
System.out.print("  ");
}
 for(int k=1;k<=i;k++)
{
System.out.print( " * ");
}

System.out.println();
}

}
}