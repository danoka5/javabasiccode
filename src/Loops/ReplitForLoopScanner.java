package Loops;

import java.util.Scanner;

public class ReplitForLoopScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the end number");
		int x= scan.nextInt();
		int i;
		for (i=1; i<x; i++) {
			System.out.println(i);
		} 

		System.out.println("------------------------");
		int end, b;
		end=scan.nextInt();
		for (b=0; b<end*2; b++) {
			System.out.print(b+" ");
		}
		
		System.out.println("Write a for loop that will print out a series of numbers "
				+ "starting at one less than x and ending at 0.");
		System.out.println("enter number");
		int num=scan.nextInt();
		for (num=num-1; num>0; num-- ) {
			System.out.println(num);
		}
	}

}
