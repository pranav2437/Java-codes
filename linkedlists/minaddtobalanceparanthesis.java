package linkedlists;

import java.util.*;

public class minaddtobalanceparanthesis {

    public static int minAddToMakeValid(String S) {
        //Write your code here
    	Stack<Character> st = new Stack<>();
    	for(int i=0;i<S.length();i++) {
    		char c= S.charAt(i);
    		if(st.isEmpty()) {
    			st.push(c);
    			continue;
    		}
    		if(c==')') {
    			if(st.peek()=='(') {
    				st.pop();
    			}
    			else {
    				st.push(c);
    			}
    		}
    		else {
    			st.push(c);
    		}
    	}
    	return st.size();
    }

    // Dont make changes here
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(minAddToMakeValid(s));
    }

}
