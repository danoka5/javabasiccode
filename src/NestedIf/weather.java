package NestedIf;

import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		  System.out.println("Is it sunny outside?");
		  boolean isSunny = scan.nextBoolean();
		  int temperature = scan.nextInt();
		  if (isSunny){
		  System.out.println("It is a sunny day, I should go somewhere!");
		} else {
		  System.out.println("I stay home and practice Java");
		  }

	}

}
