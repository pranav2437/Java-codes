package dynamicprogramming;

import java.util.*;

public class paintfence {

	 public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
	 	 System.out.println(CountWays(a,b));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 integers
	 // It should return the required output

	 public static int CountWays(int n, int k) {
	 	 //Write your code here
		 int[] same = new int[n];
		 int[] diff = new int[n];
		 same[0]=0;
		 diff[0]=k;
		 for(int i=1;i<same.length;i++) {
			 same[i]=diff[i-1];             //put the end color in last diff again
			 diff[i]=(same[i-1]+diff[i-1])*(k-1);         //all posibilities*colors except the current one
			 
		 }
		 return same[same.length-1]+diff[diff.length-1];
	 }
}