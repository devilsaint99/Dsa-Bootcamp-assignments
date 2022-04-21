package dailyCodingQuestion;

import java.util.Arrays;

//This problem was asked by Amazon.

//Given a pivot x, and a list lst, partition the list into three parts.
//
//The first part contains all elements in lst that are less than x
//The second part contains all elements in lst that are equal to x
//The third part contains all elements in lst that are larger than x
//Ordering within a part can be arbitrary.
//
//For example, given x = 10 and lst = [9, 12, 3, 5, 14, 10, 10], one partition may be [9, 3, 5, 10, 10, 12, 14].





public class ThreeWayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=  {9, 10, 3, 5, 14, 12, 10};
		int pivot=10;
		int[]  ans=Partition(arr,pivot);
		System.out.print(Arrays.toString(ans));
	}
	
	static int[] Partition(int[] arr,int x) {
		int l=0;
		int r=arr.length-1;
		int[] res=new int[r+1];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<x) {
				res[l]=arr[i];
				l++;
			}
			else if(arr[i]>x) {
				res[r]=arr[i];
				r--;
			}
			else {
				count++;
			}
		}
		while(count>0) {
			res[l]=x;
			l++;
			count--;
		}
		return res;
	}
}
