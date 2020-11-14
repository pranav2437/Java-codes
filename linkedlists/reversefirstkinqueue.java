package linkedlists;

import java.util.*;
public class reversefirstkinqueue { 


	 // Function to reverse the first K elements 
	 // of the Queue 
	 static void reverseQueueFirstKElements(Queue<Integer>queue, int k,int n) { 
		 Stack<Integer> st = new Stack<>();
		 int t=k;
		 while(t!=0) {
			st.push(queue.remove());
			t--;
		 }
		 while(!st.isEmpty()) {
			 queue.add(st.pop());
		 }
		 int c= n-k;
		 while(c!=0) {
			 
			 int val = queue.remove();
			 
			 queue.add(val);
			 c--;
		 }
		 while(!queue.isEmpty()) {
			 System.out.print(queue.remove() + " ");
		 }
		 
		 
	 }








	 // Driver code 
	 public static void main(String args[]) {
	 	 Queue<Integer> q=new LinkedList<Integer>(); 
	 	 Scanner sc=new Scanner(System.in);
	 	 int n=sc.nextInt();
	 	 int k=sc.nextInt();
	 	 for(int i=0;i<n;i++)q.add(sc.nextInt());
	 	 reverseQueueFirstKElements(q, k,n);
	 } 
}
