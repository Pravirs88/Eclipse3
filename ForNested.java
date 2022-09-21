package june4MorningBatch;

public class ForNested {
public static void main(String []args) 
       {
			/*
			 * for(int i=1;i <=5 ;i++) { for(int j=1;j<=5;j++) { System.out.println(i +
			 * "  "+j); } }
			 */
	
	      for(int i=1;i<=5;i++) 
	      {
	    	  for(int j=5;j>=i;j--)
	    	  {
	    		  System.out.print( " *" );
	    	  }
	    	  System.out.println();
	      }
    }


}//first condition i=1 inner loop i=5 j==i--1,2,3,4,5
//first i=4 inner loop j=1 j<=4 j=1,j=2--1,2,3,4
///outer loop i=3  j<=3 j=1,j=2,j=3--1,2,3
//i=4 j<=4 j=1,j=2,j=3,j=4
