package ConditionalStatementElseIf;

import java.util.Scanner;

public class LoanBonus {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);

	System.out.println("What amount is needed for your loan?");
	int loan=scan.nextInt();
if (loan <=200000) {
	System.out.println("We can lend you money");
} else {
	System.out.println("Rejected");
}
System.out.println("-------------------------------------------");

	System.out.println("Enter city");
	String city=scan.next();
	System.out.println("Enter temperature");
	int temp=scan.nextInt();
	int temperature=(temp-32)*5/9;
	System.out.println("The temp in the city "+city+" is "+temperature);
	
System.out.println("--------------------------------------------");
	
	System.out.println("Number of years worked");
	int years=scan.nextInt();
	System.out.println("Annual salary");
	int salary=scan.nextInt();
 if (years>=5) {
	System.out.println("You are eligible for the bonus");
	  if (salary>50000) {
	System.out.println("Your bonus is 5000");
	} else {
	System.out.println("Your bonus is 3000");
	}
	
} else {
	System.out.println("You are NOT eligible for the bonus");
}

System.out.println("----------------------------------------------");

	System.out.println("What time is it? Use 24 hour format.");
	int time=scan.nextInt();
	  if (time>=1 && time<=11) {
		System.out.println("Morning");
	} else if (time>=12 && time<=15) {
		System.out.println("Afternoon");
	} else if (time>=16 && time<=20) {
		System.out.println("Evening");
	} else if (time>=21 && time<=24) {
		System.out.println("Night");
	}
	else {
		System.out.println("Invalid time");
	}
	 


	}

}


