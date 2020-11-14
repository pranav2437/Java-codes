package dynamicprogramming;
import java.util.*;

//given an array of denominations, you need to make the target money value ..assume infinite coins for
//each denomination. Return the number of permutations of coins possible.

public class coinpermutations {

	public static int countpermutations(int[] arr,int target) {
		int[] dp = new int[target+1];
		dp[0]=1;
		for(int i=1;i<dp.length;i++) {         // for every pt of dp array we put values acc to all denom.
			int val=0;                         // at the same time to get all the possible permutations.
			for(int j=0;j<arr.length;j++) {
				int range = arr[j];
				if(i-range>=0) {
					val+=dp[i-range];
				}
			}
			dp[i]=val;
		}
		
		return dp[dp.length-1];
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(countpermutations(arr,target));
	}
}
