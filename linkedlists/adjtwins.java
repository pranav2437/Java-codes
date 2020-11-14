package linkedlists;

import java.util.*;

public class adjtwins {
	 public static void removeAdjTwins(String s) {
	 // Write your code here
		 Stack<Character> st = new Stack<>();
		 for(int i=0;i<s.length();i++) {
		     
			 if(!st.empty() && s.charAt(i)==st.peek()) {
				 
					 st.pop();
			 }
			 else 
				 st.push(s.charAt(i));
		 }
		 int n = st.size() ;
		 String ans = new String() ;
		 while(!st.empty()) {
			 ans += st.pop();
		 }
		 StringBuilder res = new StringBuilder();
		 res.append(ans); 	        
	     res = res.reverse();
		 System.out.println(res);
		 
		 
	 }











	 //Dont make changes here
	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner sc=new Scanner(System.in);
	 	 String s = sc.next();
	 	 removeAdjTwins(s);
	 }

}
