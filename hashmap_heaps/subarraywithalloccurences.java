package hashmap_heaps;

import java.util.*;

public class subarraywithalloccurences {

    public static void subarrAllOcc(int[] arr) {
        //Write your code here
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int i=0;i<arr.length;i++) {
    		if(!map.containsKey(arr[i])) {
    			map.put(arr[i],1);
    		}
    		else {
    			map.put(arr[i], map.get(arr[i])+1);
    		}
    	}
    	int maxf=0;
    	int maxele=0;
    	for(int k:map.keySet()) {
    		if(map.get(k)>maxf) {
    			maxf=map.get(k);
    			maxele=k;
    		}
    	}
    	int start=0;
    	
    	for (int i=0; i<arr.length; i++) 
        { 
            if (arr[i] == maxele) 
            { 
                start = i; 
                break; 
            } 
        }
    	int end = start; 
        for (int i=arr.length-1; i>=start; i--) 
        { 
            if (arr[i] == maxele) 
            { 
                end = i; 
                break; 
            } 
        }
        for(int i=start;i<=end;i++) {
        	System.out.print(arr[i] + " ");
        }
    	
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        subarrAllOcc(arr);
    }
}