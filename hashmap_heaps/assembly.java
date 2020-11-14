package hashmap_heaps;

import java.util.HashMap;
import java.util.Scanner;

public class assembly {



    public static void minTransfer(int[] arr) {
        // Write your code here
    	int max = Integer.MIN_VALUE;
	 	 HashMap<Integer,Integer> map = new HashMap<>();
	 	 for(int i=0;i<arr.length;i++) {
	 		 map.put(arr[i], 0);
	 	 }
	 	 for(int i=0;i<arr.length;i++) {
	 		 if(arr[i]==1) {
	 			 map.put(arr[i],1);
	 		 }
	 		 else {
	 			 map.put(arr[i], map.get(arr[i]-1)+1);
	 		 }
	 		 if(map.get(arr[i])>max) {
	 			 max=map.get(arr[i]);
	 		 }
	 	 }
	 	 
	 	
	 	 System.out.println(arr.length-max);
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }
        minTransfer(heights);
    }

}
