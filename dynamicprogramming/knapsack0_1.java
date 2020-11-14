package dynamicprogramming;
import java.util.*;

//given a bag of capacity c, and items with their weights and profits. add items to the bag so as to 
//maximize the profit and within the capacity of the bag.

public class knapsack0_1 {

	
	
	public static void printknapsack(int[][] dp,int i,int j,int[] wts,int[] profits,String psf) {
		//reverse engineering from our maxprofit
		
		if(i==0 || j==0) {
			System.out.println(psf);
		}
		else {
			if(dp[i][j]==dp[i-1][j]) {        //not included ith item
				printknapsack(dp,i-1,j,wts,profits,psf);
			}
			else if(j>=wts[i-1] && dp[i][j]==dp[i-1][j-wts[i-1]]+profits[i-1]) {    //included ith item
				printknapsack(dp,i-1,j-wts[i-1],wts,profits,psf+profits[i-1]+"->");
			}
		}
		
		
		
	}
	public static int maxprofit(int[] w,int[] p,int c) {
		int[][] dp = new int[w.length+1][c+1];
		for(int i=0;i<dp.length;i++) {
			dp[i][0]=0;
		}
		for(int j=0;j<dp[0].length;j++) {
			dp[0][j]=0;
		}
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				int val1 = dp[i-1][j];
				int val2 = Integer.MIN_VALUE;
				if(j-w[i-1]>=0) {
					val2=dp[i-1][j-w[i-1]];
				}
				val2+=p[i-1];
				dp[i][j]=Math.max(val1, val2);
			}
		}
		int ans= dp[dp.length-1][dp[0].length-1];
		printknapsack(dp,dp.length-1,dp[0].length-1,w,p,"");
		return ans;
			
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] weights = new int[n];
		int[] profits = new int[n];
		for(int i=0;i<n;i++) {
			weights[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			profits[i]=sc.nextInt();
		}
		int capacity = sc.nextInt();
		System.out.println(maxprofit(weights,profits,capacity));
	}
}
