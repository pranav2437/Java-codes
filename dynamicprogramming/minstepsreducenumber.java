package dynamicprogramming;
/*
 * 1. You will be given an Integer, return minimum steps needed to minimize n following the conditions:
a) If n is divisible by 2, you can reduce n to n/2.
b) If n is divisible by 3 then, you can n to n/3.
c) Decrement n by 1.
You need to reach 1
 */
import java.util.*;

public class minstepsreducenumber {

	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner scn = new Scanner(System.in);
	 	 	 int n = scn.nextInt();
	 	 	 System.out.println(count_min(n));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an integer
	 // It should return the required output
	 public static int count_min(int n) {
	 	 // Write your code here
		 int dp[] = new int[n+1];
		 dp[0]=0;
		 dp[1]=0;
		 for(int i=2;i<=n;i++) {
			 int n1 = dp[i-1];
			 int n2 = Integer.MAX_VALUE;
			 int n3 = Integer.MAX_VALUE;
			 if(i%2==0) {
				 n2 = dp[i/2];
			 }
			 if(i%3==0) {
				 n3 = dp[i/3];
			 }
			 dp[i]=Math.min(n1, Math.min(n2, n3))+1;
		 }
		 return dp[n];
	 }
}