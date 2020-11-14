package dynamicprogramming;
import java.util.*;

public class longestpalinsubstring {

	
	
	    public  static String longestPalindrome(String s) {
	        int n=s.length();
	        if(n==0){
	            return "";
	        }
	        if(n==1){
	            return Character.toString(s.charAt(0));
	        }
	        if(n==2 && (s.charAt(0)!=s.charAt(1))){
	            return Character.toString(s.charAt(0));
	        }
	        int[][] dp = new int[n][n];
	        for(int i=0;i<n;i++){
	            dp[i][i]=1;
	        }
	        int imax=0;
	        int jmax=0;
	        int omax = 0;
	        for(int i=1;i<s.length();i++) {
				int startcol =i;
				int startrow=0;
				while(startrow<s.length() && startcol<s.length()) {
					char c1=s.charAt(startrow);
					char c2=s.charAt(startcol);
					if(c1==c2) {
						
						if(startrow+1<s.length() && startcol-1>=0) {
	                        if((dp[startrow+1][startcol-1]!=0) || (dp[startrow+1][startcol-1]==0 && startrow+1>startcol-1)){
	                            dp[startrow][startcol]=dp[startrow+1][startcol-1]+2;
	                        }						
						}
					}
					else {
						
						dp[startrow][startcol]=0;
					}
	                if(dp[startrow][startcol]>omax){
	                    omax=dp[startrow][startcol];
	                    imax=startrow;
	                    jmax=startcol;
	                }
					startrow++;
					startcol++;
				}
			}
	        if(imax>=n || jmax>=n){
	            return "";
	        }
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<n;j++) {
	        		System.out.print(dp[i][j] + " ");
	        	}
	        	System.out.println();
	        }
	        return s.substring(imax,jmax+1);        
	    }
	    
	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s= sc.next();
			String ans = longestPalindrome(s);
			System.out.println(ans);
		}
	
}
