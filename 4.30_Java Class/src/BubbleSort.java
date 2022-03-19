

public class BubbleSort {
	public static void main(String[] args)
	{
		
		int arr[]= {5,2,-1,3,0,10};
		//int n=arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			
		
			for (int j = i; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					int tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
					
//					arr[i]=arr[i]+arr[j];
//					arr[j]=arr[i]-arr[j];
//					arr[i]=arr[i]-arr[j];
					
//					arr[i]=arr[i]^arr[j];
//					arr[j]=arr[i]^arr[j];
//					arr[i]=arr[i]^arr[j];
					
					
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
