package arraysandstrings;

import java.util.*;

public class attendancerecord {

    // This is a functional problem. You have to complete this function.
    // It takes as input a String S. It should return true if the student could
    // be rewarded, else should return false.
    public static boolean checkRecord(String s) {
        // write your code here. 
    	int count=0;
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(c=='P') {
    			continue;
    		}
    		if(c=='A') {
    			count++;
    			if(count>1) {
    				return false;
    			}
    			continue;
    		}
    		if(c=='L') {
    			if(i<s.length()-2) {
    				if(s.charAt(i+1)=='L' && s.charAt(i+2)=='L') {
    					return false;
    				}
    				else {
    					continue;
    				}
    			}
    		}
    	}
    	return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        if (checkRecord(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}