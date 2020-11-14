package linkedlists;

import java.util.*;
import java.io.*;
public class asteroids {
	  public static int[] asteroidCollision(int[] asteroids) {
	 // Write your code    
		  Stack<Integer> st = new Stack<>();
		  
		  for(int i=0;i<asteroids.length;i++) {
			  if(asteroids[i]<0) {
				  if(st.isEmpty() || st.peek()<0) {
					  st.push(asteroids[i]);
				  }
				  else if(st.peek()>0) {
					  int val = -1*asteroids[i];
					  if(val>st.peek()) {
						  st.pop();
						  st.push(asteroids[i]);
					  }
				  }
				  
			  }
			  else {
				  st.push(asteroids[i]);
			  }
		  }
		  int res[] = new int[st.size()];
		  int ctr = st.size()-1;
		  while(!st.isEmpty() && ctr >-1) {
			  res[ctr] = st.pop();
			  ctr--;
		  }
		  return res;
	 }
	  




	 // Dont make changes 
	 public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int ast[]=new int[n];
	     for(int i=0;i<n;i++)ast[i]=sc.nextInt();
	     int res[]=asteroidCollision(ast);
	     for(int v:res){
	     	 System.out.println(v);
	     }
	 }

}
