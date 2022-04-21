package striver;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		sort(nums);
		System.out.print(Arrays.toString(nums));
	}
	
	static void sort(int[] nums) {
		int start=0,end=nums.length-1,index=0;
		while(index<=end) {
			if(nums[index]==0) {
				swap(nums,index,start);
				index++;
				start++;
			}
			else if(nums[index]==1) {
				index++;
			}
			else {
				swap(nums,index,end);
				end--;
			}
			
		}
		
	}
	
	static void swap(int[] nums,int a, int b) {
		int t=nums[a];
		nums[a]=nums[b];
		nums[b]=t;
	}

}
