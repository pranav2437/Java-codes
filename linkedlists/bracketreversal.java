package linkedlists;

import java.util.Scanner;
import java.util.*;
 class bracketreversal {

	public static int  minreversals(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{') {
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)=='}') {
				
				if(!st.empty() &&st.peek()=='{') {
					st.pop();
				}
				else {
					st.push(s.charAt(i));
				}
			}
		}
		int ncl =0;
		int nop=0;
		int min =0;
		while(!st.empty()) {
			if(st.pop()=='{') {
				ncl++;
			}
			else {
				nop++;
			}
		}
		if(ncl%2==0) {
			min = (ncl)/2 + (nop)/2;
		}
		else {
			min=(ncl)/2 + (nop)/2 +2;
		}
		return min;
		
	}
	
	
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
        String s=scn.next();
        int res =minreversals(s);
        System.out.println(res);
	}
}
