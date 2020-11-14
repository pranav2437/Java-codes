package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class connectingropes {
	 public static long minCostRopes(long[] arr) {
	 // Write your code here
		 PriorityQueue<Long> q = new PriorityQueue<>();
		 long totalcost=0;
		 for(int i=0;i<arr.length;i++) {
			 q.add(arr[i]);
		 }
		 while(q.size()>1) {
			long val1=q.remove();
			long val2 = q.remove();
			totalcost += val1+val2;
			q.add(val1+val2);			 
		 }
		 return totalcost;
		 
	 }





	 // Dont make changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 	 int n = scn.nextInt();
	 	 	 long arr[] = new long[n];
	 	 	 for (int i = 0; i < n; i++) 
	 	 	 	 arr[i] = scn.nextLong();
	 	 	 System.out.println(minCostRopes(arr));
	 	 
	 }
}
