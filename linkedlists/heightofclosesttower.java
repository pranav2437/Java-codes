package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class heightofclosesttower {

	 public static int heightClosestTower(int[] A){
	 // Write your code here
		 Stack<Integer> st = new Stack<>();
		 int[] res= new int[A.length];
		 res[A.length-1]=0;
		 st.push(A[A.length-1]);
		 for(int i=A.length-2;i>=0;i--) {
			 while(!st.isEmpty() && A[i]>st.peek()) {
				 st.pop();
			 }
			 if(st.empty()) {
				 res[i]=0;
			 }
			 else {
				 res[i]=st.peek();
			 }
			 st.push(A[i]);
		 }
		 int sum=0;
		 for(int i=0;i<res.length;i++) {
			 sum+=res[i];
		 }
		 return sum;
        }        
        
        
        
        
        
        
        
        
        
        
        
        // Dont make changes here
        public static void main (String[] args) {
	 
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int[] A=new int[N];
            for(int i=0;i<N;i++)A[i]=sc.nextInt();
            System.out.println(heightClosestTower(A));
	 
        }	 
	 
}
