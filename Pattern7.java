package june4MorningBatch;

public class Pattern7 {
	public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for (int j=4;j>=i;j--)
{
System.out.print("  ");
}
 for(int k=1;k<=i;k++)
{
System.out.print(" "+k);
}
for(int j=1;j<=i;j++)
{
System.out.print(" " +j);

}
System.out.println();
}
for(int i=5;i>=1;i--)
{
for (int j=4;j>=i;j--)
{
System.out.print("  ");
}
 for(int k=1;k<=i;k++)
{
System.out.print(" "+k);
}
for(int j=1;j<=i;j++)
{
System.out.print(" " +j);

}
System.out.println();
}

}

}
