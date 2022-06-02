package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=2; i++) {
			if (i%2==0) {
				sumEven+=i;
		} else {
				sumOdd+=i;
		}
		} System.out.println("Sum "+sumEven);
		  System.out.println("Sum "+sumOdd);
		  
		  
System.out.println("-------------------------");
for (int a=10; a>1; a--) {
	System.out.println(a);
} System.out.println("Happy");

System.out.println("----------------------");
int num=3;
for (int i=1; i<=10; i++) {
	System.out.println(num+"*"+i+"="+num*i);
	
System.out.println("-----------------------");
for (int b=1; b<10; b++) {
if (b!=5 || b!=6) {
	continue;
} System.out.println(b);
}
}
System.out.println("------------------------");



}
	}


	


