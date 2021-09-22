import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2dArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {
				{1,2},
				{3,4,5},
				{6,7,8,9,10}	
		};
		int target=sc.nextInt();
		System.out.print(Arrays.toString(search(arr,target)));

	}
	
	static int[] search(int[][] arr, int target) {
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				if(arr[row][column]==target) {
					return new int[]{row,column};
				}
			}
		}
		return new int[]{-1,-1};
	}

}
