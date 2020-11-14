package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class bracketpos {
        public static void printBracketsPos(String s){
        // Write your code here
        	int n=0;
        	Stack<Integer> st = new Stack<>();
        	
        	for(int i =0;i<s.length();i++) {
        		if(s.charAt(i)==')' || s.charAt(i)=='(') {
        			n++;
        		}
        	}
        	int[] res = new int[n];
        	int ctr=0;
        	int i=0;
        	int j=0;
        	while(i<n && j<s.length()) {
        		System.out.println("INside");
        		if(s.charAt(i)=='(') {
        			ctr++;
        			st.push(ctr);
        			res[i]=ctr;
        			i++;
        		}
        		else if(s.charAt(i)==')') {
        			res[i]=st.pop();
        			i++;
        		}
        		j++;
        	}
        	for(int k=0;k<res.length;k++) {
        		System.out.print(res[k]+" ");
        	}
	 }







	 //Dont make changes here 
	 public static void main (String[] args) {
	     Scanner scn=new Scanner(System.in);
	         String s=scn.next();
	         printBracketsPos(s);
	     
	 }
}
