package arraysandstrings;

import java.util.Scanner;

/*
 * reverse string in O(1) space
 */

public class reversestring {
	 public static void reverseString(char[] s) {
	 //Write your code here	
		 
		 for(int i=s.length-1;i>=0;i--) {
			 System.out.print(s[i] + " ");
		 }

	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 char[] charArray = new char[n];
	 	 for (int i = 0; i < charArray.length; i++) {
	 	 	 charArray[i] = scn.next().charAt(0);
	 	 }

	 	 reverseString(charArray);

	 	 

	 }

}
