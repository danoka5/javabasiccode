package Arrays;

public class findSecondLargest {

	public static void main(String[] args) {
		// find the second largest number
		
		int [] array = {3,4,7,2,6,5};
		int largest=0;
		int secondlargest=0;
		for (int i=0; i<array.length; i++) {
		
			if (array[i]>largest) {
				largest=array[i];
			} 
		}	
		for (int i=0; i<array.length;i++) {
			if (array[i]>secondlargest && array [i]<largest) {
				if (largest !=secondlargest) {
					secondlargest=array [i];
				}
			}
			
		}
		System.out.println("The second largest array is "+secondlargest);
	}
}
	


