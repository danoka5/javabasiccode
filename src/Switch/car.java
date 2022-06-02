package Switch;

import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your favorite car make");
		  String car, carOrigin;
		    car=scan.nextLine();
		  switch (car){
		    case "BMW":
		    carOrigin="german car";
		    break;
		    case "Toyota":
		    carOrigin="japanese car";
		    break;
		    case "Maserati":
		    carOrigin="italian car";
		    break;
		    default:
		    carOrigin="unknown";
		    break;
		  } System.out.println("Your favorite car is "+carOrigin);

	}

}
