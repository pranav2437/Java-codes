package hashmap_heaps;

import java.util.*;

public class subsetofarray {

    // This is a functional problem. You have to complete this function.
    // It takes as input two arrays.
    // You have to return true if array2 is subset of first, else should return
    // false.

    public static boolean solve(int[] num1, int[] num2) {
       // write your code here.
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int i=0;i<num1.length;i++) {
    		if(!map.containsKey(num1[i])) {
    			map.put(num1[i],1);
    		}
    		else {
    			map.put(num1[i],map.get(num1[i])+1);
    		}
    	}
    	for(int i=0;i<num2.length;i++) {
    		if(!map.containsKey(num2[i]) || map.get(num2[i])==0) {
    			return false;
    		}
    		else {
    			map.put(num2[i], map.get(num2[i])-1);
    		}
    	}
    	for(int k:map.keySet()) {
    		if(map.get(k)<0) {
    			return false;
    		}
    	}
    	return true;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for the arrays.
        int N = sc.nextInt();
        int[] array1 = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            array1[i] = n;
        }

        int M = sc.nextInt();
        int[] array2 = new int[M];

        for (int i = 0; i < M; i++) {
            int m = sc.nextInt();
            array2[i] = m;
        }

        if (solve(array1, array2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    // Function to print an array. You can use it for debugging purposes.
    // It takes as input the array to be displayed.
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}