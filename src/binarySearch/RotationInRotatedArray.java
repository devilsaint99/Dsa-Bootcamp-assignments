package binarySearch;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, 18, 2, 3, 6, 12};
        
        System.out.println(Pivot(arr)+1);

	}
	static int Pivot(int[] arr) {
		int start=0;
		int end=arr.length;
		int mid=0;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(start<mid && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[start]>arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

}
