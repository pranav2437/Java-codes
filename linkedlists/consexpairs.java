package linkedlists;


import java.util.Scanner;
import java.util.*;
//User function Template for Java
// your task is to complete the function
// function should return true/false or 1/0
class consexpairs {
	 public static boolean pairWiseConsecutive(Stack<Integer> st,int n) {
	 // Write your code here
	 if(n%2!=0){
	     st.pop();
	 }
	 while(!st.empty()) {
		 int a = st.pop();
		 int b = st.pop();
		 if( a-b == 1 || a-b==-1 ) {
			 continue;
		 }
		 else
			 return false;
	 }
	 return true;
	 
	 }





	 // Dont make changes here
	 public static void main(String[] args){
	 	 Scanner sc=new Scanner(System.in);
	 	 int n=sc.nextInt();
	 	 Stack<Integer>st=new Stack<>();
	 	 for(int i=0;i<n;i++){
	 	 	 st.push(sc.nextInt());
	 	 }
	 	 System.out.println(pairWiseConsecutive(st,n));
	 	 	 
	 }
}
