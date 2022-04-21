package striver;
import java.util.*;
public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,3},{15,18},{2,6},{8,10},{9,9}};
		ArrayList<int[]> res=merge(arr);
		int len=res.size();
		System.out.println(len);
		int[][] fin=new int[len][];
		for(int[] i:res) {
			System.out.print(Arrays.toString(i));
		}
	}
	static ArrayList<int[]> merge(int[][] arr){
		ArrayList<int[]> res=new ArrayList<int[]>();
		int index=0;
		Arrays.sort(arr , (a,b) -> Integer.compare(a[0], b[0]) );
		while(index<arr.length) {
			int[] point=arr[index];
			boolean merger=true;
			while(merger && index<arr.length) {
				
				int[] toComp=arr[index];
				if(point[1]>=toComp[0]) {
					point[1]=(point[1]>=toComp[1])?point[1]:toComp[1];
					index++;
				}
				else {
					merger=false;
					
				}
				
			}
			res.add(point);
		}
		
		return res;
	}
	
}
