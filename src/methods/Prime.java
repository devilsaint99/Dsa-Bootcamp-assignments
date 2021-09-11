///isPrime Method implementation

package methods;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(isPrime(n));
	}
	
	static boolean isPrime(int num) {
		boolean check=true;
		if(num<=1) {
			check=false;
		}
		else if(num==2 || num==3) {
			check=true;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				check= false;
				break;
			}
			
		}
		return check;
		
	}

}
