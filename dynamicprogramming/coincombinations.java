package dynamicprogramming;

import java.util.Scanner;
//given an array of denominations, you need to make the target money value ..assume infinite coins for
//each denomination. Return the number of combinations of coins possible.

public class coincombinations {

	
	public static int countcombinations(int[] arr,int target) {
		int[] dp = new int[target+1];
		dp[0]=1;
		for(int i=0;i<arr.length;i++) {       //taking one denomination at a time,we put values acc to			
			int val=0;                        //to it in the complete array to prevent the permutations
			for(int j=0;j<dp.length;j++) {
				int range = arr[i];
				if(j-range>=0) {
					val = dp[j-range];
				}
				dp[j]+=val;
			}
			
		}
		return dp[dp.length-1];
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(countcombinations(arr,target));
	}
}
