package dynamicprogramming;

import java.util.*;

public class buyandsellstock2transactions {

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] prices= new int[n];
        for(int i=0;i<n;i++){
            prices[i]=scn.nextInt();
        }
        System.out.print(maxProfit(prices));
    }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and its size
	 // It should return the required output

	 public static int maxProfit(int prices[]) {
	 	 //Write your code here
		 int[] dp1 = new int[prices.length];
		 int[] dp2 = new int[prices.length];
		 int minsofar = prices[0];
		 int maxsofar = prices[prices.length-1];
		 
		 int best1 = 0;
		 int best2 = 0;
		 int res = Integer.MIN_VALUE;
		 for(int i=1;i<prices.length;i++) {
			 if(prices[i]<minsofar) {
				 minsofar=prices[i];
			 }
			 best1 = Math.max(best1,prices[i]-minsofar);	
			 dp1[i]=best1;			 
			 int j = prices.length-1-i;
			 if(prices[j]>maxsofar) {
				 maxsofar=prices[j];
			 }
			 best2 = Math.max(best2, maxsofar-prices[j]);
			 dp2[j]=best2;		 
		 }
		 for(int i=0;i<dp1.length;i++) {
			 res=Math.max(res, dp1[i]+dp2[i]);
		 }
		 return res;
	 }
}
