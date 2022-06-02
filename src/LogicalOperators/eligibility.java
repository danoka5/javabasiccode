package LogicalOperators;

import java.util.Scanner;

public class eligibility {
public static void main (String []args ) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Do you need a loan?");
	   boolean answer=scan.nextBoolean();
	   int score;
	   String eligibility;
	   if (answer) {
	     System.out.println("What is your score?");
	     score=scan.nextInt();
	     if (score<600) {
	     eligibility="Not eligible";
	   } else if (score>=600 && score<=700) {
	     eligibility="Maybe eligible";
	   } else if (score>700 && score<=800) {
	     eligibility="Eligible";
	   } else {
	     eligibility="Definitely eligible";
	   } 
	     } else {
	     eligibility="Unknown";
	     
	     } System.out.println("The eligibility is "+eligibility);
	   
}
}
