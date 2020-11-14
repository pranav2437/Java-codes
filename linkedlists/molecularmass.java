package linkedlists;

import java.io.*;
import java.util.*;

public class molecularmass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Stack<Character> st = new Stack<>();
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	char[] arr = s.toCharArray();
    	int mass=0;
    	for(int i=0;i<arr.length;i++) {
    		
    		
    		if(Character.isDigit(arr[i])) {
    			if(st.peek()!=')') {
    				char c=st.pop();
    				if(c=='C') {
    					char val = (char)(Character.getNumericValue(arr[i])*12);
    					st.push(val);
    				}
    				else if(c=='O') {
    					char val = (char)(Character.getNumericValue(arr[i])*16);
    					st.push(val);
    				}
    				else if(c=='H') {
    					char val = (char)(Character.getNumericValue(arr[i])*1);
    					st.push(val);
    				}
    			}
    			else {
    				int val=0;
    				st.pop();
    				while(!st.isEmpty() && st.peek()=='(') {
    					char c = st.peek();
    					if(c=='C') {
        					 val += (Character.getNumericValue(arr[i])*12);
        					
        				}
        				else if(c=='O') {
        					 val += (Character.getNumericValue(arr[i])*16);
        					
        				}
        				else if(c=='H') {
        					 val += (Character.getNumericValue(arr[i])*1);
        					
        				}
    				}
    				st.pop();
    				char ch=(char)val;
    				st.push(ch);
    			}
    		}
    		else if(Character.isLetter(arr[i])){
    			char c=arr[i];
    			if(c=='C') {
					char val = (char)12;
					st.push(val);
				}
				else if(c=='O') {
					char val = (char)16;
					st.push(val);
				}
				else if(c=='H') {
					char val = (char)1;
					st.push(val);
				}
    			
    		}
    		else {
    			st.push(arr[i]);
    		}
    	}
    	while(!st.isEmpty()) {
    		mass+=Character.getNumericValue(st.pop());
    	}
    	System.out.println(mass);
    	
    	
    	
    }
}
