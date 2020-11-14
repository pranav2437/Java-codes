package arraysandstrings;

import java.util.*;
/*
 * You are given a sorted array,
 * you need to return a sorted array of the squares of the elements of given array
 */

public class sortedsquaresarray {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return
    // the required array.
    public static int[] sortedSquares(int[] A) {
        // write your code here. 
    	int[] res = new int[A.length];
    	int start=0;
    	int end=A.length-1;
    	int ctr=1;
    	while(start<=end) {
    		int sq1 = A[start]*A[start];
    		int sq2 = A[end]*A[end];
    		if(sq1>sq2) {
    			res[A.length-ctr]=sq1;
    			start++;
    			ctr++;
    		}
    		else {
    			res[A.length-ctr]=sq2;
    			end--;
    			ctr++;
    		}
    	}
    	return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of array.
        int length = sc.nextInt();

        int[] arr = new int[length];

        // Input for elements of array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = sortedSquares(arr);
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