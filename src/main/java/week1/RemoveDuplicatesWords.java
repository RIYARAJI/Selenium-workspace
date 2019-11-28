package week1;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		
		// Initialise an integer variable as count
		int count;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */
		
		//a) Split the String into array and iterate over it 
		String[] array = text.split(" ");
		
		//b) Initialise another loop to check whether the word is there in the array
		for (int i = 0; i < array.length; i++) {
			count = 1;
			for (int j = i+1; j < array.length; j++) {
				
				//if it is available then increase and count by 1.
				if(array[i].equals(array[j])) {
					count++;
				}
			}
			
			//if the count > 1 then replace the word as ""
			if(count>1) {
				System.out.print(array[i]);
			}
		}
	}

}
