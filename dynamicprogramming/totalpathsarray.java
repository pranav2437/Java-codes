package dynamicprogramming;
import java.util.*;


//Given an array, value at ith index gives max jump size. Starting from 0th index u need to reach end
// of the array. Return the total number of paths possible to do so.
public class totalpathsarray {
	
	public static int totalpaths(int[] arr) {
		
		int[] dp = new int[arr.length];
		dp[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--) {
			int val =0;
			int rangeindex=arr[i]+i;
			if(arr[i]==0) {
				dp[i]=0;
			}
			else {
				int ans =0;
				for(int j=i+1;j<arr.length && j<=rangeindex;j++) {
					ans+=dp[j];
				}
				dp[i]=ans;
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
		System.out.println(totalpaths(arr));
	}
}
