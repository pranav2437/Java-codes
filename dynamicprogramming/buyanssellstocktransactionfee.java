package dynamicprogramming;
import java.util.*;

public class buyanssellstocktransactionfee {

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] prices= new int [n];
        for(int i=0;i<n;i++){
            prices[i]=scn.nextInt();
        }
        int fee=scn.nextInt();
        System.out.print(maxProfit(prices, fee));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and an integer
	 // It should return the required output

	 public static int maxProfit(int[] prices, int fee) {
	 	 //Write your code here
		 int[] buy = new int[prices.length];
		 int[] sell = new int[prices.length];
		 buy[0]=-1*prices[0];
		 sell[0]=0;
		
		 for(int i=1;i<prices.length;i++) {
			 int n1 = buy[i-1];
			 int n2 = sell[i-1]-prices[i];
			 
			 buy[i]=Math.max(n1, n2);
			 int s1 = sell[i-1];
			 int s2 = buy[i-1] + prices[i]-fee;
			 sell[i]=Math.max(s1, s2);
		 }
		 
		 return Math.max(buy[buy.length-1], sell[sell.length-1]);
	 }
}
