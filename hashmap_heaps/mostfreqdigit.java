package hashmap_heaps;

import java.util.*;

public class mostfreqdigit {

    // This is a functional problem. You have to complete this function.
    // It takes as input the String s representing the number. It should return
    // the most occurring digit in s.
    public static int solve(String s) {
        // write your code here.
    	HashMap<Character,Integer> map = new HashMap<>();
    	char maxval='0';
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(!map.containsKey(c)) {
    			map.put(c,1);
    		}
    		else {
    			map.put(c, map.get(c)+1);
    		}
    		if(c>maxval) {
    			maxval=c;
    		}
    	}
    	int max=Integer.MIN_VALUE;
    	for(char k : map.keySet()) {
    		if(map.get(k)>max) {
    			max=map.get(k);
    			maxval =k;
    		}
    		if(map.get(k)==max) {
    			if(k>maxval) {
    				maxval=k;
    			}
    		}
    	}
    	return Character.getNumericValue(maxval);
    	
    	
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));

    }

}
