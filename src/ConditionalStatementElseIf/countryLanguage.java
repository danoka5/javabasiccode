package ConditionalStatementElseIf;

import java.util.Scanner;

public class countryLanguage {

	public static void main(String[] args) {
		/*

		 * 
		 */
Scanner scan=new Scanner (System.in);

System.out.println("Enter your country");
String country=scan.nextLine();
if (country.equalsIgnoreCase("france")) {
	System.out.println("You speak french");
}	else if (country.equalsIgnoreCase("kazakhstan")) {
	System.out.println("You speak kazakh");
}	else if (country.equalsIgnoreCase("russia")) {
	System.out.println("You speak russian");
}	else {
	System.out.println("unknown"); 
	
}




	}

}
