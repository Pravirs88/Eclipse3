package june5MorningBatch;

import java.util.Scanner;

public class Comparison {
public static void main(String []args) 
{ 
	Scanner p=new Scanner(System.in);
     System.out.println( "enter valuse of a & b to perform matematical operations");
      int a=p.nextInt();
      int b=p.nextInt();
       System.out.println("press button according to which operations do you have perform" );
       int button=p.nextInt();
         switch (button)	{
         case 1 : System.out.println(a +b );break;
         case 2:  System.out.println(a-b);break;
         case 3:System.out.println( a*b);break;
         case 4:
         if(b==0) {
        	 System.out.println("oprations can not be performed");}
        	 else {
        		 System.out.println(a/b);
        	 }
         break;
         case 5 :
        	 if (b==0) {
        		 System.out.println("oprations can not be performed");}
        	 else {
        		 System.out.println(a%b);
        	 }
        		 
        	 
        	 break;
         default :System.out.println("invalid operation");

        }p.close();
}
	
}

