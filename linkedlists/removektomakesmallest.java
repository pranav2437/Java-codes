package linkedlists;

import java.util.Scanner;
import java.util.Stack;

public class removektomakesmallest {
	public static String remove(String s,int k) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(st.isEmpty()) {
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)>st.peek()) {
				st.push(s.charAt(i));
			}
			else {
				while(!st.isEmpty() && s.charAt(i)<st.peek() && k>0) {
					st.pop();
					k--;
				}
				st.push(s.charAt(i));
			}
		}
		if(k>0) {
			while(k>0) {
				st.pop();
				k--;
			}
		}
		String ans="";
		while(!st.empty()){
			ans=st.pop()+ans;
		}
		int zero=0;
		for(int i=0;i<ans.length();i++) {
			if(ans.charAt(i)=='0') {
				zero++;
			}
			else 
				break;
		}
		
		return ans.substring(zero);
			
		
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 	 
	 	 String s = sc.next();
	 	 int k = sc.nextInt();
	 	System.out.println(remove(s,k)); 
	}
}
