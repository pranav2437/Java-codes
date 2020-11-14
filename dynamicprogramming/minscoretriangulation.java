package dynamicprogramming;

import java.util.Scanner;

public class minscoretriangulation {

	 public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
	 	 System.out.println(minScoreTriangulation(a));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array
	 // It should return the required output

	 public static int minScoreTriangulation(int[] arr) {
	 	 // Write your code here
		 int[][] dp = new int[arr.length][arr.length];
		 for(int i=2;i<arr.length;i++) {
			 int col=i;
			 int row =0;
			 while(col<arr.length) {
				 int b1 = row;
				 int b2 = col;
				 int currcol = b1+1;
				 int currrow = row+1;
				 int min = Integer.MAX_VALUE;
				 while(currcol<b2) {
					 int selfscore = arr[b1]*arr[b2]*arr[currcol];
					 int leftscore = dp[row][currcol];
					 int rightscore = dp[currrow][col];
					 int total = selfscore + rightscore +leftscore;
					 min=Math.min(min, total);
					 currrow++;
					 currcol++;
				 }
				 dp[row][col]=min;
				 row++;
				 col++;
			 }
		 }
		 return dp[0][arr.length-1];
	 }
}
