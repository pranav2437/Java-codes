package dynamicprogramming;
import java.util.*;

//return the length of longest substring common between 2 strings
public class longestcommonsubsequence {

	
	public static int lcs(String s1,String s2) {
		int m =s1.length();
		int n=s2.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			dp[i][n]=0;
		}
		for(int j=0;j<n+1;j++) {
			dp[m][j]=0;
		}
		for(int i=dp.length-2;i>=0;i--) {
			char c1=s1.charAt(i);
			for(int j=dp[0].length-2;j>=0;j--) {
				char c2 = s2.charAt(j);
				if(c1==c2) {
					dp[i][j]=dp[i+1][j+1]+1;
				}
				else {
					dp[i][j]=Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		return dp[0][0];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2=sc.next();
		System.out.println(lcs(s1,s2));
	}
}
