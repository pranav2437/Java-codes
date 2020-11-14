package linkedlists;

import java.io.*;
import java.util.*;

public class celebritytest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Stack<Integer> st = new Stack<>();
    	Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++) {
    		st.push(i);
    	}
        int[][] M = new int[n][n];
        for(int i=0;i<m;i++) {
        	int r = sc.nextInt();
        	int c = sc.nextInt();
        	M[r][c]=1;
        }
        while(st.size()>1) {
    		int val1 = st.pop();
    		int val2 = st.pop();
    		if(M[val2][val1]==0) {
    			st.push(val2);
    		}
    		else if(M[val1][val2]==1 && M[val2][val1]==1) {
    			st.push(val2);
    		}
    		else {
    			st.push(val1);
    		}
    	}
    	int ans = st.pop();
    	boolean flag=true;
    	for(int j=0;j<n;j++) {
    		if(j==ans) {
    			continue;
    		}
    		if(M[ans][j]==1) {
    			flag=false;
    		}
    	}
    	for(int i=0;i<n;i++) {
    		if(i==ans) {
    			continue;
    		}
    		if(M[i][ans]==0) {
    			flag=false;
    		}
    	}
    	if(flag) {
    		System.out.println(ans);
    	}
    	else {
    		System.out.println("-1");
    	}
    }
}
