package arraysandstrings;

import java.util.*;

/*
 * 1. You are given an array A of size N containing a permutation of the elements 
 * in the set {0, 1, ... , N-1}.
2. There is a global inversion when: i < j and A[i] > A[j] where 0 <= i < j < N.
3. There is a local inversion when: A[i] > A[i+1] where 0 <= i < N.
4. You have to find whether the number of global inversions are equal to the number 
of local inversions in the array or not.
5. For example,
Input: A = [1,2,0]
Output: false
 */

public class globalandlocalinversions {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return true if the number
    // of global inversions are equal to the number of local inversions, else
    // should return false.
    public static boolean isIdealPermutation(int[] A) {
        // write your code here.
    	for(int i=0;i<A.length;i++) {
    		int diff=A[i]-i;
    		if(Math.abs(diff)>1) {
    			return false;
    		}
    		else {
    			continue;
    		}
    	}
    	return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (isIdealPermutation(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
