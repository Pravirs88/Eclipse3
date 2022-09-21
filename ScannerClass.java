package june5MorningBatch;

import java.util.Scanner;

public class ScannerClass {
 /*public void veer() {
	Scanner j = new Scanner(System.in);
	System.out.println("What is your name ?");
	String t = j.nextLine();
	System.out.println("your name is : "+t);
	System.out.println("what is your surname ?");
	String s = j.nextLine();
	System.out.println("your surname is : "+s);
	System.out.println("What is your of date of birth ?");
	String t1 =j.nextLine();
	System.out.println("Your date of birth is : "+t1);
	System.out .println("what is your home address ?");
	String t2 = j.nextLine();
	System.out.println("Your home address is : "+t2);
	System.out.println("What is your recedential  pincode ?");
	int t3=j.nextInt();
	System.out.println("Your recedential pincode is : "+t3);
	System.out.println("what is your mobile number ?");
    long m =j.nextLong();
    System.out.println("Your mobile number is : "+m);
    j.close();
     }*/
    
public static void veer1() 

{
	Scanner o = new Scanner(System.in);
	System.out.println("what is your name ? \n what is date of birth ? \n what is your pincode ?\n what is your mobile no?  ?");
	String i = o.nextLine();
	String k =o.nextLine();
	int l =o.nextInt();
	long m =o.nextLong();
	int n =o.nextInt();
	byte c =o.nextByte();
	int e =o.nextInt();
	System.out.println("your name is : "+i);
	System.out.println("your date of birth is :"+k);
	System.out.println("your pincode is : "+l);
	System.out.println("your mobile no is : "+m);
	System.out.println("enter emergancy firefighter no  "+n);
	System.out.println("enter your bike no "+c);
	System.out.println(" enter emergancy ambulance phone no  "+e);
	o.close();
	
	}
       public static void main(String [ ] args) 
    { 
    	   //ScannerClass k =new ScannerClass();
    	  // k.veer();
    	 	veer1();
   }
    
}

