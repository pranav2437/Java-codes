package hashmap_heaps;

import java.util.*;
import java.io.*;

public class gapbwhfndlf {

	 public static void findDifference(int[] arr) {
	 //Write your code here	
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<arr.length;i++) {
			 if(!map.containsKey(arr[i])) {
				 map.put(arr[i],1);
			 }
			 else {
				 map.put(arr[i],map.get(arr[i])+1);
			 }
		 }
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
		 for(int k:map.keySet()) {
			 if(map.get(k)<min) {
				 min=map.get(k);
			 }
			 if(map.get(k)>max) {
				 max=map.get(k);
			 }
		 }
		 System.out.println(max-min);
	 }
	 
	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = scn.nextInt();
	 	 }
	 	 findDifference(num);
	 }
}
