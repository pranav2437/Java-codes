package arraysandstrings;

import java.util.Scanner;
import java.util.*;

/*
 * 1. You are given two Strings S and T.
2. You have to find if the strings are one edit distance apart or not.
3. S and T are one edit distance apart if you can:
a) Insert a character into S to get T
b) Delete a character from S to get T
c) Replace a character of S to get T
4. For example:
Input: S = "ab", T = "acb"
Output: true
Explanation: We can insert 'c' into S to get T.
5. main takes input from the users.
6. This is a functional problem. 
7. You have to complete the isOneEditDistance function.
 It takes as input two strings S and T. It should return true if the strings are one edit distance
  apart, else should return false.
 */

public class oneeditdistance {

    // This is a functional problem. You have to complete this function.
    // It takes as input two strings s and t.
    // It should return true if the strings are one edit distance apart,
    // else should return false.
    public static boolean isOneEditDistance(String s, String t) {
        // write your code here. 
    	int m = s.length();
    	int n=t.length();
    	if(m==n) {
    		int skips=0;
    		int start1=0;
    		int start2=0;
    		
    		while(start1<m && start2<m) {
    			if(s.charAt(start1)==t.charAt(start2)) {
    				start1++;
    				start2++;
    			}
    			else {
    				skips++;
    				start1++;
    				start2++;
    			}
    		}
    		if(skips==1) {
    			return true;
    		}
    		return false;
    	}
    	if(m>n) {
    		int sp=0;
    		int tp=0;
    		int skips=0;
    		while(sp<m && tp<n) {
    			if(s.charAt(sp)==t.charAt(tp)) {
    				sp++;
    				tp++;
    			}
    			else {
    				skips++;
    				sp++;
    			}
    		}
    		if(sp==m && tp<n) {
    			return false;
    		}
    		if(sp<m-1 &&tp==n) {
    			return false;
    		}
    		if(skips>1) {
    			return false;
    		}
    		return true;
    	}
    	if(m<n) {
    		int sp=0;
    		int tp=0;
    		int skips=0;
    		while(sp<m &&tp<n) {
    			if(s.charAt(sp)==t.charAt(tp)) {
    				sp++;
    				tp++;
    			}
    			else {
    				skips++;
    				tp++;
    			}
    		}
    		if(sp<m && tp==n) {
    			return false;
    		}
    		if(skips>1) {
    			return false;
    		}
    		return true;
    	}
    	return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isOneEditDistance(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}