package day2;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
		
		//Arrange the array in ascending order
		  Arrays.sort(data);
	      System.out.println("sorted Array :"+Arrays.toString(data));		
		
		// Print the second largest number	
		int size = data.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(data[i]>data[j]){
	              int temp = data[i];
	               data[i] = data[j];
	               data[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is: "+data[size-2]);		
	}
}
