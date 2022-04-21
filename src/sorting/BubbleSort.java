package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		System.out.print(Arrays.toString(Sort(arr)));
	}
	
	static int[] Sort(int[]arr) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		return arr;
	}
	
	
	static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
}
