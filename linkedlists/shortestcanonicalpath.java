package linkedlists;

import java.util.*;
class shortestcanonicalpath {
    public static String absoluteCanonicalPath(String s) {
	 // Write your code here
    	Stack<Character> st = new Stack<>();
    	for(int i=0;i<s.length();i++) {
    		if(st.isEmpty()) {
    			st.push(s.charAt(i));
    			continue;
    		}
    		else if(s.charAt(i)=='/') {
    			if(!st.empty() && st.peek()=='/') {
    				continue;
    			}
    			else {
    				st.push(s.charAt(i));
    			}
    		}
    		else if(s.charAt(i)=='.') {
    			if(s.charAt(i-1)=='.') {
    				continue;
    			}
    			if(i+1<s.length() && s.charAt(i+1)=='.') {
    				if(st.size()>1 && st.peek()=='/') {
    					st.pop();
    				}
    					while(!st.empty() && st.peek()!='/') {
    						st.pop();
    					}
    				
    			}
    			else {
    				continue;
    			}
    		}
    		else {
    			st.push(s.charAt(i));
    		}
    	}
    	if(!st.empty() && st.size()>1 && st.peek()=='/') {
    		while(st.size()>1 && st.peek()=='/') {
				st.pop();
			}
    	}
    	String ans = "";
    	while(!st.empty()) {
    		ans=st.pop()+ans;
    	}
    	return ans;
    }



 // Dont make changes here   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String path=sc.next();
        System.out.print(absoluteCanonicalPath(path));
    }
}
