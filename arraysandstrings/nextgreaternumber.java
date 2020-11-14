package arraysandstrings;

import java.util.*;
/*
 * 1. Given a positive integer n, you need to find the smallest 32-bit integer which has exactly
 *  the same digits existing in the integer n and is greater in value than n.
 */

class nextgreaternumber {

    public static int nextGreaterElement(int n) {
	 //Write your code here
    	String s = String.valueOf(n);
    	 
        int arr[] = new int[s.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i) - '0';
        }

        int i = arr.length - 2;

        while (i >= 0) {
            if (arr[i] < arr[i + 1]) {
                break;
            }

            i--;
        }

        if (i == -1) {
            return i;
        }

        int first = i;

        i = arr.length - 1;

        while (i > first) {
            if (arr[i] > arr[first]) {
                break;
            }
            i--;
        }

        int second = i;

        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

        Arrays.sort(arr, first + 1, arr.length);

        int ans = 0;
        for (i = 0; i < arr.length; i++) {
            ans = ans + (int) (arr[i] * Math.pow(10, arr.length - i - 1));
        }

        return ans < 0 ? -1 : ans;
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(nextGreaterElement(sc.nextInt()));
    }

}
