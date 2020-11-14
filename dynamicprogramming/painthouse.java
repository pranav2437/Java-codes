package dynamicprogramming;
/*
 * 1. You are given N houses, each house can be painted with 3 different colours: red, blue or green
2. Cost of painting each house a certain color is different and is given as an N x 3 matrix to you
3. You need to find the minimum amount spent on painting all the houses such that no 2 adjacent
 houses have the same colour
 */



import java.util.*;

public class painthouse {

	  public static void main(String[] args) {
	  	  // TODO Auto-generated method stub
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[][] costs= new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                costs[i][j]=scn.nextInt();
            }
        }
         System.out.println(minCost(costs));
	  }
	  // -----------------------------------------------------
	  // This is a functional problem. Only this function has to be written.
	  // This function takes as input 2D array
	  // It should return the required output

	  public static int minCost(int[][] costs) {
	  	  //Write your code here
		  int[][] dp = new int[costs.length][costs[0].length];
		  for(int i=0;i<dp[0].length;i++) {
			  dp[0][i]=costs[0][i];
		  }
		  for(int i=1;i<dp.length;i++) {
			  for(int j=0;j<dp[0].length;j++) {
				  int n1=0;
				  int n2=0;
				  if(j==1) {
					  n1 = dp[i-1][j-1];
					  n2 = dp[i-1][j+1]; 
				  }
				  else if(j==0) {
					  n1 = dp[i-1][j+2];
					  n2 = dp[i-1][j+1];
				  }
				  else {
					  n1 = dp[i-1][j-1];
					  n2 = dp[i-1][j-2];
				  }
				  int min = Math.min(n1, n2);
				  dp[i][j]=min+costs[i][j];				  
			  }
		  }
		  int min = Integer.MAX_VALUE;
		  for(int i=0;i<dp[0].length;i++) {
			  if(dp[dp.length-1][i]<min) {
				  min=dp[dp.length-1][i];
			  }
		  }
		  return min;
	  }
}
