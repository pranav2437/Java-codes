package arraysandstrings;

import java.util.*;

/*
 * 1. You are given two integers N and K.
2. You have to construct a list which contains N different positive integers ranging from
 1 to N and obeys the following requirement: 
Suppose you construct the list [a1, a2, a3, ... , an], then the list
 [ |a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an| ] should have exactly K distinct integers.
3. Example 1:
Input: N = 3, K = 1
Output: [1, 2, 3]
Explanation: The [1, 2, 3] has three different positive integers ranging from 1 to 3, 
and the [1, 1] has exactly 1 distinct integer: 1.
4. Example 2:
Input: N = 3, K = 2
Output: [1, 3, 2]
Explanation: The [1, 3, 2] has three different positive integers ranging from 1 to 3,
 and the [2, 1] has exactly 2 distinct integers: 1 and 2.
 */

public class nicearrangement {

    // This is a functional problem. You have to complete this function.
    // It takes as input n and k. It should return the resultant array.
    public static int[] constructArray(int n, int k) {
        // write your code here. 
    	int[] res = new int[n+1];
    	for(int i=1;i<=n-(k+1);i++) {
    		res[i-1]=i;
    	}
    	int ctr=0;
    	int c1=0;
    	int c2=0;
    	for(int i=n-k;i<=n;i++) {
    		if(ctr%2==0) {
    			res[i-1]=i-c1;
    			ctr++;
    			c1++;
    		}
    		else {
    			res[i-1]=n-c2;
    			c2++;
    			ctr++;
    		}
    	}
    	for(int i=0;i<res.length;i++) {
    		System.out.println(res[i]);
    	}
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] result = constructArray(N, K);
        if (verify(result, N, K)) {
            System.out.println("Nice Arrangement");
        } else {
            System.out.println("Try Harder");
        }
    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // function to verify the result. just ignore it.
    private static boolean verify(int[] arr, int N, int K) {

        if (arr.length < N) {
            return false;
        }

        boolean[] a = new boolean[N + 1];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (a[arr[i]]) {
                return false;
            } else {
                a[arr[i]] = true;
            }

            if (i == N - 1) {
                break;
            } else {
                if (set.contains(Math.abs(arr[i] - arr[i + 1])) == false) {
                    set.add(Math.abs(arr[i] - arr[i + 1]));
                }
            }

        }

        if (set.size() != K) {
            return false;
        }

        return true;

    }

}
