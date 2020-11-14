package arraysandstrings;

import java.util.*;

public class bestsightseeingpair {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return the maximum
    // score of a pair.
    public static int maxScoreSightseeingPair(int[] arr) {
        // write your code here.
    	int initialscore = arr[0];
    	int maxscore = Integer.MIN_VALUE;
    	for(int i=1;i<arr.length;i++) {
    		initialscore--;
    		if(arr[i]+initialscore>maxscore) {
    			maxscore = arr[i]+initialscore;
    		}
    		if(arr[i]>initialscore) {
    			initialscore=arr[i];
    		}
    	}
    	return maxscore;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxScoreSightseeingPair(arr));

    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
