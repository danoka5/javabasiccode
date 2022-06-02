package Arrays;

import java.util.Scanner;

public class sumOfNumbers {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. 
		// After the array is created, calculate the sum of all stored elements in that array
Scanner scan=new Scanner (System.in);
System.out.println("enter 4 values");
int num1=scan.nextInt();
int num2=scan.nextInt();
int num3=scan.nextInt();
int num4=scan.nextInt();

int sum=0;
int []array= {num1,num2,num3,num4};
for (int i=0; i<array.length;i++) {
	sum=sum+array[i];
	
}
		System.out.println("The sum of all numbers is "+sum);
	}

}
