package arraysandstrings;

import java.util.Scanner;

public class plusone {
	 public static int[] plusOne(int[] digits) {
	 //Write your code here	 
		 int carry = 1;
 	 	 if (digits[digits.length - 1] + carry < 10) {
 	 	 	 digits[digits.length - 1]++;
 	 	 	 carry = 0;
 
 	 	 } else {
 	 	 	 for (int i = digits.length - 1; i >= 0; i--) {
 	 	 	 	 if (digits[i] + carry == 10) {
 	 	 	 	 	 digits[i] = 0;
 	 	 	 	 	 carry = 1;
 	 	 	 	 } else if (carry == 1) {
 	 	 	 	 	 digits[i]++;
 	 	 	 	 	 carry = 0;
 	 	 	 	 }
 
 	 	 	 }
 	 	 }
 	 	 if (carry == 1) {
 	 	 	 int[] ans = new int[digits.length + 1];
 	 	 	 ans[0] = carry;
 	 	 	 for (int i = 1; i < ans.length; i++) {
 	 	 	 	 ans[i] = digits[i - 1];
 
 	 	 	 }
 	 	 	 return ans;
 
 	 	 }
 
 	 	 return digits;
		 
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n=scn.nextInt();
	 	 int[] Input=new int[n];
	 	 for(int i=0;i<Input.length;i++){
	 	 Input[i]=scn.nextInt();
	 	 }
	 	 int ans[] = plusOne(Input);
	 	 for (int i : ans) {
	 	 	 System.out.print(i + " ");
	 	 }

	 }

}