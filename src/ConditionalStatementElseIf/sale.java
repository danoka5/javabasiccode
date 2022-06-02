package ConditionalStatementElseIf;

import java.util.Scanner;

public class sale {

	public static void main(String[] args) {
		/*
After discount ___ the price of the item reduce from __ to ___
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Do you have a sale today?");
char sale = scan.next().charAt(0);
if (sale=='y') {
	System.out.println("What item you want to buy?");

	int discount, finalPrice;
String item=scan.nextLine();
	System.out.println("What is the price");
double price=scan.nextDouble();
discount=0;
if (price<20 ) {
System.out.println("The new price after discount is "+(price*0.90));
} else if (price > 20 && price <100) {
System.out.println("The new price after discount is "+(price*0.80));
} else if (price >100 && price<500) {
System.out.println("The new price after discount is "+(price*0.70));
} else {
System.out.println("The new price after discount is "+(price*0.50));
}

	} else {
		System.out.println("You are not going shopping");
	}
	}
}
