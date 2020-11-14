package arraysandstrings;

import java.util.*;
class shortestworddistance {
    public static int shortestWordDistance(String[] words, String word1, String word2) {
        //Write your code here
    	int w1=-1;
    	int w2=-1;
    	int length=Integer.MAX_VALUE;
    	int val=0;
    	for(int i=0;i<words.length;i++) {
    		if(words[i].equals(word1)) {
    			w1=i;
    			
    		}
    		if(words[i].equals(word2)){
    			w2=i;
    			
    		}
    		
    		if(w1!=-1 && w2!=-1) {
    			 val =w2-w1;
    			if(val<0) {
    				val*=-1;
    			}
    			if(val==0 || val<length) {
    				length=val;
    			}
    			
    		}
    		
			
    	}
    	return length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        String word1 = sc.next(), word2 = sc.next();
        System.out.println(shortestWordDistance(words, word1, word2));
    }
    
}
