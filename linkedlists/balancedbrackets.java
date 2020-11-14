package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class balancedbrackets {
    public static void isbal(String s){
    // Write your code here
    	Stack<Character> st = new Stack<>();
    	boolean flag=true;
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(st.isEmpty()) {
    			st.push(c);
    			continue;
    		}
    		if(c=='(' || c=='{' || c== '[') {
    			st.push(c);
    		}
    		else if(c==')' && st.peek()!='(') {
    			flag=false;
    			break;
    		}
    		else if(c==']' && st.peek()!='[') {
    			flag=false;
    			break;
    		}
    		else if(c=='}' && st.peek()!='{') {
    			flag=false;
    			break;
    		}
    		else {
    			if(!st.empty()) {
    				st.pop();
    			}
    			else {
    				flag = false;
    				break;
    			}
    		}
    				
    	}
    	if(!st.empty()) {
    		flag= false;
    	}
    	if(flag) {
    		System.out.println("balanced");
    	}
    	else {
    		System.out.println("not balanced");
    	}
    	
    }
	 








	 //Dont make changes here
	 public static void main (String[] args) {
	 	 Scanner scn=new Scanner(System.in);
	  	 String s=scn.next();
	  	 isbal(s);
	 
	 }
}
