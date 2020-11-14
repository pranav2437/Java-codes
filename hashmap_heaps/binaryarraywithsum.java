package hashmap_heaps;

import java.util.*;

public class binaryarraywithsum {

    // This is a functional problem. You have to complete this function.
    // It takes as input an array A and a sum S.
    // You have to return the number of subarrays with sum S.

    public static int numSubarraysWithSum(int[] A, int S) {
        // write your code here.
    	 HashMap<Integer,Integer> map = new HashMap<>();
         int psum=0;
         int res=0;
         map.put(0, 1);
         for(int i=0;i<A.length;i++) {
        	 psum+=A[i];
        	 if(!map.containsKey(psum)) {
        		 map.put(psum,1);
        	 }
        	 else {
        		 map.put(psum,map.get(psum)+1);
        	 }
        	 int comp=psum-S;
        	 if(map.containsKey(comp)) {
        		 res+=map.get(comp);
        	 }
        	 else {
        		 continue;
        	 }
         }
         return res;
         
         
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for the array.
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            array[i] = n;
        }

        // Taking input for sum.
        int sum = sc.nextInt();

        System.out.println(numSubarraysWithSum(array, sum));

    }

    // Function to print an array. You can use it for debugging purposes.
    // It takes as input the array to be displayed.
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
