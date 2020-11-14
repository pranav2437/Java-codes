package arraysandstrings;

import java.util.*;
/*
 * 1. You will be given a String and an integer k
2. Given that you can replace exactly k characters with any character,
 you need to find length of the longest sequence with repeating character 
 */

public class longestrepeatingchar {
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String s = scn.next();
	 	 int k = scn.nextInt();
	 	 System.out.println(characterReplacement(s, k));
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and integer k.
	 // It should return required output.

	 public static int characterReplacement(String s, int k) {
	 	 // Write your code here
		 
		 int maxlength=Integer.MIN_VALUE;
		 for(char ch='A';ch<='Z';ch++) {
			 int start=0;
			 int skips =0;
			 int end=1;
			 boolean valid=true;
			 while(end<=s.length()) {
				 if(end==s.length()) {
					 break;
				 }
				 
				 if(valid) {
					 if(s.charAt(end)!=ch) {
						 skips++;
					 }
					 if(skips>k) {
						 valid=false;
					 }
					 end++;
				 }
				 int length=end-start-1;
				 if(length>maxlength) {
					 maxlength=length;
				 }
				 if(!valid) {
					 char c = s.charAt(start);
					 if(c!=ch) {
						 skips--;
					 }
					 start++;
					 if(skips<k) {
						 valid=true;
					 }
					 
				 }
				 
			 }
			 
			 
		 }
		
		 
		 return maxlength;
	 }
}
