package Loops;

import java.util.Scanner;

public class clock {

	public static void main(String[] args) {

/*
Using nested loop, create a 24 hour clock that will display 2 digits for an hour and 2 digits for a minute.
 */

for (int a=0; a<=23; a++) {
	for (int b=0; b<=59; b++) {
		System.out.println(a+" "+b);
	}
}
		
System.out.println("----------------------");
for (int hrs=0; hrs<24; hrs++) {
	for (int min =0; min<60; min++) {
		String time;
		if (hrs<10 && min<10) {
			time ="0"+hrs+":"+"0"+min;
			
		} else if (hrs<10 && min>10)
			time="0"+hrs+":"+min;
		System.out.println(hrs+":"+min);
	}
}
}
	}


	


