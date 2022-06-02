package ConditionalStatementElseIf;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
	System.out.println("enter number");
	int num=scan.nextInt();
	if (num>=1 && num<=10) {
		System.out.println("small");
		
	} else if (num>=11 && num<= 100) {
		System.out.println("medieum");
	} else if (num>100 && num <1000) {
		System.out.println("òarge");
	}
	
	System.out.println("--------------------------");
	
	
	System.out.println("Enter day");
	int day=scan.nextInt();
	if (day==1 || day==2 || day==3 ||day==4 || day ==5) {
		System.out.println("Weekday");
	} else if (day==6 || day==7) {
		System.out.print("Weekend");
	} else {
		System.out.println("invalid");
	}
	
	}
	
	
	

}
