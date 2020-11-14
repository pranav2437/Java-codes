package arraysandstrings;

import java.util.*;

class majorityelement {

    public static int majorityElement(int[] arr) {
        //Write your code here
    	int m=arr[0];
    	int count=1;
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]!=m) {
    			count--;
    			if(count==0) {
    				count++;
    				m=arr[i];
    			}
    			
    		}
    		else {
    			count++;
    		}
    	}
    	return m;
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
}
