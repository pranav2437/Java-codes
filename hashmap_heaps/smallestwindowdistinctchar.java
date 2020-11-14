
package hashmap_heaps;

import java.util.*;

class smallestwindowdistinctchar {

    public static int minLength(String s) {
        //write your code here
    	HashSet<Character> set = new HashSet<>();
    	HashMap<Character,Integer> map = new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		set.add(c);
    	}
    	int minlength=Integer.MAX_VALUE;
    	int bstart=0;
    	int bend=0;
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(!map.containsKey(c)) {
    			map.put(c, 1);
    		}
    		else {
    			map.put(c,map.get(c)+1);
    		}
    		if(map.size()==set.size()) {
    			bend=i+1;
    			break;
    		}
    	}
    	if(map.size()!=set.size()) {
    		return 0;
    	}
    	int start=bstart;
    	int end =bend;
    	boolean valid=true;
    	while(end<=s.length()) {
    		if(valid) {
    			char c=s.charAt(start);
    			start++;
    			map.put(c, map.get(c)-1);
    			if(map.get(c)==0) {
    				map.remove(c);
    			}
    			if(map.size()<set.size()) {
    				valid=false;
    			}
    			else {
    				if((end-start)<(bend-bstart))
					{
						bend = end;
						bstart = start;
					}
    			}
    			
    		}
    		else {
    			if(end==s.length()) {
    				break;
    			}
    			char c=s.charAt(end);
    			end++;
    			if(!map.containsKey(c)) {
    				map.put(c, 1);
    			}
    			else {
    				map.put(c, map.get(c)+1);
    			}
    			if(map.size()<set.size()) {
    				continue;
    			}
    			if(map.size()==set.size()) {
    				valid=true;
    				if((end-start)<(bend-bstart))
					{
						bend = end;
						bstart = start;
					}
    				
    			}
    		}
    	}
    	minlength=bend-bstart;
    	
    	return minlength;
    			
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(minLength(sc.next()));
    }
}
