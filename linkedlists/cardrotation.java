package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class cardrotation {

    public static void cardRotation(int N) {

        // Write your code here
    	Queue<Integer> q = new LinkedList<>();
    	int[] res = new int[N];
//    	int[] input = new int[N];
    	for(int i=1;i<=N;i++) {
    		q.add(i);
//    		input[i-1]=i;
    	}
    	for(int j=0;j<N;j++) {
    		int ctr=-1;
    		while(ctr<j) {
    			q.add(q.remove());
    			ctr++;
    		}
    		res[q.peek()-1]=j+1;
    		q.remove();    		
    	}
    	for(int k=0;k<res.length;k++) {
    		System.out.print(res[k]);
    	}

    }

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        cardRotation(N);
    }

}
