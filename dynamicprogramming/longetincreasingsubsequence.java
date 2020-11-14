package dynamicprogramming;
import java.util.*;

//return the length of the longest increasing SUBSEQUENCE in an array.

public class longetincreasingsubsequence {

	
	public static int lis(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0]=1;
		for(int i=1;i<arr.length;i++) {			
			int max=Integer.MIN_VALUE;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					max=Math.max(dp[j], max);
				}
			}
			if(max==Integer.MIN_VALUE) {
				dp[i]=1;
			}
			else {
				dp[i]=max+1;
			}
		}
		int res =Integer.MIN_VALUE;
		for(int i=0;i<dp.length;i++) {
			if(dp[i]>res) {
				res=dp[i];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(lis(arr));
	}
}
