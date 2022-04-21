package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		//System.out.print(arr.length);
		System.out.print(Search(arr,3));
	}
	
	static int Search (int[] arr,int target) {
		int start=0,end=arr.length-1;
		int mid=0;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			
		}
		
		return -1;
	}

}
