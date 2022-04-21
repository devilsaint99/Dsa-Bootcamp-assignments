package binarySearch;

public class OrderAgnostic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {99,98,97,96,89,88,87,86,79,78,77,76};
		System.out.print(Search(arr,88));
	}
	static int Search (int[] arr,int target) {
		int start=0,end=arr.length-1;
		int mid=0;
		boolean isAsc = arr[start]<arr[end];
		while(start<=end) {
			mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(isAsc) {
				if(arr[mid]>target) {
					end=mid-1;
				}
				else if(arr[mid]<target) {
					start=mid+1;
				}
			}
			else {
				if(arr[mid]<target) {
					end=mid-1;
				}
				else if(arr[mid]>target) {
					start=mid+1;
				}
			}
			
			
		}
		
		return -1;
	}
}
