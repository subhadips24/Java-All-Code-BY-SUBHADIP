import java.util.Arrays;
import java.util.Iterator;

public class SortParticuler {
	
	public  static int[] funcSort(int[] inputList,int num) {
		int [] answer=new int[inputList.length];
	Arrays.sort(inputList);
	for (int i = 0; i < num; i++) {
		answer[i]=inputList[i];
	}
	for (int i = num,j=inputList.length-1; i < answer.length; i++,j--) {
		answer[i]=inputList[j];
	}
	
	
	/*	int x[]=new int[num];
		int y[]=new int[inputList.length - num];
		for(int i=0;i<num;i++) {
			x[i]=inputList[i];
		}
		for (int i = num,j=0; i < inputList.length; i++,j++) {
			y[j]=inputList[i];
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		for (int i = 0; i < x.length; i++) {
			answer[i]=x[i];
		}
		for (int i = num,j=y.length-1; i <inputList.length; i++,j--) {
			answer[i]=y[j];
		}*/
		
		return answer;
	}
	public static void main(String[] args) {
		int []a= {11,7,5,10,46,23,16,8};
		int x[]=funcSort(a, 3);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}

}
