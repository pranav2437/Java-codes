package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class longparanthesis {
    public static int longestParenthesis(String s){
    // Write your code here
    	Stack<Integer> st = new Stack<>();
    	st.push(-1);
    	int res =0;
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		if(c=='(') {
    			st.push(i);
    			continue;
    		}
    		int top = st.peek();
    		char topchar = c;
    		if(top!=-1) {
    			topchar = s.charAt(top);
    		}
    		if(topchar==')') {
    			st.push(i);
    			continue;
    		}
    		st.pop();
    		int nexttop = st.peek();
    		char next = ')';
    		if(nexttop!=-1) {
    			next=s.charAt(st.peek());
    		}
    		int val = i-nexttop ;
    		if(val>res) {
    			res = val;
    		}
    	}
    	return res;
    }








	  // Dont make changes here
	  public static void main (String[] args) {
	      	  Scanner scn=new Scanner(System.in);

	          String s=scn.next();
	          System.out.println(longestParenthesis(s));

	      
	  }
}
