package hashmap_heaps;

import java.util.*;
import java.io.*;

public class longestsubarraytargetsum {
	 
	 public static void print(int n, int[] arr, int k) {
	 //Write your code here	 
		 HashMap<Integer,Integer> map = new HashMap<>();
		 int length=0;
		 int psum=0;
		 map.put(0, -1);
		 for(int i=0;i<n;i++) {
			 psum+=arr[i];
			 if(!map.containsKey(psum)) {
				 map.put(psum, i);
			 }
			 int comp = psum-k;
			 if(map.containsKey(comp)) {
				 int val = i-map.get(comp);
				 if(val>length) {
					 length=val;
				 }
			 }
		 }
		 System.out.println(length);
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 int k = s.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = s.nextInt();
	 	 }
	 	 print(n, num, k);
	 }


}