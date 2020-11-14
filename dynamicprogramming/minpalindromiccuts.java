package dynamicprogramming;
import java.util.*;
public class minpalindromiccuts {
	
	public static int mincuts(String s) {
		int n=s.length();
		if(n==0 || n==1) {
			return 0;
		}
		int[][] dp = new int[n][n];
		for(int i=1;i<n;i++) {
			int row =0;
			int col=i;
			while(row<s.length() && col<s.length()) {
				char c1 = s.charAt(row);
				char c2 = s.charAt(col);
				if(c1==c2 && row+1<n && dp[row+1][col-1]==0) {
					dp[row][col]=0;					
				}
				else {
					int min =Integer.MAX_VALUE;
					int startcol=col-i;
					int startrow = row+1;
					while(startcol<col) {
						int sum = dp[startrow][col] + dp[row][startcol];
						startrow++;
						startcol++;
						min=Math.min(sum, min);
					}
					dp[row][col]=min+1;
				}
				row++;
				col++;
			}
		}
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return dp[0][n-1];
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(mincuts(s));
	}
}
