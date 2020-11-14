package linkedlists;

import java.io.*;
import java.util.*;

public class virus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int ctr=0;
        for(int i=1;i<n;i++) {
        	if(st.isEmpty()) {
        		st.push(arr[i]);
        		continue;
        	}
        	if(!st.empty() && arr[i]<st.peek()) {
        		arr[i]=st.peek();
        		st.pop();
        		ctr++;
        	}
        }
        System.out.println(ctr);
    }
}
