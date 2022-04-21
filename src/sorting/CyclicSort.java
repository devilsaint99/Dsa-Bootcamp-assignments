package sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,1,2};
		sort(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	static void sort(int[] arr) {
		int index=0;
		while(index<arr.length) {
			if(arr[index]!=index+1)
				swap(arr,arr[index]-1,index);
			else {
				index++;
			}
		}
	
	}
	static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
