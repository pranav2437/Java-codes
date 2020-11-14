package arraysandstrings;

import java.util.*;
/*
 *1. You are given an integer array of length N.
2. You have to find the length of one shortest continuous subarray, such that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.
3. For example, 
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order. 
 */

public class shortestandunsortedsubarray {

	 // This is a functional problem. You have to complete this function.
	 // It takes as input an integer array. It should return
	 // the length of the shortest continuous subarray.
	 public static int findUnsortedSubarray(int[] arr) {
	 	 // write your code here.
		 int[] min = new int[arr.length];   //store min to the right for each element,inclusive of the element
		 int[] max = new int[arr.length];   //store max to the left for each element,inclusive of the element
		 
		 min[arr.length-1] = arr[arr.length-1];
		 int v = arr[arr.length-1];
		 for(int i=arr.length-2;i>=0;i--) {
			 if(v>arr[i]) {
				 v=arr[i];				 
			 }
			 min[i] = v;
		 }
		 
		 max[0]=arr[0];
		 int val =arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]>val) {
				 val=arr[i];
			 }
			 max[i]=val;
			 
		 }
		 int start=0;
		 int end=0;
		 for(int i=0;i<arr.length;i++) {         //first and last mismatch will give length of req subarray
			 if(min[i]!=max[i]) {
				 start=i;
				 break;
			 }
		 }
		 for(int i=arr.length-1;i>=0;i--) {
			 if(min[i]!=max[i]) {
				 end=i;
				 break;
			 }
		 }
		 
		 return end-start+1;

	 }

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 // Input for length of array.
	 	 int length = sc.nextInt();

	 	 int[] arr = new int[length];

	 	 // Input for elements of array.
	 	 for (int i = 0; i < arr.length; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }

	 	 System.out.println(findUnsortedSubarray(arr));

	 }

	 // function to display an array.
	 public static void display(int[] arr) {

	 	 for (int i = 0; i < arr.length; i++) {
	 	 	 System.out.print(arr[i] + " ");
	 	 }

	 	 System.out.println();
	 }

}
