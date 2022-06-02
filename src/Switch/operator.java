package Switch;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the 1st number");
		int num1=scan.nextInt();
		System.out.println("Please enter the 2nd number");
		int num2=scan.nextInt();
		System.out.println("Enter operator");
		char operator=scan.next().charAt(0);
		if (operator=='+') {
			System.out.println(num1+num2);
		}	else if (operator=='-' ) {
			System.out.println(num1-num2);
		}	else if (operator=='/') {
			System.out.println(num1/num2);
		}	else if (operator=='*') {
			System.out.println(num1*num2);
		}
		
		System.out.println("-----------------------------------");
	int result=0;
		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '*':
			result=num1*num2;
			break;
	}	System.out.println("If you use "+operator+" you will get "+result);
		
	}

}
