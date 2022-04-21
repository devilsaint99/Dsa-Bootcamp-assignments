package striver;
import java.util.*;
public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-11};
		System.out.print(maxSubArray(arr));
	}
	
	
	static int maxSubArray(int[] nums) {
		ArrayList<Integer> subarray=new ArrayList<Integer>();
		int max_sum=Integer.MIN_VALUE;
		int cur=0;
		int minInd=0;
		for(int i=0;i<nums.length;i++) {
			cur+=nums[i];
			
			if(cur>max_sum) {
				max_sum=cur;
				subarray.clear();
				subarray.add(minInd);
				subarray.add(i);
			}
			if(cur<0) {
				cur=0;
				minInd=i+1;
				
			}
		}
		
		
		return max_sum;
	}
}
