import java.util.Iterator;
import java.util.Scanner;

public class PartanProblem
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	/*	for (int i = n; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}*/
		/*for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=n; j++)
			{
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}*/
		int k=1;
			for (int i = 1;i<=n ;i++) {
				
				for(int j=1;j<=i;j++) {
					
					if( k% 2==0){
					System.out.print("0 ");
					}
					else {
						System.out.print("1 ");
					}
					k++;
				
			}
				System.out.println();
		}
	}
	
}

