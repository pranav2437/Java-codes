package arraysandstrings;


/*
 * 1. You will be given a binary string with only 0s and 1s
2. You need to check minimum flips needed to make string monotone increasing
3. Monotone increasing: String consisting some number of '0's (possibly 0),
 followed by some number of '1's (also possibly 0.)
 */
import java.util.*;
class flipbitstomakestringmonotonic{
public static void main(String[] args){
    Scanner scn= new Scanner(System.in);
    String s= scn.next();
    System.out.print(minFlipsMonoIncr(s));
}
   	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a string
	 // It should return required output.	  

public static int minFlipsMonoIncr(String S) {
       //Write your code here
			int a=0;              //a represents min flips to make substring of 0___1___ nature
			int b=0;              //b represents min flips to make substring of 0_______ nature
			String str=S.substring(0, 2);     //set a,b for first two chars
			if(str.equals("00")) {
				a=1;
				b=0;
			}
			else if(str.equals("01")) {
				a=0;
				b=1;
			}
			else if(str.equals("10")) {
				a=2;
				b=1;
			}
			else {
				a=1;
				b=2;
			}
			for(int i=2;i<S.length();i++) {
				char c=S.charAt(i);
				if(c=='1') {
					a= Math.min(a, b);
					b++;
					
				}
				else {
					a=Math.min(a, b) +1;
				}
			}
	
			int c = S.length()-b;
			if(c<b) {
				return Math.min(a, c);
			}
			else {
				return Math.min(a, b);
			}
	
	 }
}