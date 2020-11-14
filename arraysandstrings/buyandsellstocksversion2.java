package arraysandstrings;

import java.util.*;

public class buyandsellstocksversion2 {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return the maximum profit.
    public static int maxProfit(int[] A) {
 
    	
    	int profit =0;
    	for(int i=0;i<A.length-1;i++) {
    		if(A[i+1]>A[i]) {
    			profit+=A[i+1]-A[i];
    		}
    	}
    	return profit;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr));
    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
