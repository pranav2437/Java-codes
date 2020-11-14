package dynamicprogramming;
import java.util.*;

//Given an array which tells the amt of gold at each point, u start digging from first col..and in every 
//dig u move to next one..return max amt of gold you can collect till last column and the path.

public class goldmine {

	public static int maxgold(int[][] arr) {
		int r=arr.length;
		int c=arr[0].length;
		int[][] dp = new int[r][c];
		for(int i=0;i<r;i++) {
			dp[i][c-1]=arr[i][c-1];
		}
		for(int j=c-2;j>=0;j--) {
			for(int i=0;i<r;i++) {
				int n1=Integer.MIN_VALUE;
				int n2=Integer.MIN_VALUE;
				int n3=Integer.MIN_VALUE;
				if(i>=1) {
					n1 = dp[i-1][j+1];
				}
				if(i<r-1) {
					n3=dp[i+1][j+1];
				} 
				n2=dp[i][j+1];
				int max=Integer.MIN_VALUE;
				max=Math.max(n1,Math.max(n2, n3));
				dp[i][j]=max+arr[i][j];				 
			}
		}
		
		int res = Integer.MIN_VALUE;
		for(int i=0;i<r;i++) {
			res=Math.max(res, dp[i][0]);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] gold = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				gold[i][j]=sc.nextInt();
			}
		}
		System.out.println(maxgold(gold));
	}
}
