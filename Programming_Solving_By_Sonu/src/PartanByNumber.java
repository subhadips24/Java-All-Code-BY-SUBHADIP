
public class PartanByNumber {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j%2+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j%2+" ");
				
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
				System.out.print(j%2+" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j%2+" ");
				
			}
			System.out.println();
			
		}
		
		
	}
}
