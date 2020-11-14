package hashmap_heaps;

import java.util.*;

public class minmeetingrooms {

    // This is a functional problem. You have to complete this function.
    // It takes as input a 2D array
    // It should return the min number of meeting rooms required.
    public static int minMeetingRooms(int[][] intervals) {
        // write your code here.
    	int[] start = new int[intervals.length];
    	int[] end = new int[intervals.length];
    	int minrooms=0;
    	for(int i=0;i<start.length;i++) {
    		start[i]=intervals[i][0];
    	}
    	for(int i=0;i<end.length;i++) {
    		end[i]=intervals[i][1];
    		
    	}
    	
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	for(int i=0;i<start.length;i++) {
    		if(start[i]>max) {
    			max=start[i];
    		}
    		if(start[i]<min) {
    			min=start[i];
    		}
    		
    	}
    	for(int i=0;i<start.length;i++) {
    		if(end[i]>max) {
    			max=end[i];
    		}
    		if(end[i]<min) {
    			min=end[i];
    		}
    		
    	}
    	int[] arr = new int[max-min+1];
    	for(int i=0;i<start.length;i++) {
    		arr[start[i]-min] = 1;
    	}
    	for(int i=0;i<end.length;i++) {
    		arr[end[i]-min] =-1;
    	}
    	int psum=0;
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    		psum+=arr[i];
    		if(psum>minrooms) {
    			minrooms=psum;
    		}
    	}
    	return minrooms;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of meetings.
        int N = sc.nextInt();

        int[][] intervals = new int[N][2];

        int start, end;
        // Input for intervals.
        for (int i = 0; i < intervals.length; i++) {

            start = sc.nextInt();
            end = sc.nextInt();

            intervals[i][0] = start;
            intervals[i][1] = end;
        }

        int result = minMeetingRooms(intervals);

        System.out.println(result);

    }

    // Function to display a 2D array.
    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        
    }

}
