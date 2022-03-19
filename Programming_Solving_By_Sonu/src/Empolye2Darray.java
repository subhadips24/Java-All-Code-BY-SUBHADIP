import java.util.*;
public class Empolye2Darray {
	
	
	static char emploeS(List<List<Integer>>leaveTimes) {
		int arr[][] = leaveTimes.stream()
						.map(l->l.stream()
						.mapToInt(Integer::intValue).toArray())
						.toArray(int[][]::new);
		int t=0;
		int[] sort=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			t=arr[i][1]-t;
			sort[i]=t;
		}
		for (int i : sort) {
			System.out.print(i+" ");
		}
		int l=0;
		for (int i = 0; i < sort.length; i++) {
			if(sort[i]>l) {
				l=sort[i];
			}
			
		}
		int index=0;
		for (int i = 0; i < sort.length; i++) {
			if(sort[i]==l) {
				index=i;
			}
		}
		char c=(char)(97+arr[index][0]);
		return c;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int x[][]= {{0,3},{2,5},{0,9},{1,15}};
		List<List<Integer>> list=Arrays.asList(
				Arrays.asList(4,5),
				Arrays.asList(3,11),
				Arrays.asList(0,20)
//			Arrays.asList(5,6),
//			Arrays.asList(4,10)
				
				
				);
		
		System.out.println(emploeS(list));
		
		//System.out.println(emploeS(x));
		
	}

}
