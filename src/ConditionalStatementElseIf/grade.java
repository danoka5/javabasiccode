package ConditionalStatementElseIf;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
System.out.println("What is your grade?");
char grade;
String explanation;
grade=scan.next().charAt(0);
if (grade=='A') {
	System.out.println("excellent");
} else if (grade=='B') {
	System.out.println("Good");
} else if (grade=='C') {
	System.out.println("Average");
} else if (grade=='D') {
	System.out.println("Bad");
} else {
	System.out.println("Not acceptable");
}

System.out.println("------------------------------------");

switch (grade) {
case 'A':
	explanation="excellent";
	break;
case 'B':
	explanation="good";
	break;
case 'C':
	explanation="average";
	break;
case 'D':
	explanation="bad";
	break;
default:
	explanation="not acceptable";
	break;
}
System.out.println("Your grade is "+grade+" and it is "+explanation);
	}

}
