package linkedlists;

import java.util.*;

class celebrityparty {

    static int getId(int M[][], int n) {
        // Write your code here    
    	Stack<Integer> st = new Stack<>();
    	for(int i=0;i<n;i++) {
    		st.push(i);
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
    	for(int j=0;j<n;j++) {
    		if(j==ans) {
    			continue;
    		}
    		if(M[ans][j]==1) {
    			return -1;
    		}
    	}
    	for(int i=0;i<n;i++) {
    		if(i==ans) {
    			continue;
    		}
    		if(M[i][ans]==0) {
    			return -1;
    		}
    	}
    	return ans;
    }

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] M = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println(getId(M, n));
    }
}
