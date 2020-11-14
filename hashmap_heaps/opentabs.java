package hashmap_heaps;

import java.util.*;

public class opentabs {

    public static int open_closeTabs(String[] T) {
        //Write your code here
    	HashSet<Integer> set = new HashSet<>();
    	for(int i=0;i<T.length;i++) {
    		String str = T[i];
    		if(str.equals("END")) {
    			set.clear();
    		}
    		else {
    			int a = Integer.parseInt(str);
    			if(!set.contains(a)) {
    				set.add(a);
    			}
    			else {
    				set.remove(a);
    			}
    		}
    		
    	}
    	return set.size();
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] T = new String[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.next();
        }
        System.out.println(open_closeTabs(T));
    }

}
