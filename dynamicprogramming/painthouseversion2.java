package dynamicprogramming;

import java.util.*;
public class painthouseversion2 {

	 public static void main(String[] args) {

    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int k=scn.nextInt();
    int[][] costs = new int[n][k];
    for(int i=0;i<n;i++){
        for(int j=0;j<k;j++){
            costs[i][j]=scn.nextInt();
        }
    }
    System.out.println(minCostII(costs));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2d array
	 // It should return the required output

	 public static int minCostII(int[][] costs) {
	 	 //Write your code here
		 int[][] dp = new int[costs.length][costs[0].length];
		 int min = Integer.MAX_VALUE;
		 int minidx =0;
		 int smin = Integer.MAX_VALUE;
		 for(int i=0;i<dp[0].length;i++) {
			  dp[0][i]=costs[0][i];
			  if(costs[0][i]<min) {
				  smin = min;
				  min=costs[0][i];
				  minidx=i;
			  }
			  else if(costs[0][i]<smin && costs[0][i]>=min) {
				  smin=costs[0][i];
			  }
		  }
		 for(int i=1;i<dp.length;i++) {
			 int min2 =Integer.MAX_VALUE;
			 int smin2 =Integer.MAX_VALUE;
			 int minidx2=0;
			 for(int j=0;j<dp[0].length;j++) {
				 if(j!=minidx) {
					 dp[i][j]=min+costs[i][j];
				 }
				 else {
					 dp[i][j]=smin+costs[i][j];
				 }
				 if(dp[i][j]<min2) {                       //simultaneously finding min and second min for
					 smin2 = min2;
					 min2 = dp[i][j];                      //current row
					 minidx2 = j;
				 }
				 else if(dp[i][j]<smin2 && dp[i][j]>=min2) {
					 smin2 = dp[i][j];
				 }
			 }
			 min = min2;                                  //setting these values for next row's iteration
			 smin=smin2;
			 minidx = minidx2;			 
		 }
		 System.out.println();
		 for(int i=0;i<dp.length;i++) {
			 for(int j=0;j<dp[0].length;j++) {
				 System.out.print(dp[i][j]+" ");
			 }
			 System.out.println();
		 }
		 int ans = Integer.MAX_VALUE;
		  for(int i=0;i<dp[0].length;i++) {
			  if(dp[dp.length-1][i]<ans) {
				  ans=dp[dp.length-1][i];
			  }
		  }
		  return ans;
	 }
}
