package arraysandstrings;

import java.util.*;

class countbinarysubstrings{
    public static void main(String[] args){
        Scanner scn= new Scanner (System.in);
        String s=scn.next();
	 	 System.out.print(countBinarySubstrings(s));
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a string
	 // It should return the required output

    public static int countBinarySubstrings(String s) {
	 	 //write code here
    	char[] a = s.toCharArray();
    	int count =0;
    	int[] arr = new int[a.length];
    	for(int i=0;i<arr.length;i++) {
    		arr[i]=Character.getNumericValue(a[i]);
    	}
    	int prev=0;
    	int curr=1;
    	int i=1;
    	for(;i<arr.length;i++) {
    		if(arr[i-1]==arr[i]) {
    			curr++;
    		}
    		else {
    			prev=curr;
    			curr=1;
    		}
    		if(prev>=curr) {
    			count++;
    		}
    	}
    	return count;
	 }

}
