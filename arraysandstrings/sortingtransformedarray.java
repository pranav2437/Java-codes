package arraysandstrings;

import java.util.*;

public class sortingtransformedarray {

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        Arrays.sort(nums);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int[] res=sortTransformedArray(nums, a, b, c);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
	 }
	  // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and 3 integers
	 // It should return an integeral array

    public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {
	 	 //Write your code here
    	int[] res = new int[nums.length];
    	if(a>0) {
    		int start=0;
        	int end=nums.length-1;
        	int ctr=1;
        	while(start<=end) {
        		int val1 = (a*nums[start]*nums[start]) + b*nums[start] +c;
        		int val2 = (a*nums[end]*nums[end]) + b*nums[end] +c;
        		if(val1>val2) {
        			res[nums.length-ctr]=val1;
        			start++;
        			ctr++;
        		}
        		else {
        			res[nums.length-ctr]=val2;
        			end--;
        			ctr++;
        		}
        	}
    	}
    	else {
    		int start=0;
        	int end=nums.length-1;
        	int ctr=0;
        	while(start<=end) {
        		int val1 = (a*nums[start]*nums[start]) + b*nums[start] +c;
        		int val2 = (a*nums[end]*nums[end]) + b*nums[end] +c;
        		
        		if(val1>val2) {
        			res[ctr]=val1;
        			start++;
        			ctr++;
        		}
        		else {
        			res[ctr]=val2;
        			end--;
        			ctr++;
        		}
        	}
    	}
    	if(a<0) {
    		int[] ans = new int[res.length];
    		for(int i=0;i<res.length;i++) {
    			ans[res.length-1-i] = res[i];
    		}
    			return ans;
    		
    	}
    	return res;
	 }
}
