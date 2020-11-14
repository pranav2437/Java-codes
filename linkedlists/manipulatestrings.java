package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class manipulatestrings {
	 
	 public static int stringManipulation(String[] S){
	 /// Write your code here
		 Stack<String> st = new Stack<>();
		 for(int i=0;i<S.length;i++) {
			 if(st.isEmpty()) {
				 st.push(S[i]);
			 }
			 else if(S[i].equals(st.peek())) {
				 st.pop();
				 continue;
			 }
			 else {
				 st.push(S[i]);
			 }
		 }
		 return st.size();
		 
	 }






	 // Dont make changes here
        public static void main (String[] args) {
	 	 Scanner sc=new Scanner(System.in);
	 	     int l=sc.nextInt();
	 	     String[] S=new String[l];
	 	     for(int i=0;i<S.length;i++)
	 	         S[i]=sc.next();
	 	     System.out.println(stringManipulation(S));
	 }
}
