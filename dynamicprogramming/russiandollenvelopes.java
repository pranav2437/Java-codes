package dynamicprogramming;

import java.util.*;
/*
 * 1. You will be given an Integer array of envelopes that consists of their widths and heights
2. You need to find maximum number of envelopes you can put inside another much like a russian doll
3. An envelope can only fit inside another if it's smaller than the other
 */


public class russiandollenvelopes {
	public static class Pair{
		int h;
		int w;
		Pair(int h,int w){
			this.h=h;
			this.w=w;
		}
	}
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
	 	 int envelopes[][]=new int[r][2];
	 	 for(int i=0;i<r;i++){
            for(int j=0;j<2;j++){
                envelopes[i][j]=scn.nextInt();
            }
	 	 }
	 	 System.out.println(maxEnvelopes(envelopes));
    }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as an integer array
	 // It should return the required output

	 public static int maxEnvelopes(int[][] envelopes) {
	 	 //Write your code here
		 Pair[] arr = new Pair[envelopes.length];
		 for(int i=0;i<envelopes.length;i++) {
			 Pair p = new Pair(envelopes[i][0],envelopes[i][1]);
			 arr[i]=p;
		 }
		 Arrays.sort(arr, new Comparator<Pair>() {public int compare(Pair p1, Pair p2) 
         { 
             return p1.h - p2.h; 
         }});
		 int[] dp = new int[envelopes.length];
		 dp[0]=1;
		 for(int i=1;i<arr.length;i++) {
			 int max = Integer.MIN_VALUE;
			 
			 for(int j=0;j<i;j++) {
				 if(arr[j].w < arr[i].w && arr[j].h < arr[i].h) {
					 max = Math.max(max, dp[j]);
				 }
			 }
			 if(max==Integer.MIN_VALUE) {
				 dp[i]=1;
			 }
			 else {
				 dp[i]=max+1;
			 }
		 }
		 int omax=Integer.MIN_VALUE;
		 for(int i=0;i<dp.length;i++) {
			 if(dp[i]>omax) {
				 omax=dp[i];
			 }
		 }
		 return omax;
	 }
}
