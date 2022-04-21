package arrrays;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDemArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			arrayList.add(new ArrayList<Integer>());
			
		}
		
		for(int row=0;row<3;row++) {
			System.out.println(row);
			for(int col=0;col<3;col++) {
				System.out.println(col);
				arrayList.get(row).add(sc.nextInt());
			}
		}
		System.out.println(arrayList);
	}

}
