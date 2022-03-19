package CollectionMy;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionTakkingUserInput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your data....");
		List list=new ArrayList<Integer>();
		while (sc.hasNextInt()) {
				
			
			list.add(sc.nextInt());
			
			
		}
		System.out.println(list);
	}

}
