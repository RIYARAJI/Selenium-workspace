package week1.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
				String s1 = text1.toLowerCase();  
		        String s2 = text2.toLowerCase();  
		        
		        boolean status = true;  
		        
		        //Check length of the strings are same
		        if (s1.length() != s2.length()) {  
		            status = false;  
		        } else {  
		        	
		        	//Convert both Strings in to characters
		            char[] ArrayS1 = s1.toCharArray();  
		            char[] ArrayS2 = s2.toCharArray(); 
		            
		            //Sort Both the arrays
		            Arrays.sort(ArrayS1);  
		            Arrays.sort(ArrayS2);  
		            
		            //Check both the arrays has same value
		            status = Arrays.equals(ArrayS1, ArrayS2);  
		        }  
		        if (status) {  
		            System.out.println(s1 + " and " + s2 + " are anagrams");  
		        } else {  
		            System.out.println(s1 + " and " + s2 + " are not anagrams");  
		        }  
		    } 
}
