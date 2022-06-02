package Arrays;

import java.util.Arrays;

public class task {

	public static void main(String[] args) {
		/*1)Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
		 * 
2)Using Scanner create an array of countries. When an array is created, retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).

3)Create a 2D array of integer values. Print the sum of all numbers.
4)Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.
5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
6)Write a program to swap 2 numbers without a temporary variable?
7)Write a java program to check whether a given number is prime or not?
8)Write a Java Program to print the first 10 numbers of Fibonacci series.
9)Maximum and minimum number in the array?
10)Write a java program to find the second largest number in the array?
11)Write a program to print out duplicate elements from an Array of Strings?
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("will work only if there is no duplicate number");
		int []array = {2,67,22,44,12,87};
		Arrays.sort(array);
		System.out.println("the 2nd largest number is "+array[array.length-2]);
		
		System.out.println("another way-----------");
		
		int [] arrays = {2,3,4,8,6,10,9};
		int max=0;
		int secondmax=0;
		for (int i=0; i<arrays.length; i++) {
			if (arrays[i]>max) {
				secondmax=max;
				max=arrays[i];
				
				}
			else if (arrays[i] >secondmax);
			}
		 secondmax=arrays[i];
	}
}
