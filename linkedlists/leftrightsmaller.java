package linkedlists;

import java.util.*;
class leftrightsmaller
{
    static int findMaxDiff(int A[], int N)
    { // Write your code here
    	Stack<Integer> st = new Stack<>();
    	int ans = Integer.MIN_VALUE;
    	for(int i=0;i<A.length;i++) {
    		if(st.isEmpty()) {
    			st.push(A[i]);
    			continue;
    		}
    		int topval = st.peek();
    		if(A[i]==topval) {
    			continue;
    		}
    		if(A[i]>topval) {
    			st.push(A[i]);
    			continue;
    		}
    		while(!st.empty() && A[i]<topval) {
    			st.pop();
    			int left=0;
    			if(!st.empty()) {
    				left=st.peek();
    			}
    			int right = A[i];
    			int smallans = right-left;
    			if(smallans<0) {
    				smallans*=-1;
    			}
    			if(smallans>ans) {
    				ans=smallans;
    			}
    			topval=left;
    		}
    		if(!st.empty() && A[i]==st.peek()) {
    			continue;
    		}
    		st.push(A[i]);
    			
    		}
    	while(!st.empty()) {
    		st.pop();
    		int right =0;
    		int left=0;
    		if(!st.empty()) {
    			left=st.peek();
    		}
    		int small = right-left;
    		if(small<0) {
    			small*=-1;
    		}
    		if(small>ans) {
    			ans=small;
    		}
    	}
    	return ans;
    	}
    	
    
    














	 // Dont make changes here
    public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 int N=sc.nextInt();
    	 int[] A=new int[N];
    	 for(int i=0;i<N;i++)A[i]=sc.nextInt();
    	 System.out.println(findMaxDiff(A, N));
    }
}
