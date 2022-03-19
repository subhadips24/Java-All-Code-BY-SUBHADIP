public class Piramid {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("i ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("i ");
				
			}
			System.out.println();
			
		}
		//down part
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("i ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("i ");
				
			}
			System.out.println();
			
		}
		
		
	}
}
