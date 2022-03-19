package CollectionMy;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListConst { 
	 
	
	public static void main(String[] args) {
		LinkedHashSet<String> linkHas=new LinkedHashSet<String>();
		linkHas.add("Subhaldip");
		linkHas.add("Samiran");
		linkHas.add("Sourav");
		linkHas.add("Sunirmal");
		linkHas.add("Kuila");
		linkHas.add("Test");
		
		List<String> arrLi=new ArrayList<>(linkHas);
		System.out.println(arrLi);
		
		System.out.println();
		//arrLi.removeAll(linkHas);
		
		System.out.println(arrLi.isEmpty());		
		arrLi.add("123");
		Collections.sort(arrLi);
		System.out.println();
		
		System.out.println(arrLi);
		
		

	}
	
}
