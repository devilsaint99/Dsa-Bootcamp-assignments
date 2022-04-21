package binarySearch;

public class CeilingOfLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'c','f','g'};
		char target='a';
		int res=Ceiling(arr,target);
		System.out.println(arr[res]);
	}
	static int Ceiling(char[] arr, char target) {
		int low=0,high=arr.length;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid+1;
			}
			else {
				if(arr[mid]>target) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
		}
		return low;
	}
}
