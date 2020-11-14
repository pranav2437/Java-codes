package arraysandstrings;

import java.util.*;

class sortcustomstring{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String S= scn.next();
        String T=scn.next();
        System.out.print(customSortString(S, T));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input two strings
	 // It should return required output.	  

    public static String customSortString(String S, String T) {
       //Write your code here
    	HashMap<Character,Integer> map = new HashMap<>();
    	String res ="";
    	for(int i=0;i<T.length();i++) {
    		char c= T.charAt(i);
    		if(!map.containsKey(c)) {
    			map.put(c, 1);
    		}
    		else {
    			map.put(c, map.get(c)+1);
    		}
    	}
    	for(int i=0;i<S.length();i++) {
    		char c=S.charAt(i);
    		if(map.containsKey(c)) {
    			int val = map.get(c);
    			while(val!=0) {
    				res+=c;
    				val--;
    			}
    			map.remove(c);
    			
    		}
    		
    		
    	}
    	for(char c='a';c<='z';c++) {
    		if(map.containsKey(c)) {
    			int val=map.get(c);
    			while(val!=0) {
    				res+=c;
    				val--;
    			}
    		}
    	}
    	return res;
	 }
}
