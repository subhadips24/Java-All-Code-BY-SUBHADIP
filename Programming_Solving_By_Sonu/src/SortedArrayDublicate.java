
public class SortedArrayDublicate {
	public static void main(String[] args) {
		int arr[]= {1,1,2,3,3,3,4,4,5,5,5,5,5,5,57,57,57};	//[5->2->4->3->5->2->4->3]
		int re=1;
		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[i]!=arr[re-1]) {
				arr[re]=arr[i];
				re++;
			}
		}
		for(int i=0;i<re;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
