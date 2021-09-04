//checks if the no. is armstrong number or not
package Conditionals;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int rem,temp=num;
		int checker=0;
		String n=String.valueOf(num);
		int nn=n.length();
		
		while(num>0) {
			rem=num%10;
			int res=(int)Math.pow(rem, nn);
			checker=checker+res;
			
			num/=10;
		}
		
		
		if(checker==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	
	}

}
