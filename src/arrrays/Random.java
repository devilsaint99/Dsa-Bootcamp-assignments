package arrrays;
import java.util.Scanner;

public class Random {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// TODO Auto-generated method stub
		int[] rollnos=new int[5];
		for (int e:rollnos){
			System.out.println(e);
		}
		for(int i=0;i<rollnos.length;i++) {
			rollnos[i]=sc.nextInt();
		}
		for (int e:rollnos){
			System.out.println(e);
		}

	}

}
