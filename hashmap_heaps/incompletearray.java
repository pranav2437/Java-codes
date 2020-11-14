package hashmap_heaps;

import java.util.*;

public class incompletearray {

	

	 public static int incomplete(int[] arr) {
	 	 // write your code here
		 HashSet<Integer> set = new HashSet<>();
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 set.add(arr[i]);
		 }
		 return max-min+1-set.size();
		 
		
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = scn.nextInt();
	 	 }
	 	 System.out.println(incomplete(arr));
	 }
}
