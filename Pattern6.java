package june4MorningBatch;

public class Pattern6 {
public static void main(String [] args) 
{
	int n=5;
for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++) {
			
			if(j==1||j==i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		for(int j=1;j<=2*(n-i);j++) {
			System.out.print(" ");
		} 
		for(int j=1;j<=i;j++) {
			
			if(j==1||j==i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
	}
		System.out.println();


}

	for(int i=5;i>=1;i--) {
		
		for(int j=1;j<=i;j++) {
			
			if(j==1||j==i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		for(int j=1;j<=2*(n-i);j++) {
			System.out.print(" ");
		} 
		for(int j=1;j<=i;j++) {
			
			if(j==1||j==i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
	}System.out.println();

}
}
}