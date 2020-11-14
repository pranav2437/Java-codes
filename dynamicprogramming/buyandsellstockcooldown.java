package dynamicprogramming;
/*
 * 1. You will be given prices of a particular stock in an array A, wherein A[i] represents price of stock on ith day
2. You need to find the maximum profit that can be earned, given you can decide which day to buy and which one to sell the stock
3. You can perform as many transactions as you want, however following are the restrictions you need to abide by:
a) You can not engage in multiple transactions at the same time (i.e, you must sell the stock before you buy again).
b) After you sell your stock, you cannot buy stock on next day. (i.e, cooldown 1 day)
4. Return maximum profit that can be earned
 */

import java.util.*;

public class buyandsellstockcooldown {

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
    public static int maxProfit(int[] prices) {
	 	 //Write your code here
    	int[] buy = new int[prices.length];
    	int[] sell = new int[prices.length];
    	int[] cool = new int[prices.length];
    	buy[0]=-1*prices[0];
    	sell[0]=0;
    	cool[0]=0;
    	for(int i=1;i<prices.length;i++) {
    		int b1 = buy[i-1];
    		int b2 = cool[i-1]-prices[i];
    		buy[i]=Math.max(b1, b2);
    		int s1 = sell[i-1];
    		int s2 = buy[i-1]+prices[i];
    		sell[i]=Math.max(s1, s2);
    		int c1 = cool[i-1];
    		int c2 = sell[i-1];
    		cool[i]=Math.max(c1, c2);
    	}
    	return sell[sell.length-1];
	 }
}
