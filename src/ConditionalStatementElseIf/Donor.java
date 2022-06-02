package ConditionalStatementElseIf;

public class Donor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17; 
		int weight = 100;
		if (age>=18) {
			System.out.println ("You are eligible");
		} 
		else {
			System.out.println ("You are not eligible");
		}
		if (weight>110 ) {
			System.out.println("You are eligible");
		}
		else {
			System.out.println ("We cannot accept you");
		}
	}

}
