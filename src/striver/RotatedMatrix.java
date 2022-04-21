package striver;

public class RotatedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{5,1,9,5},
				{2,4,8,6},
				{13,3,6,8},
				{15,14,12,9}
		};
//		arr=rotate(arr);
		rotate2(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	//naive approach
	static int[][] rotate(int[][] arr) {
		int m=arr.length,n=arr[0].length;
		int[][] rotated=new int[n][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				rotated[j][m-1-i]=arr[i][j];
			}
		}
		
		
		return rotated;
	}
	
	//Better Approach
	
	static void rotate2(int[][] arr) {
		//Transpose of Matrix
		int m=arr.length,n=arr[0].length;
		for(int i=0;i<m;i++) {
			for(int j=i;j<n;j++) {
				if(i==j) {
					continue;
				}
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n/2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][n-j-1];
				arr[i][n-j-1]=temp;
			}
		}
		
		
	}
}
