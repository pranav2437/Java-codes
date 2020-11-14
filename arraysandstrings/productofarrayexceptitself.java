package arraysandstrings;

import java.util.Scanner;
/*
 * 1.Given an array nums of n integers where n > 1
2.Return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
3.You have to complete the function productExceptSelf() which should return an array.
4.Note: Please solve it without division and in O(n).
 */

public class productofarrayexceptitself {
	 public static int[] productExceptSelf(int[] nums) {
	 //Write your code here.
		 int[] pmultiple = new int[nums.length];     //O(n) space soln,store product behind and after a number
		 int[] smultiple = new int[nums.length];     //O(1) space soln is using log,which is not accurate to code
		 int prefix =1;
		 int suffix=1;
		 pmultiple[0]=prefix;
		 smultiple[nums.length-1]=suffix;
		 for(int i=1;i<nums.length;i++) {
			 prefix*=nums[i-1];
			 pmultiple[i]=prefix;
			
		 }
		 for(int i=nums.length-2;i>=0;i--) {
			 suffix*=nums[i+1];
			 smultiple[i]=suffix;
		 }
		 int[] res = new int[nums.length];
		 for(int i=0;i<res.length;i++) {
			 res[i]=smultiple[i]*pmultiple[i];
		 }
		 return res;
	 }
	 
	 //Don't make changes here.
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int Input[] = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 Input[i] = scn.nextInt();
	 	 }
	 	 int ans[] = productExceptSelf(Input);
	 	 for (int i : ans) {
	 	 	 System.out.print(i + " ");
	 	 }
	 }

}
