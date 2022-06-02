package Loops;

import java.util.Scanner;

public class shopping {

	public static void main(String[] args) {
		/*					price			payment														balance									
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		*/
		Scanner scan=new Scanner (System.in);
		double accumulatedAmount=0;    
      
        double amountToPayOff;    
        do {    
           
        System.out.println("Enter the item name that you want to buy");    
        String itemName=scan.nextLine();    
        System.out.println("Enter the price of item");    
        double itemPrice=scan.nextDouble();    
        accumulatedAmount=accumulatedAmount+itemPrice;    
        System.out.println("Please Enter the money");    
        double money=scan.nextDouble();    
amountToPayOff=money-accumulatedAmount;  //60 -100 =-40    
if(amountToPayOff<0) {    
           System.out.println("Amount to pay off "+ (-1*amountToPayOff));    
}    
           
        }    
        while(amountToPayOff<0);    
        System.out.println("Here is your change"+amountToPayOff+"Thank you for shopping!"); 
           
        //System.out.println(itemName+" "+itemPrice);    
		

	}

}
