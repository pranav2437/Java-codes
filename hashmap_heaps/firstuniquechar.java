package hashmap_heaps;

import java.util.*;
class firstuniquechar {
     
 	  public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         String s= scn.next();
         System.out.print(firstUniqChar(s));
     }
     // -----------------------------------------------------
 	  // This is a functional problem. Only this function has to be written.
 	  // This function takes as input a String s
 	  // Return index of first unique character, if none present, return -1
     public static int firstUniqChar(String s) {
         //Write your code here
    	 HashMap<Character,Integer> map = new HashMap<>();
    	 
    	 for(int i=0;i<s.length();i++) {
    		 char c=s.charAt(i);
    		 if(!map.containsKey(c)) {
    			 map.put(c, 1);
    		 }
    		 else {
    			 map.put(c, map.get(c)+1);
    		 }
    	 }
    	 for(int i=0;i<s.length();i++) {
    		 if(map.get(s.charAt(i))==1) {
    			return i;    			 
    		 }
    	 }
         return -1;
     }
 }
