import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicateValue {
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,3,4,5,5,4,3,2};
		int n=arr.length;
		//int j=0;
		int k=0;
		int [] temp=new int[n];
		for(int i=0;i<n;i++)
		{
			
			 for(int j=i+1;j<n;j++) {
				 
				 if(arr[i]==arr[j]) { 
					 System.out.print(arr[j]+" ");
					// temp[i]=arr[j];
					 //arr[j]=-1;
					 
					
				 }
				 else {
					
				}
			 }
			
		}
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=-1) 
//			{
//				System.out.print(arr[i]+" ");
//			}
//			
//		}

		
	}

}
