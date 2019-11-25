package day2;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {1,3,2,4,6,7,8};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		//Arrange the array in ascending order
		  Arrays.sort(data);
	      System.out.println("sorted Array :"+Arrays.toString(data));
	      
	      int n = data.length + 1;
	      int sum = (n*(n+1))/2;
	      
	      for (int i = 0; i < data.length; i++) {
			sum = sum - data[i];
		}
	      System.out.println("Missing number " + sum);
	      
	      
	}

}
