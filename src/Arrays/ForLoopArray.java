package Arrays;

public class ForLoopArray {

	public static void main(String[] args) {
		String [] colors = {"pink", "blue", "black"};
		for (String color:colors) {
			System.out.println(color+" ");
		} 
	
		System.out.println("--------------------------");
		int [] numbers = {10,20,30,40};
		for (int num: numbers) {
			System.out.println(num);
		}
		
System.out.println("---------------------------");
String [] cars= {"bmw", "mercedes", "tesla", "audi", "rivian", "ferrari"};
for (String cars1:cars) {
System.out.println(cars1);
}		

System.out.println("------------------------");
String [] animals= {"cats", "dogs", "elepahnts","giraffe"};
for (String animal:animals) {
System.out.println(animal);
}

System.out.println("---------------");


		
		System.out.println("-------------------");
	char []grade= {'a','b','c','d'};
	for (int c=4; c>grade.length;c-- ) {
		System.out.println(grade [c]+" ");
	}
	
	
} 
	
}
