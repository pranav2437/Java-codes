package dynamicprogramming;

import java.util.*;
public class mincostpath {

	 public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int m2[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m2[i][j]=scn.nextInt();
            }
        }
	 	 System.out.println(maze(m2));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a 2D array
	 // It should return the required output

	 public static int maze(int[][] m) {
	 	 // Write your code here
		 int[][] dp  = new int[m.length][m[0].length];
		 dp[dp.length-1][dp[0].length-1]=m[m.length-1][m[0].length-1];
		 for(int i = dp[0].length-2;i>=0;i--) {
			 dp[dp.length-1][i]=dp[dp.length-1][i+1]+m[dp.length-1][i];
		 }
		 for(int i=dp.length-2;i>=0;i--) {
			 dp[i][dp[0].length-1]=dp[i+1][dp[0].length-1]+m[i][dp[0].length-1];
		 }
		 for(int i=dp.length-2;i>=0;i--) {
			 for(int j=dp[0].length-2;j>=0;j--) {
				 int n1 = dp[i+1][j];
				 int n2 = dp[i][j+1];
				 dp[i][j] = Math.min(n1, n2) + m[i][j];				 
			 }
		 }
		 return dp[0][0];
	 }
}
