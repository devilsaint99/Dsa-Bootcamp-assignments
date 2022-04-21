package binarySearch;

import java.util.Arrays;

public class First_And_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,7,9,10,10,11,14,14};
		int target=6;
		int[] ans= {-1,-1};
		int first=Search(arr,target,true);
		int last=Search(arr,target,false);
		ans[0]=first;
		ans[1]=last;
		System.out.println(Arrays.toString(ans));
	}
	
	static int Search(int[] arr,int target,boolean findfirstindex) {
		int start=0,end=arr.length-1;
		int mid=0;
		int ans=-1;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(arr[mid]>target){
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				ans=mid;
				if(findfirstindex) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		
		return ans;
	}

}
