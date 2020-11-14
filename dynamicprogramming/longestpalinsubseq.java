package dynamicprogramming;

import java.util.*;

public class longestpalinsubseq {

	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner scn = new Scanner(System.in);
            String str = scn.next();
            lps(str);
    }
	 
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a string
	 // It should print the required output

    public static void lps(String str){
	 	 // Write your code here
    	int[][] dp = new int[str.length()][str.length()];
    	for(int i=0;i<dp.length;i++) {
    		dp[i][i]=1;
    	}
    	for(int i=1;i<dp.length;i++) {
    		int row =0;
    		int col=i;
    		while(row<dp.length && col<dp[0].length) {
    			char c1 = str.charAt(row);
    			char c2 = str.charAt(col);
    			if(c1==c2) {
    				dp[row][col]=dp[row+1][col-1]+2;
    			}
    			else {
    				int n1 = dp[row][col-1];
    				int n2 = dp[row+1][col];
    				dp[row][col]=Math.max(n1, n2);
    			}
    			row++;
    			col++;
    		}
    	}
    	System.out.println(dp[0][dp.length-1]);
	 }
}
