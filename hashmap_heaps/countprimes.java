package hashmap_heaps;

import java.util.*;

public class countprimes {

    // This is a functional problem. You have to complete this function.
    // It takes as input N. It should return the count of prime numbers less
    // than N.
    public static int countPrimes(int n) {
        // write your code here.
    	int count=0;
    	boolean[] arr = new boolean[n+1];
    	for(int i=0;i<n;i++) {
    		arr[i]=true;
    	}
    	arr[0]=false;
    	arr[1]=false;
    	for(int i = 2; i*i <=n; i++) 
        { 
             
            if(arr[i] == true) 
            { 
                 
                for(int j = i*i; j <= n; j += i) 
                    arr[j] = false; 
            } 
        }
    	for(int i=0;i<n;i++) {
    		if(arr[i]==true) {
    			count++;
    		}
    	}
    	return count;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(countPrimes(N));

    }

}
