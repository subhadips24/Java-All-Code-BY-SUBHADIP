
public class CountPlacement {
	
	
	
	public static int[] placement(int input1,int[] input2) {
		int ans[]=new int[input1];
		
		for (int i = 0; i < input1; i++) {
			int count=0;
			for (int j = 0; j < i; j++) {
				if(input2[i]<input2[j]) {
					count++;
				}
				
			}
			ans[i]=count;
			
		}
		
		return ans;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int a[]= {3,4,1,5,2};
		int x[]=placement(5, a);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}

}
