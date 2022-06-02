package ConditionalStatementElseIf;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);

System.out.println("Enter the month you were born in");
String month1=scan.next();
if (month1.equalsIgnoreCase("January") || month1.equalsIgnoreCase("February") || month1.equalsIgnoreCase("December")) {
	System.out.println("You were born in winter");
} else if (month1.equalsIgnoreCase("March") || month1.equalsIgnoreCase("April") || month1.equalsIgnoreCase("May")) {
	System.out.println("Spring!!");
} else if (month1.equalsIgnoreCase("June") || month1.equalsIgnoreCase("July") || month1.equalsIgnoreCase("August")) {
	System.out.println("Summer");
} else if (month1.equalsIgnoreCase("September")||month1.equalsIgnoreCase("October") || month1.equalsIgnoreCase("November")) {
	System.out.println("Fall");
}
	
System.out.println("-----------------------------------------------");
System.out.println("Enter your quiz score");
int score1=scan.nextInt();
System.out.println("Enter your mid term score");
int score2=scan.nextInt();
System.out.println("Enter your final score");
int score3=scan.nextInt();
int average=(score1+score2+score3)/3;
if (average>=90) {
	System.out.println("Grade A");
} else if (average>=70 && average <90) {
	System.out.println("Grade B");
} else if (average>=50 && average<70) {
	System.out.println("Grade C");
} else if (average<50) {
	System.out.println("Grade F");
}
System.out.println("------------------------");

System.out.println("Please enter month number");
int month=scan.nextInt();
if (month==1) {
  System.out.println("January");
} else if (month==2){
  System.out.println("February");
} else if (month==3) {
  System.out.println("March");
} else if (month==4){
  System.out.println("April");
} else if (month==5){
  System.out.println("May");
} else if (month==6){
  System.out.println("June");
} else if (month==7){
  System.out.println("July");
} else if (month==8){
  System.out.println("August");
} else if (month==9){
  System.out.println("September");
} else if (month==10){
  System.out.println("October");
} else if (month==11){
  System.out.println("November");
} else if (month==12){
  System.out.println("December");
} 
else {
  System.out.println("Invalid");
}
}
}