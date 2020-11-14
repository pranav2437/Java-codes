package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class maxsumofsmallest {
    public static long findlargest(long arr[],int n){
    // Write your code here  
    	long maxsum =0;
    	for(int i=0;i<arr.length-1;i++) {
    		if(arr[i]+arr[i+1]>maxsum) {
    			maxsum=arr[i]+arr[i+1];
    		}
    	}
    	return maxsum;
    	
    }
	  








	  // Dont make changes here
	  public static void main (String[] args)throws Exception {
	  	  Scanner sc=new Scanner(System.in);
	  	  int n=sc.nextInt();
	          long arr[]=new long[n];
	          for(int i=0;i<n;i++)arr[i]=sc.nextLong();
	          System.out.println(findlargest(arr,n));
	  
	  }
}
