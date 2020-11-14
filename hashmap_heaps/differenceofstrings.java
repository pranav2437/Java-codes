package hashmap_heaps;

import java.util.*;

public class differenceofstrings {

    // This is a functional problem. You have to complete this function.
    // It takes as input the String s ant t. It should return the different
    // character.
    public static char findTheDifference(String s, String t) {
        // write your code here.
//    	HashMap<Character,Integer> map = new HashMap<>();
//    	for(int i=0;i<t.length();i++) {
//    		char c=t.charAt(i);
//    		if(!map.containsKey(c)) {
//    			map.put(c, 1);
//    		}
//    		else {
//    			map.put(c,map.get(c)+1);
//    		}
//    	}
//    	for(int i=0;i<s.length();i++) {
//    		char c=s.charAt(i);
//    		if(map.containsKey(c)) {
//    			map.put(c, map.get(c)-1);
//    		}
//    	}
//    	char ans ='a';
//    	for(char k:map.keySet()) {
//    		if(map.get(k)!=0) {
//    			ans=k;
//    		}
//    	}
//    	return ans;
    	
    	//now using XOR method
    	int rx =0;
    	for(int i=0;i<s.length();i++) {
    		rx^=s.charAt(i);
    	}
    	for(int i=0;i<t.length();i++) {
    		rx^=t.charAt(i);
    	}
    	return (char)rx;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(findTheDifference(s, t));

    }

}
