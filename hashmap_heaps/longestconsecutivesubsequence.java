package hashmap_heaps;

import java.util.*;

class longestconsecutivesubsequence {

    public static int consecuitveSub(int n, int[] arr) {
       //Write your code here
    	HashMap<Integer,String> map = new HashMap<>();
    	for(int i=0;i<arr.length;i++) {
    		map.put(arr[i],"true");
    	}
    	for(int i=0;i<arr.length;i++) {
    		if(map.containsKey(arr[i]-1)) {
    			map.put(arr[i], "false");
    		}
    	}
    	int ans=0;
    	int length=1;
    	for(int i=0;i<arr.length;i++) {
    		
    		if(map.get(arr[i]).equals("true"));
    		if(map.containsKey(arr[i]+1)) {
    			length++;
    		}
    		if(length>ans) {
    			ans=length;
    		}
    	}
    	return ans;
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(consecuitveSub(n, num));

    }

}
