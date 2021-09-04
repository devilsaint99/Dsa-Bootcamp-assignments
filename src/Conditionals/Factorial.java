//Factorial of a number n  

package Conditionals;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fac=1;
		for(int i=2;i<=n;i++) {
			fac*=i;
		}
		System.out.println(fac);
	}

}
