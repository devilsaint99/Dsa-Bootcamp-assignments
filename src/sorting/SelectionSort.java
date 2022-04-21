package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,56,76,23,90,12};
		System.out.print(Arrays.toString(SelectionSort(arr)));
	}
	
	
	static int[] SelectionSort(int[]arr) {
		int end=arr.length-1;
		while(end>0) {
			int max=0;
			for(int i=1;i<=end;i++) {
				if(arr[max]<arr[i]) {
					max=i;
				}
			}
			int temp=arr[end];
			arr[end]=arr[max];
			arr[max]=temp;
			end--;
		}
		
		return arr;
	}

}
