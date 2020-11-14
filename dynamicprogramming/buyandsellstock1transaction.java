package dynamicprogramming;

import java.util.*;

public class buyandsellstock1transaction {

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
	 // This function takes as input an array
	 // It should return the required output

	 public static int maxProfit(int prices[]) {
	 	 //Write your code here
		 int max = Integer.MIN_VALUE;
		 int minsofar = prices[0];
		 int diff = 0;
		 for(int i=1;i<prices.length;i++) {
			 if(prices[i]<minsofar) {
				 minsofar = prices[i];
			 }
			 diff = prices[i]-minsofar;
			 max=Math.max(max, diff);
		 }
		 return max;
	 }
}
