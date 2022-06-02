package ConditionalStatementElseIf;

import java.util.Scanner;

public class balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
	System.out.println("Credit card? yes or no?");
	String answer=scan.next();
	
	if (answer.equals("no")) {
		System.out.println("We will offer you one");
	} else {
		System.out.println("Balance you have");
		int balance=scan.nextInt();
		if (balance>=1000) {
			System.out.println("Pay immediately");
		} else {
			System.out.println("Spend more");
		}
	}
	}

}
