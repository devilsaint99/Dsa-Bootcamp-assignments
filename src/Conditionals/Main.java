//Kunal is allowed to go out with his friends only on the even days of a given month.
//Write a program to check if he can go out in the month of August.

package Conditionals;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		while(true) {
			int inp=sc.nextInt();
				
			if(inp>31) {
				System.out.println("Invalid date, Enter correct date");
			}
			else {
				if(inp%2==0) {
					System.out.println("Kunal is allowed to go out today");
				}
				else {
					System.out.println("Kunal is not allowed to go out today");
				}
				break;
			}
				
		}

	}

}


