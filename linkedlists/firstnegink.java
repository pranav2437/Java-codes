package linkedlists;


import java.util.*;
import java.lang.*;
import java.io.*;

class firstnegink{
	 
	 public  static void window(int[] arr, int k){
	 // Write your code here
		int i=0,j=0;
		int[] res = new int[arr.length-k+1];
		while(i<arr.length-k+1 && j<arr.length) {
			if(arr[i]<0) {
				res[i]=arr[i];
				i++;
			}
			else if(arr[j]<0 && j-i <k) {
				res[i]=arr[j];
				i++;
				j++;
			}
			
			else if(j-i>=k) {
				i++;
			}
			else {
				j++;
			}
			if(j<i) {
				j=i;
			}
		}
		for(int m=0;m<res.length;m++) {
			System.out.print(res[m] + " ");
		}
		
		
		
	 }







	 // Dont make changes here
	 public static void main (String[] args) {
	      Scanner s=new Scanner(System.in);
	 	      int size=s.nextInt();
	 	      int[]arr=new int[size];
	 	      for(int i=0;i<size;i++){
	 	          arr[i]=s.nextInt();
	 	      }
	 	      int k=s.nextInt();
	 	      
	 	      
	 	     window(arr, k);
	 	  
	 }
}