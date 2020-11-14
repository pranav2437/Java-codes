package dynamicprogramming;
import java.util.*;

//Return the length of longest palindromic subsequence in a string

public class longestpalindromicsubsequence {    //alternative soln:take its lcs with its reverse

	public static int lpsq(String s) {
		if(s.length()==0 || s.length()==1) {
			return s.length();
		}
		int[][] dp = new int[s.length()][s.length()];
		for(int i=0;i<s.length();i++) {
			dp[i][i]=1;
		}
		for(int i=1;i<s.length();i++) {
			int startcol =i;
			int startrow=0;
			while(startrow<s.length() && startcol<s.length()) {
				char c1=s.charAt(startrow);
				char c2=s.charAt(startcol);
				if(c1==c2) {
					
					if(startrow+1<s.length() && startcol-1>=0) {
						dp[startrow][startcol]=dp[startrow+1][startcol-1]+2;
					}
				}
				else {
					int val1=Integer.MIN_VALUE;
					int val2=Integer.MIN_VALUE;
					if(startcol-1>=0) {
						val1=dp[startrow][startcol-1];
					}
					if(startrow+1<s.length()) {
						val2=dp[startrow+1][startcol];
					}
					dp[startrow][startcol]=Math.max(val1, val2);
				}
				startrow++;
				startcol++;
			}
		}
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return dp[0][s.length()-1];
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(lpsq(s));
	}
}
