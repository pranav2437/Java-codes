package dynamicprogramming;
/*
 * Partition the array in such a way such that the individual sum of 2 subsets formed have min absolute diff
 * between them. Return the minimum absolute difference.
 */
import java.util.*;

public class mindiffpartitionarray {

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 	 int n = scn.nextInt();
	 	 	 int a[] = new int[n];
	 	 	 for (int i = 0; i < n; i++)
	 	 	 	 a[i] = scn.nextInt();
	 	 	 System.out.println(findMinSumPartition(a, n));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array alongwith its length
	 // It should return the required output

	 static int findMinSumPartition(int arr[], int n) {
	 	 // Write your code here
		 int sum =0 ;
		 for(int i=0;i<n;i++) {
			 sum+=arr[i];
		 }
		 int tar = sum/2;
		 boolean[][] dp = new boolean[arr.length+1][tar+1];
		 for(int i=0;i<dp.length;i++) {
			 dp[i][0]=true;
		 }
		 for(int i=1;i<dp[0].length;i++) {
			 dp[0][i]=false;
		 }
		 for(int i=1;i<dp.length;i++) {
			 for(int j=1;j<dp[0].length;j++) {
				 if(dp[i-1][j]==true) {
					 dp[i][j]=true;
				 }
				 else if(j-arr[i-1]>=0 && dp[i-1][j-arr[i-1]]==true) {
					 dp[i][j]=true;
				 }
				 else {
					 dp[i][j]=false;
				 }
			 }
		 }
		 int ans =0;
		 for(int i=dp[0].length-1;i>=0;i--) {
			 if(dp[dp.length-1][i]==true) {
				 break;
			 }
			 else {
				 ans+=2;
			 }
		 }
		 if(sum%2==0) {
			 return ans;
		 }
		 return ans+1;
	 }
}