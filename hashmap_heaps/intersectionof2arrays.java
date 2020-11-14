package hashmap_heaps;

import java.lang.*;
import java.io.*;
import java.util.*;

class intersectionof2arrays
 {
	 public static void main (String[] args) throws IOException
	  {
	 	     Scanner scn= new Scanner(System.in);
	 	     int n = scn.nextInt();
	 	 	 int[] num = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	 num[i] = scn.nextInt();
	 	 	 }
	 	 	 int m = scn.nextInt();
	 	 	 int[] num2 = new int[m];
	 	 	 for (int i = 0; i < m; i++) {
	 	 	 	 num2[i] = scn.nextInt();
	 	 	 }
	 	 	 
	 	 	     solve(n,m,num,num2);
	  }
	  // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input two arrays and their lengths 
	 // Print required output
	  public static void solve(int m,int n,int[] arr1,int[] arr2){
	      //Write your code here
		  int count=0;
		  HashMap<Integer,Integer> map = new HashMap<>();
		  for(int i=0;i<arr1.length;i++) {
			  if(!map.containsKey(arr1[i])) {
				  map.put(arr1[i],1);
			  }
			  else {
				  map.put(arr1[i], map.get(arr1[i])+1);
			  }
		  }
		  for(int i=0;i<arr2.length;i++) {
			  if(map.containsKey(arr2[i])) {
				  count++;
				  System.out.println(arr2[i] + " " + map.get(arr2[i]));
				  map.put(arr2[i], map.get(arr2[i])-1);
				  if(map.get(arr2[i])==0) {
					  map.remove(arr2[i]);
				  }
			  }
			  else {
				  continue;
			  }
		  }
		  System.out.println(count);
	     
	  }
	  
	  
}
