package dynamicprogramming;
/*
 * 1. You will be given an Integer
2. You need to return minimum number of operations required to reach N from 0, where operation means:
a) Double the number
b) Add one to number
 */

import java.util.*;

public class minoperations {

	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            minOperations(n);
    }
    	 
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an integer
	 // It should print the required output

    static void minOperations(int n){
	 	 // Write your code here
    	int[] dp = new int[n+1];
    	dp[0]=0;
    	dp[1]=1;    	
    	for(int i=2;i<=n;i++) {
    		int n1 = dp[i-1];
    		int n2 = Integer.MAX_VALUE;
    		if((i/2)%2==0) {
    			n2 = dp[i/2];
    		}
    		dp[i]=Math.min(n1, n2) +1;
    	}
    	System.out.println(dp[n]);
	 }
}
