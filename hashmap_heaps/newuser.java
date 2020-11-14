package hashmap_heaps;

import java.util.*;

public class newuser {
    
    // This is a functional problem. You have to complete this function.
    // It takes as input a string array.
    // It should print "Verified" if the username doesn't exists already, 
    //else should print the username with a number added to the end of the username.
    
    private static void solve(String[] str) {
        // write your code here.
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<str.length;i++) {
        	String s=str[i];
        	if(!map.containsKey(s)) {
        		map.put(s, 1);
        		System.out.println("Verified");
        	}
        	else {
        		String s1 = str[i] + map.get(s);
        		System.out.println(s1);
        		map.put(s, map.get(s)+1);
        	}
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Length of the array
        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        
        solve(arr);
        
        
    }

}