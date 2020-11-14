package hashmap_heaps;

import java.util.*;
import java.lang.*;
import java.io.*;
class uniqueelement
 {
	 public static void main (String[] args)
	  {
	     Scanner scn = new Scanner(System.in);
	 	 int t = scn.nextInt();
	 	 while (t-- > 0) {
	 	 	 int n = scn.nextInt();
	 	 	 int k=scn.nextInt();
	 	 	 int[] num = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	     num[i]= scn.nextInt();
	 	 	 }
	 	 	 solve(num,k);
	 	 }
	  }
	  
    // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and n length of array.
	 // It should return a boolean value.
	  public static void solve(int [] arr,int k){
	     //Write your code here
		  HashMap<Integer,Integer> map = new HashMap<>();
		  int ans=0;
		  for(int i=0;i<arr.length;i++) {
			  if(!map.containsKey(arr[i])) {
				  map.put(arr[i], 1);
			  }
			  else {
				  map.put(arr[i], map.get(arr[i])+1);
			  }
		  }
		  for(int i=0;i<arr.length;i++) {
			  if(map.get(arr[i])<k) {
				  ans=arr[i];
				  break;
			  }
		  }
		  System.out.println(ans);
	  }
}
