package dynamicprogramming;
import java.util.*;
//Given an array, value at ith index gives max jump size. Starting from 0th index u need to reach end 
// of array in minimum jumps. Return the minimum jumps.

public class minjumpsarray {

	public static int minjumps(int[] arr) {
		int[] dp = new int[arr.length];
		dp[arr.length-1]=0;
		for(int i=arr.length-2;i>=0;i--) {
			int range = arr[i];
			if(arr[i]==0) {
				dp[i]=arr.length;
			}
			else if(arr[i]>=arr.length-i-1) {
				dp[i]=1;
			}
			else {
				int val=Integer.MAX_VALUE;
				for(int j=i+1;j<arr.length && j<=i+range;j++) {
					if(val>dp[j]) {
						val=dp[j];
					}
				}
				if(val!=Integer.MAX_VALUE) {
					val+=1;				
				}
				dp[i]=val;
			}
			
		}
		return dp[0];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(minjumps(arr));
	}
}
