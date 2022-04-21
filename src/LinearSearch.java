import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {20,10,12,19,77};
		int target=sc.nextInt();
		System.out.print(linearSearch(arr,target));
	}
	static int linearSearch(int[] arry,int need) {
		for(int i=0;i<arry.length;i++) {
			if(arry[i]==need){
				return i;
			}
		}
		return -1;
	}

}
