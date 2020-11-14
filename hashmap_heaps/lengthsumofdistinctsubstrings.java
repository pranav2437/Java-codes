import java.util.*;
 
 class lengthsumofdistinctsubstrings {
 
     public static int sumLength(int[] arr) {
         //Write your code here
    	 int start=0;
    	 int end=1;
    	 int length=0;
    	 HashSet<Integer> set = new HashSet<>();
    	 set.add(arr[start]);
    	 while(start<arr.length && end<=arr.length) {
    		 while(end<arr.length && !set.contains(arr[end])) {
    			 set.add(arr[end]);
    			 end++;
    		 }
    		 int n = end-start;
    		 length+=(n*(n+1))/2;
    		 set.remove(arr[start]);
    		 start++;
    	 }
    	 return length;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = scn.nextInt();
         }
         System.out.println(sumLength(arr));
     }
 }