package arraysandstrings;

import java.util.*;

/*
 * 1. You are given a number N.
2. Assume you have an array of length N initialised with all 0's.
3. You are also given K update operations.
4. Each operation contain 3 numbers: startIndex, endIndex and inc and updates 
each element of the subarray arr[startIndex, endIndex](both inclusive) with inc.
5. You have to find the resultant array when all K operations are executed.
 */

public class rangeaddition {

    // This is a functional problem. You have to complete this function.
    // It takes as input a length and a 2D array of update operations.
    // It should return the modified array.
    public static int[] getModifiedArray(int length, int[][] updates) {
        // write your code here. 
    	int[] arr = new int[length];
    	for(int i=0;i<updates.length;i++) {
    		int start = updates[i][0];
    		int end = updates[i][1];
    		int val=updates[i][2];
    		arr[start]+=val;
    		
    		if(end<arr.length-1) {
    			arr[end+1]+=-1*val;
    		}
    		
    	}
    	int p=0;
    	int[] psum = new int[arr.length];
    	for(int i=0;i<arr.length;i++) {
    		p+=arr[i];
    		psum[i]=p;
    	}
    	return psum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of first array.
        int length = sc.nextInt();

        int K = sc.nextInt();

        int[][] updates = new int[K][3];

        for (int i = 0; i < updates.length; i++) {
            for (int j = 0; j < updates[0].length; j++) {
                updates[i][j] = sc.nextInt();
            }
        }

        int[] result = getModifiedArray(length, updates);
        display(result);
    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
