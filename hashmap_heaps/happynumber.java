package hashmap_heaps;
/*
 * . You are given a number N.
2. You have to find whether N is "happy" or not.
3. A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
For Example: 
Input: 19
Output: Happy

Explanation: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */

import java.util.*;

public class happynumber {

    // This is a functional problem. You have to complete this function.
    // It takes as input a number n. It should return true if the number is
    // happy, else should return false.
	public static int sqsum(int n) {
		int sum=0;
		while(n>0) {
			int val = n%10;
			sum+=val*val;
			n=n/10;
		}
		return sum;
	}
    public static boolean isHappy(int n) {
        // write your code here.
    	
    	HashSet<Integer> set = new HashSet<>();
    	boolean flag = false;
    	set.add(n);
    	int ss = sqsum(n);
    	while(ss!=1) {
    		if(set.contains(ss)) {
    			return false;
    		}
    		set.add(ss);
    		ss=sqsum(ss);
    	}
    	return true;
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (isHappy(N)) {
            System.out.println("Happy");
        } else {
            System.out.println("Not Happy");
        }
    }

}
