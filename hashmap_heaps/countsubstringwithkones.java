package hashmap_heaps;

import java.io.*;
import java.util.*;

public class countsubstringwithkones { 
  
    public static void main (String[] args) 
    { 
        Scanner scn = new Scanner(System.in);
        String s = scn.next(); 
        int K = scn.nextInt(); 
          
        System.out.println( 
            countOfSubstringWithKOnes(s, K)); 
    } 
    // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a string and an integer k.
	 // It should return required integer value.

    static int countOfSubstringWithKOnes(String s, int K) 
    { 
	 	 //Write your code here
    	int[] arr = new int[s.length()];
    	for(int i=0;i<s.length();i++) {
    		arr[i]=Character.getNumericValue(s.charAt(i));
    	}
    	int count=0;
    	 HashMap<Integer,Integer> map = new HashMap<>();
		 map.put(0, 1);
		 int psum=0;
		 for(int i=0;i<arr.length;i++) {
			 psum+=arr[i];
			 int comp=psum-K;
			 if(map.containsKey(comp)) {
        		 count+=map.get(comp);
        	 }
        	 
			 if(!map.containsKey(psum)) {
				 map.put(psum, 1);
				 continue;
			 }
			 else {				 
				 map.put(psum, map.get(psum)+1);
			 }
			 
		 }
		 return count;
    } 
      
}
