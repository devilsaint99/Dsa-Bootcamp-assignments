package striver;

import java.util.Arrays;

public class nextLexic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,1,3};
		nextLex(arr);
		System.out.print(Arrays.toString(arr));
	}
	static void nextLex(int[] nums) {
		int pivot=0;
		//find pivot
		for(int i=nums.length-1;i>0;i--) {
			if(nums[i-1]<nums[i]) {
				pivot=i;
				break;
			}
		}
		if(pivot==0) {
			Arrays.sort(nums);
			return;
		}
		int swap=nums.length-1;
		//swap pivot-1 with just larger number 
		while(nums[pivot-1]>=nums[swap])
			swap--;
		Swap(nums,swap,pivot-1);
		srt(nums,pivot);
	}
	
	static void Swap(int nums[], int a,int b) {
		int t=nums[a];
		nums[a]=nums[b];
		nums[b]=t;
	}
	
	static void srt(int[] nums, int pivot) {
		
		for(int i=pivot;i<nums.length-1;i++) {
			int min=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[min]>nums[j]) {
					min=j;
				}
			}
			Swap(nums,min,i);
			
		}
	}

}
