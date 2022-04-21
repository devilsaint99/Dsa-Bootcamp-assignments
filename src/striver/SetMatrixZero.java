package striver;

import java.util.Arrays;

public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={
				{0,2,3,4},
				{1,2,3,4},
				{4,0,2,6},
				{1,2,3,4},
				{1,2,3,4},
		};
		for(int[] i:setMatrix3(arr)) {
			System.out.println(Arrays.toString(i));
		}
		
	}
// Brute Force Approach
	static int[][] setMatrix(int[][] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					int ind=i-1;
					while(ind>=0) {
						if(arr[ind][j]!=0)
							arr[ind][j]=-1;
						ind--;
					}
					ind=i+1;
					while(ind<=arr.length-1) {
						if(arr[ind][j]!=0)
							arr[ind][j]=-1;
						ind++;
					}
					ind=0;
					while(ind<arr[0].length) {
						if(arr[i][ind]!=0)
							arr[i][ind]=-1;
						ind++;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==-1) {
					arr[i][j]=0;
				}
			}
			
		}
		
		return arr;
	}
//Better Approach
	static int[][] setMatrix2(int[][] arr){
		int[] dummy1=new int[arr.length];
		int[] dummy2=new int[arr[0].length];
		Arrays.fill(dummy1,-1);
		Arrays.fill(dummy2,-1);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					dummy1[i]=0;
					dummy2[j]=0;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(dummy1[i]==0 || dummy2[j]==0) {
					arr[i][j]=0;
				}
			}
		}
		
		return arr;
	}
	
//Best Approach
	static int[][] setMatrix3(int[][] arr){
		int col0=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]==0)
				col0=0;
			for(int j=1;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					arr[i][0]=0;
					arr[0][j]=0;
				}
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr[0].length-1;j>=1;j--) {
				if(arr[i][0]==0 || arr[0][j]==0){
					arr[i][j]=0;
				}
			}
			if(col0==0)
				arr[i][0]=0;
		}
		return arr;
	}
	

}
