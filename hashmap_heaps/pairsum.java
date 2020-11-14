package hashmap_heaps;

import java.util.*;

public class pairsum {

	 public static void print(int[] arr1, int[] arr2, int k) {
	 //Write your code here	 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);		 
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<arr2.length;i++) {
			 if(!map.containsKey(arr2[i])) {
				 map.put(arr2[i], 1);
			 }
			 else {
				 map.put(arr2[i], arr2[i]+1);
			 }
		 }
		 for(int i=0;i<arr1.length;i++) {
			 int tar=k-arr1[i];
			 if(map.containsKey(tar)) {
				 System.out.print(arr1[i] + " " + tar);
				 
			 }
		 }
	 
	 }

	 //Don't make changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int m = scn.nextInt();
	 	 int k = scn.nextInt();
	 	 int[] num = new int[n];
	 	 int[] num2 = new int[m];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = scn.nextInt();
	 	 }

	 	 for (int i = 0; i < m; i++) {
	 	 	 num2[i] = scn.nextInt();
	 	 }
	 	 print(num, num2, k);
	 	 System.out.println();

	 }

}
