package arrrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mainArr= {};
		reverse(mainArr);
		System.out.print(Arrays.toString(mainArr));
	}
	static void reverse(int[] arr) {
		int start=0,temp=0;
		int end=arr.length-1;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start=start+1;
			end=end-1;
		}
	}

}
