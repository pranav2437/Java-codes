package arraysandstrings;


/*
 * 1. You are given a Strings S.
2. You are also given an integer array 'shifts'.
3. For each shifts[i] = x, you have to shift the first i+1 letters of S, x times and find the final string after all shifts.
4. For example, 
Input: S = "abc", shifts = [3,5,9]
Output: "rpl"
Explanation: 
We start with "abc".
After shifting the first 1 letters of S by 3, we have "dbc".
After shifting the first 2 letters of S by 5, we have "igc".
After shifting the first 3 letters of S by 9, we have "rpl", the answer.
 */
import java.util.*;

public class shiftingletters {

    // This is a functional problem. You have to complete this function.
    // It takes as input a String S and an integer array shifts.
    // It should return the final string after all the shifts are applied.
    public static String shiftingLetters(String S, int[] shifts) {
        // write your code here. 
    	int suffixsum=0;
    	String res ="";
    	for(int i=shifts.length-1;i>=0;i--) {
    		char c=S.charAt(i);
    		suffixsum+=shifts[i]%26;
    		char val = (char)((c-'a'+suffixsum)%26 +'a');
    		res = val+res;
    	}
    	return res;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int N = sc.nextInt();

        int[] shifts = new int[N];

        for (int i = 0; i < N; i++) {
            shifts[i] = sc.nextInt();
        }

        System.out.println(shiftingLetters(S, shifts));
    }
}
