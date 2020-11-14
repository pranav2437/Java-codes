package hashmap_heaps;
/*
 * 1. You are given an array of positive integers where all numbers occur even number of times except one number which occurs odd number of times.
2. You have to find the number occurring odd number of times.
 */

import java.util.*;

public class findoddoccurence {

    // This is a functional problem. You have to complete this function.
    // It takes as input the an array of integers. It should return
    // the number occurring odd number of times.
    public static int solve(int[] arr) {
        // write your code here.
    	int n =0;
    	for(int i=0;i<arr.length;i++) {
    		n^=arr[i];
    	}
    	return n;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(arr));

    }

}
