

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {22,178,41,-58,0,31,11,6,2,-8};
		for (int i = 0; i < a.length-1; i++) {
			int midIndex=i;
			for (int j = i; j < a.length; j++) {
				
				if(a[midIndex]>a[j]) {
					midIndex=j;
					
				}
			}
			int temp=a[i];
			a[i]=a[midIndex];
			a[midIndex]=temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
