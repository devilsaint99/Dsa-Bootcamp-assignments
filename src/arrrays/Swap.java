package arrrays;

import java.util.Scanner;
import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int[] arr=new int[5];
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Enter Index 1:");
		 int index1=sc.nextInt();
		 System.out.println("Enter Index 2:");
		 int index2=sc.nextInt();
		 swap(arr,index1,index2);
		 System.out.print(Arrays.toString(arr));
	}
	static void swap(int[] sArr, int ind1, int ind2) {
		int temp=sArr[ind1];
		sArr[ind1]=sArr[ind2];
		sArr[ind2]=temp;
	}

}
