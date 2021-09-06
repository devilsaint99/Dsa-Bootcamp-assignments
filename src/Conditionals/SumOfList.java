//Write a program to print the sum of negative numbers, sum of positive even numbers and 
//the sum of positive odd numbers from a list of numbers (N) entered by the user.
//The list terminates when the user enters a zero.

package Conditionals;

import java.util.Scanner;

public class SumOfList {

	public static void main(String[] args) {
		int negSum=0,posEvenSum=0,posOddSum=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			//taking integers as input till 0 received as input
			int inp=sc.nextInt();
			if(inp==0) {
				break;
			}
			else if(inp<0) {
				negSum+=inp;
			}
			else if(inp>0 && inp%2==0) {
				posEvenSum+=inp;
			}
			else if(inp>0 && inp%2!=0) {
				posOddSum+=inp;
			}
		}
		System.out.println("Sum of negative numbers entered : "+negSum);
		System.out.println("Sum of positive even numbers entered : "+posEvenSum);
		System.out.println("Sum of positive odd numbers entered : "+posOddSum);
	}

}
