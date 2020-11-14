package arraysandstrings;

import java.util.Scanner;
import java.util.*;

public class testparas {
	
	public static int maxm(int length,int updates[][],int m) {
		int[] arr = new int[length];
    	for(int i=0;i<updates.length;i++) {
    		int start = updates[i][0]-1;
    		int end = updates[i][1]-1;
    		
    		arr[start]+=1;
    		
    		if(end<arr.length-1) {
    			arr[end+1]+=-1;
    		}
    		
    	}
    	int p=0;
    	int[] psum = new int[arr.length];
    	for(int i=0;i<arr.length;i++) {
    		p+=arr[i];
    		psum[i]=p;
    	}
    	int[] p1 = new int[length];
    	int[] p2 = new int[length];
    	int ctr1=0;
    	int ctr2=0;
    	for(int i=0;i<p1.length;i++) {
    		if(psum[i]==m) {
    			ctr1++;
    		}
    		p1[i]=ctr1;
    		if(psum[i]==m+1) {
    			ctr2++;
    		}
    		p2[i]=ctr2;
    	}
    	int ctr=0;
    	for(int i=0;i<psum.length;i++) {
    		if(psum[i]==m) {
    			ctr++;
    		}
    	}
    	int count=0;
    	
    	for(int i=0;i<updates.length;i++) {
    		int start = updates[i][0]-1;
    		int end = updates[i][1]-1;
    		int cm=0;
    		int cm1=0;
    		if(start>0) {
    			 cm = p1[end]-p1[start-1];
    			 cm1 = p2[end]-p2[start-1];
    		}
    		else {
    			cm=p1[end];
    			cm1=p2[end];
    		}
    		int ans = ctr+ cm1-cm;
    		count=Math.max(ans, count);
    		
    	}
    	return count;
    	
	}

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of first array.
        int length = sc.nextInt();

        int K = sc.nextInt();
        int m = sc.nextInt();

        int[][] updates = new int[K][2];

        for (int i = 0; i < updates.length; i++) {
            for (int j = 0; j < updates[0].length; j++) {
                updates[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxm(length,updates,m));
	}
}
