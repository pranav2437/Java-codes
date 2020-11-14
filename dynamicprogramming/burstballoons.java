package dynamicprogramming;

/*
 * 1. There are n balloons and each balloon has a number on it given as an array
2. You need to burst all balloons
3. When you burst a balloon balloon i you will get nums[left] * nums[i] * nums[right] coins
4. After bursting left and right elements will be adjacent
5. Burst balloons in a way that coins collected is maximised
*/

import java.util.*;
public class burstballoons {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=scn.nextInt();
        System.out.println(maxCoins(nums));
    }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array
	 // It should return the required output
    
    public static int maxCoins(int[] nums) {	 
	 	 //Write your code here
    	int[] arr = new int[nums.length+2];
    	arr[0]=1;
    	arr[arr.length-1]=1;
    	for(int i=1;i<=nums.length;i++) {
    		arr[i]=nums[i-1];
    	}
    	
    	int[][] dp = new int[arr.length][arr.length];
    	for(int i=2;i<dp.length;i++) {
    		int row = 0;
    		int col=i;
    		while(col<dp[0].length && row<dp.length) {
    			int start = row ;
    			int end = col;
    			int currcol = start+1;
    			int currrow = row+1;
    			int max = Integer.MIN_VALUE;
    			while(currcol<end) {
    				
    				int selfscore = arr[currcol]*arr[start]*arr[end];
    				int leftscore = dp[row][currcol];
    				int rightscore = dp[currrow][col];
    				int total = selfscore + leftscore + rightscore;
    				max=Math.max(max, total);
    				currcol++;
    				currrow++;
    			}
    			dp[row][col]=max;
    			row++;
    			col++;    			
    		}
    	}
    	
    	return dp[0][dp[0].length-1];
	 }
}
