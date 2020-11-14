package linkedlists;

import java.util.*;
import java.io.*;
public class decodestringatindex {
	   public static String decodeIndex(String S, int K) {
	  // Write your code here only    
		   int size=0;
		   char input[] = S.toCharArray();
		   for(int i=0;i<input.length;i++) {
			   if(Character.isDigit(input[i])) {
				   size*=input[i]-'0';
			   }
			   else {
				   size++;
			   }
		   }
		   for(int i = input.length-1;i>=0;i--) {
			   if(Character.isLetter(input[i])) {
				   if((K+1)%size==0) {
					   return Character.toString(input[i]);
				   }
				   size--;
			   }
			   else if(Character.isDigit(input[i])){
				   int val = input[i]-'0';
				   size=size/val;
			   }
		   }
		   return "";
	  }



	  

	  // Dont make changes here
	  public static void main(String[] args) {
	  	  Scanner sc=new Scanner(System.in);
	  	  String s=sc.next();
	  	  int k=sc.nextInt();
	  	  System.out.println(decodeIndex(s,k));
	  }

}
