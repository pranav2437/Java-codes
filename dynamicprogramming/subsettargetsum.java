package dynamicprogramming;

import java.util.*;

public class subsettargetsum {

	public static boolean subsetsum(int[] arr,int target) {
		boolean[][] dp = new boolean[arr.length+1][target+1];
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
		return dp[arr.length][target];	
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(subsetsum(arr,target));
	}
}

