package hashmap_heaps;

import java.util.*;

public class firstrepeatedchar {

    // This is a functional problem. You have to complete this function.
    // It takes as input the String s. It should return the first repeated
    // character if present, else should return $.
    public static char solve(String s) {
        // write your code here.
    	HashSet<Character> set = new HashSet<>();
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(!set.contains(c)) {
    			set.add(c);
    		}
    		else {
    			return c;
    		}
    	}
    	return '$' ;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solve(str));

    }

}
