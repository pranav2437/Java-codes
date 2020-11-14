package arraysandstrings;

import java.util.*;
/*
 * 1. You are given an array of N elements, where each element of the array represents 
 * the height of the terrain at that index.
2. The width of the terrain at each index is 1.
3. You are also given two numbers V and K which represent that V droplets of water fall at index K.
4. You have to find the height of each index when all droplets of water have fallen and settled.
5. A droplet first drops at index K and rests on top of the highest terrain or water at that index.
 Then, it flows according to the following rules:
a) If the droplet would eventually move to a lower level by moving left, then it moves left.
b) Otherwise, if the droplet would eventually move to a lower level by moving right,
 then it moves right.
c) Otherwise, it stays at its current position.
By level, we mean the total height of the terrain plus any water in that column.
 Assume there are infinite height terrains at boundaries.
 */

public class pourwater {

    // This is a functional problem. You have to complete this function.
    // It takes as input a heights array, v and k.
    // You have to return the resultant heights array.
    public static int[] pourWater(int[] heights, int v, int k) {
        // write your code here.
    	
    	while(v!=0) {
    		int c =k;
    		if(heights[c-1]>heights[c] && heights[c+1]>c) {
    			heights[c]+=1;
    			v--;
    			continue;
    		}
    		if(heights[c-1]<=heights[c]) {
    			while(c>0 && heights[c-1]<=heights[c]) {
        			c--;
        		}
        		while(heights[c]==heights[c+1] && c<k) {
        			c++;
        		}
        		//System.out.println(c);
        		if(c!=k) {
        			heights[c]+=1;
            		v--;
            		continue;
        		}        	
    		}
    		
    		if(heights[c+1]<=heights[c]) {
    			
    			while(c<heights.length-1 && heights[c+1]<=heights[c]) {
    				c++;
    			}
    			while(heights[c-1]==heights[c] && c>k) {
    				c--;
    			}
    			
    			if(c==k) {
    				heights[c]+=1;
    				v--;
    			}
    			else {
    				heights[c]+=1;
        			v--;	
    			}			
    			
    			
    		}
    		
    		
    		
    		
    	}
    	return heights;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of first array.
        int N = sc.nextInt();

        int[] arr1 = new int[N];

        // Input for array1 elements.
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int V = sc.nextInt();
        int K = sc.nextInt();

        int[] result = pourWater(arr1, V, K);
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
