//fibonacci series 


package Conditionals;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a1=0,a2=1,a3;
		System.out.print(a1+" "+a2+" ");
		for(int i=2;i<n;i++) {
			a3=a1+a2;
			
			a1=a2;
			a2=a3;
			System.out.print(a3+" ");
		}
	}

}
