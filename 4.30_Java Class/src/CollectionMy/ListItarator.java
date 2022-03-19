package CollectionMy;
import java.util.*;

public class ListItarator {
	
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(155);
		list.add(17);
		System.out.println(list);
		Integer arr[]=new Integer[list.size()];
		arr=list.toArray(arr);
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	
	}

}
