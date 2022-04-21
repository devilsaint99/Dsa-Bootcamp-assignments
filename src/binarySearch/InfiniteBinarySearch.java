package binarySearch;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
		System.out.print(ans(arr,160));
	}
	static int ans(int[] arr,int target) {
		int start=0;
		int end=1;
		int temp=0;
		while(target>arr[end]) {
			
			temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
		}
		
		return Search(arr,target,start,end);
	}
	static int Search(int[] arr,int target,int start,int end) {
		int mid=0;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(arr[mid]>target){
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}
}
