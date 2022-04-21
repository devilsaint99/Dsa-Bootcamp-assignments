import java.util.Scanner;

//given an array and a  number find the ceiling number from the array
public class CeilingOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int[] arr= {2,6,9,10,14,20,29};
		int res;
		res=ceiling(arr,target);
		// TODO Auto-generated method stub
		System.out.println(arr[res]);
		
	}
	static int ceiling(int[] arr,int target) {
		int low=0,mid=0;
		int high=arr.length;
		while (low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==target)
				return mid;
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
