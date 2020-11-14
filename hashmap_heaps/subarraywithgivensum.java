package hashmap_heaps;

import java.util.*;
import java.io.*;

public class subarraywithgivensum {

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.

	 static int subArraySum(int a[], int n, int sum) {
	 	 
	 	 // write your code here
		 int count =0;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 map.put(0, 1);
		 int psum=0;
		 for(int i=0;i<n;i++) {
			 psum+=a[i];
			 int comp=psum-sum;
			 if(map.containsKey(comp)) {
        		 count+=map.get(comp);
        	 }
        	 
			 if(!map.containsKey(psum)) {
				 map.put(psum, 1);
				 continue;
			 }
			 else {				 
				 map.put(psum, map.get(psum)+1);
			 }
			 
		 }
		 return count;
	 	 
	 }

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int sum = scn.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int z = 0; z < n; z++) {
	 	 	 arr[z] = scn.nextInt();
	 	 }
	 	 System.out.println(subArraySum(arr, n, sum));
	 }
}
