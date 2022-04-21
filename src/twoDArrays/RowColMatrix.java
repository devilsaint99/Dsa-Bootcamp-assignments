package twoDArrays;

import java.util.Arrays;

public class RowColMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
		};
		System.out.print(Arrays.toString(Search(arr,299)));
		
	}
	
	static int[] Search(int[][] arr,int target) {
		int row=0;
		int col=arr.length-1;
		while(row<arr.length-1 || col>=0) {
			if(arr[row][col]==target) {
				return new int[]{row,col};
			}
			if(arr[row][col]>target) {
				col--;
			}
			else {
				row++;
			}
		}
		return new int[]{-1,-1};
	}

}
