package june4MorningBatch;

public class Pattern3 {
	public static void main(String [] args) 
	{
		for(int i=1; i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				int sum=i+j;
				if(sum%2==0) //even place
				{
					System.out.print(" "+1);
				}
				else //odd place
				{
					System.out.print(" "+0);
				}
			}
			System.out.println();
		}
	}

}
