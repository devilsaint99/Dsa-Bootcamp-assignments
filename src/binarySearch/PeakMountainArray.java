package binarySearch;

public class PeakMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,13,14,15,14,13,12,11,10,9,8,7,6,5};
		System.out.print(Peak(arr));
	}
	static int Peak(int[] arr) {
		int start=0,end=arr.length-1;
		int mid=0;
		while(start<end) {
			mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
				return mid;
			}
			else if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}
			else if(arr[mid]>arr[mid+1]) {
				end=mid-1;
			}
			
		}
		return -1;
	}

}
