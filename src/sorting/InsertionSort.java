package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 34, 25, 12, 22, 11, 20};
		System.out.print(Arrays.toString(Sort(arr)));
	}
	
	
	static int[] Sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>temp) {
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				else {
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
}
