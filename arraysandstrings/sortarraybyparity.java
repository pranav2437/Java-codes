package arraysandstrings;

import java.util.*;
/*
 * 1. You are given an integer array of non-negative integers of length N.
2. You have to modify the array such that all the even elements of the array are before all the odd elements of the array.
3. For example, 
Input: [3,1,2,4]
Output: [2,4,1,3]
The outputs [4,2,3,1], [2,4,3,1], and [4,2,1,3] would also be accepted.
 */

public class sortarraybyparity {

	 // This is a functional problem. You have to complete this function.
	 // It takes as input an integer array. It should return
	 // the required array.
	 public static int[] sortArrayByParity(int[] a) {
	 	 // write your code here.
		 
		 int i=0;
		 int j=0;
		 while(i<a.length && j<a.length) {
			 if(a[j]%2==1) {
				 j++;
			 }
			 else {
				 int t=a[j];
				 a[j]=a[i];
				 a[i]=t;
				 i++;
				 j++;
			 }
		 }
		 return a;

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

	 	 int[] result = sortArrayByParity(arr);
	 	 int[] sortedResult = sortResultEvenOdd(result);
	 	 display(sortedResult);

	 }

	 // utility function, don't change the code of it.
	 private static int[] sortResultEvenOdd(int[] arr) {
	 	 int i = 0;

	 	 while (i < arr.length) {
	 	 	 if (arr[i] % 2 != 0) {
	 	 	 	 Arrays.sort(arr, 0, i);
	 	 	 	 Arrays.sort(arr, i, arr.length);
	 	 	 	 return arr;
	 	 	 }
	 	 	 i++;
	 	 }

	 	 Arrays.sort(arr);
	 	 return arr;

	 }

	 // function to display an array.
	 public static void display(int[] arr) {

	 	 for (int i = 0; i < arr.length; i++) {
	 	 	 System.out.print(arr[i] + " ");
	 	 }

	 	 System.out.println();
	 }

}
