package hashmap_heaps;

import java.util.*;
import java.io.*;

public class subarraysumdivbyk {

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.

	 public static int subarraysDivByK(int[] a, int k) {
	 	 
	 	 //write your code here
		 int count=0;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 map.put(0, 1);
		 int psum=0;
		 int n=a.length;
		 for(int i=0;i<n;i++) {
			 psum+=a[i];
			 int comp=0;
			 if(psum>=0) {
				 comp=psum%k;
			 }
			 else {
				 if(psum%k!=0) {
					 comp=(psum%k)+k;
				 }
				 else {
					 comp=0;
				 }
				 
			 }
			 
			 if(map.containsKey(comp)) {
        		 count+=map.get(comp);
        	 }
        	 
			 if(!map.containsKey(comp)) {
				 map.put(comp, 1);
				 continue;
			 }
			 else {				 
				 map.put(comp, map.get(comp)+1);
			 }
			 
		 }
		 return count;
	 	 
	 }

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int k = scn.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int z = 0; z < n; z++) {
	 	 	 arr[z] = scn.nextInt();
	 	 }
	 	 System.out.println(subarraysDivByK(arr, k));
	 }
}
