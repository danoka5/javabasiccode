package Arrays;

public class Array2DstateCity {

	public static void main(String[] args) {
		// created 2nd array of states
		
		String [][]usa= {
				{"NY","Albany","Buffalo"},
				{"lA","SJ","SF","San Diego"},
				{"Miami","Orlando","Tampa"},
				{"Rich","McLean"}
						
		};
		System.out.println(usa [1][2]);
		System.out.println("I want to go to "+usa[2][0]);

	System.out.println("Total number of 1D arrays in array usa="+usa.length);
	
	for (String []state:usa) {
		for (String city:state) {
			System.out.println(city);
		}
	}
	}
}
