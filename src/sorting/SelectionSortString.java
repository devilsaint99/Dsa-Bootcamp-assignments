package sorting;

import java.util.Arrays;

public class SelectionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String arr[] = {"paper", "true", "soap", "floppy", "flower"};
		String arr[] = {"GeeksforGeeks",
                "Practice.GeeksforGeeks",
                "GeeksQuiz"};
		
		System.out.print(Arrays.toString(Sort(arr)));
	}
	
	
	static String[] Sort(String[] arr) {
		int end=arr.length-1;
		while(end>0) {
			int max=0;
			for(int i=1;i<=end;i++) {
				
				if(arr[max].compareTo(arr[i])<0) {
					max=i;
				}
			}
			
			String temp=arr[max];
			arr[max]=arr[end];
			arr[end]=temp;
			end--;
		}
		return arr;
	}

}
