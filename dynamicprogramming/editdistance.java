package dynamicprogramming;
/*
 * 1. You will be given 2 words: word1 and word2
2. Given that in each move you can only perform the one of these 3 operations:
a) Insert a character
b) Delete a character
c) Replace a character
3. Find and return minimum moves needed to modify word1 to word2
 */
import java.util.*;
public class editdistance {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String word1=scn.next();
        String word2=scn.next();
        System.out.println(minDistance(word1, word2));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 strings
	 // It should return the required output
    public static int minDistance(String word1, String word2) {
	 	 //Write your code here
    	int[][] dp = new int[word1.length()+1][word2.length()+1];
    	int val1 = 1;
    	for(int i=dp[0].length-2;i>=0;i--) {
    		dp[dp.length-1][i]=val1;
    		val1++;
    	}
    	int val2=1;
    	for(int i=dp.length-2;i>=0;i--) {
    		dp[i][dp[0].length-1] = val2;
    		val2++;
    	}
    	for(int i=dp.length-2;i>=0;i--) {
    		char c1 = word1.charAt(i);
    		for(int j=dp[0].length-2;j>=0;j--) {
    			char c2 = word2.charAt(j);
    			if(c1==c2) {
    				dp[i][j]=dp[i+1][j+1];             //when chars equal no action required
    			}
    			else {
    				int n1 = dp[i][j+1];              //deletion
    				int n2 = dp[i+1][j];              //insertion
    				int n3 = dp[i+1][j+1];            //replacement
    				dp[i][j]=Math.min(n1,Math.min(n2, n3)) +1;
    			}
    		}
    	}
    	return dp[0][0];
    	
	 }
}