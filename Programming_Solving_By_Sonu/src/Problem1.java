import java.util.Scanner;

public class Problem1 
{
	static boolean goodNum(int n) {
		for(int i=1;i<=9;i++ ) 
		{
			for(int j=1;j<=9;j++) 
			{
				if(i*i*i==j*j*j)
				{
					
					return true;
				}else 
				{
					return false;
				}
			}
		}
			
		return false;	
	}
	static int isCubicSumExist(int A[]) {
		int count=0;
		for(int i=0;i<A.length;i++) {
			
			if(goodNum(A[i])) {
				count++;
			}
		}
		
	return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]= {15,5};
		System.out.println(isCubicSumExist(arr));
		
	}

}
