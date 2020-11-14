package linkedlists;

import java.util.*;
public class scoreofstring { 

   public static int scoreOfParentheses(String s) {
	 // Write your code here
	   Stack<Character> st = new Stack<>();
	   for(int i=0;i<s.length();i++) {
		   if(st.isEmpty()) {
			   st.push(s.charAt(i));
			   continue;
		   }
		   if(s.charAt(i)==')') {
			   if(st.peek()=='(') {
				   st.pop();
				   st.push('1');
			   }
			   else {
				   int sum=0;
				   while(!st.isEmpty() && st.peek()=='(') {
					   sum += Character.getNumericValue(st.peek())+1;
					   st.pop();
				   }
				   st.pop();
				   char c = (char)(2*sum);
				   st.push(c);
			   }
		   }
		   else {
			   st.push(s.charAt(i));
		   }
	   }
	   int res =0;
	   while(!st.isEmpty()) {
		   res+=Character.getNumericValue(st.pop());
	   }
	   return res;
    }
    
    








    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(scoreOfParentheses(s));
    }
    

}
