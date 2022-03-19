
import java.util.Scanner;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SwapTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);							
		int n=scanner.nextInt();
		
		
		String s=Integer.toString(n);
		int a[]=new int[s.length()]; 
		
		for(int i=0;i<s.length();i++) {
			int re=Character.getNumericValue(s.charAt(i));
			
			int mod=((re+7)%10);
			
			a[i]=mod;
			
		}
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+2; j < a.length; j++) {
				
			int	temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			int r=0;
		for (int i = 0; i < a.length; i++) {
			r=r*10+a[i];
		}
		System.out.println(r);
	}
	
}
