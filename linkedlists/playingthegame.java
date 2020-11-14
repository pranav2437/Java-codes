package linkedlists;

import java.util.*;
import java.util.Scanner;
public class playingthegame{
	  public static int calculatePoints(String[] ops) {
	 // Write your code here only
		  Stack<String> st = new Stack<>();
		  for(int i=0;i<ops.length;i++) {
			  String c =  ops[i];
			  if(c.equals("+")) {
				  int a = Integer.parseInt(st.pop());
				  int b = Integer.parseInt(st.pop());
				  int val = a+b;
				  st.push(Integer.toString(b));
				  st.push(Integer.toString(a));
				  st.push(Integer.toString(val));			  
				  
			  }
			  else if(c.equals("D")) {
				  
				  st.push(Integer.toString(2*Integer.parseInt(st.peek())));
				  
			  }
			  else if(c.equals("C")) {
				  st.pop();
				  
			  }
			  else {
				  st.push(c);
			  }	  
			  
			  
		  }
		  int count = 0;
		  while(!st.empty()) {
			  
			 String str = st.pop();
			 int i = Integer.valueOf(str);
			 count += i;
		  
		  }
		  return count;
		  
	 }



	 

	 //Dont make changes here
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String[] S=new String[n];
	 for(int i=0;i<n;i++){
	 	 S[i]=sc.next();
	 }
	 System.out.println(calculatePoints(S));
	 }

}
