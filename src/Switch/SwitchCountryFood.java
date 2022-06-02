package Switch;

import java.util.Scanner;

public class SwitchCountryFood {

	public static void main(String[] args) {
		
Scanner scan=new Scanner (System.in);
String country, language;
System.out.println("Where are you from?");
country=scan.nextLine();
switch(country.toLowerCase()) {
case "kazakhstan":
	language="kazakh";
	break;
case "russia":
	language="russian";
	break;
case "france":
	language="french";
	break;
default:
	language="unknown";
	break;
}
	System.out.println("You are from "+country+" and you speak "+language);

}

 

	}


