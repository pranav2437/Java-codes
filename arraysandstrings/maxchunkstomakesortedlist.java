package arraysandstrings;

import java.util.*;
/*
 * 1. You will be given an Array
2. Algorithim is to break it into chunks and sort them separately, and then combine these chunks to receive a sorted array
3. You need to return the maximum possible chunks for a given array
 */

public class maxchunkstomakesortedlist {
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int[] a = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 a[i] = scn.nextInt();
	 	 }
	 	 System.out.println(maxChunksToSorted(a));
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written
	 // This function takes as input an array
	 // It should return required output

	 public static int maxChunksToSorted(int[] arr) {
	 	 // Write your code here
		 int[] min = new int[arr.length];   //store min to the right for each element,inclusive of the element
		 int[] max = new int[arr.length];   //store max to the left for each element,exclusive of the element
		 
		 min[arr.length-1] = arr[arr.length-1];
		 int v = arr[arr.length-1];
		 for(int i=arr.length-2;i>=0;i--) {
			 if(v>arr[i]) {
				 v=arr[i];				 
			 }
			 min[i] = v;
		 }
		 
		 max[0]=Integer.MIN_VALUE;
		 int val =arr[0];
		 for(int i=1;i<arr.length;i++) {
			 max[i]=val;
			 if(arr[i]>val) {
				 val=arr[i];
			 }
		 }
		
		 int count=0;
		 for(int i=0;i<arr.length;i++) {
			 if(max[i]<=min[i]) {     //concatenation can lead to sorted array only if max of left
				 count++;             //part is smaller than min on right, = because we need to give max possible parts
			 }
		 }
		 return count;
		 
	 }
}
