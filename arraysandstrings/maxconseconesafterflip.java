package arraysandstrings;

import java.util.*;

public class maxconseconesafterflip {

	 // This is a functional problem. You have to complete this function.
	 // It takes as input a binary array. It should return the maximum number
	 // of consecutive 1s in this array if you can flip at most one 0.
	 public static int findMaxConsecutiveOnes(int[] nums) {
	 	 // write your code here.
		 int zeros =0;
		 int length=0;
		 int end=1;
		 int start=0;
		 if(nums[0]==0) {
			 zeros=1;
		 }
		 boolean valid = true;
		 while(end<=nums.length) {
			 if(valid) {
				 if(end==nums.length) {
					 break;
				 }
				 int val = nums[end];
				 if(val==0) {
					 zeros++;
				 }
				 end++;
				 if(zeros<2) {
					 int n =end-start;
					 if(n>length) {
						 length=n;
					 }
				 }
				 else {
					 valid=false;
				 }
			 }
			 else {
				 int val = nums[start];
				 start++;
				 if(val==0) {
					 zeros--;
				 }
				 if(zeros<2) {
					 valid=true;
				 }
			 }
			 
		 }
		 return length;
		

	 }

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 // Input for length of first array.
	 	 int N = sc.nextInt();

	 	 int[] arr1 = new int[N];

	 	 // Input for array1 elements.
	 	 for (int i = 0; i < arr1.length; i++) {
	 	 	 arr1[i] = sc.nextInt();
	 	 }

	 	 int result = findMaxConsecutiveOnes(arr1);

	 	 System.out.println(result);

	 }

	 // Function to display an array.
	 public static void display(int[] arr) {

	 	 for (int i = 0; i < arr.length; i++) {
	 	 	 System.out.print(arr[i] + " ");
	 	 }

	 	 System.out.println();
	 }

}
