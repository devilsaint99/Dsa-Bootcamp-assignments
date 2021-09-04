//Area of circle
//This code is not at all related to conditionals

package Conditionals;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square :");
		int radius=sc.nextInt();
		float area;
		area=3.14f*radius*radius;
		System.out.println(area);
	}

}
