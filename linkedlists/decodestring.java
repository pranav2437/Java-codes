package linkedlists;
import java.util.*;
class Main {
	 
	 public static String decode(String s) {
	 //Write your code here
		 Stack<String> st = new Stack<>();
		 for(int i =0;i<s.length();i++) {
			 if(s.charAt(i)=='[') {
				 String str = "";
				 while(!(st.isEmpty() || st.peek().equals("]"))) {
					 str=str+st.pop();
				 }
				 if(st.peek().equals("]")) {
					 st.pop();
				 }
				 st.push(str);
			 }
			 else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				 String str1 = st.pop();
				 String add = "";
				 for(int k=0;k<str1.length();k++) {
					 add += str1.charAt(k);
				 }
						 
				 int val = s.charAt(i) - '0';
				 for(int j=0;j<val;j++) {
					 str1 += add;
				 }
				 st.push(str1);
			 }
			 else {
				 st.push(Character.toString(s.charAt(i)));
			 }
			 
		 }
		 return st.peek();
	 }
	 
	 
	 //Dont make any changes here
	 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 String s=sc.next();
	 System.out.println(decode(s));
	 }
	 
	 }
