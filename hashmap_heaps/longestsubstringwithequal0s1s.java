package hashmap_heaps;

import java.util.*;

public class longestsubstringwithequal0s1s {

	 public static void print(char[] A) {
	 //Writ your code here.
		 int length=0;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 int[] arr = new int[A.length];
		 for(int i=0;i<A.length;i++) {
			 arr[i]=Character.getNumericValue(A[i]);		
			 if(arr[i]==0) {
				 arr[i]=-1;
			 }
		 }
		 
		 int psum=0;
		 map.put(0, -1);
		 for(int i=0;i<arr.length;i++) {
			 psum+=arr[i];
			 if(!map.containsKey(psum)) {
				 map.put(psum, i);
			 }
			 int comp = psum;
			 if(map.containsKey(comp)) {
				 int val = i-map.get(comp);
				 if(val>length) {
					 length=val;
				 }
			 }
		 }
		 System.out.println(length);
	 	 
	 }
	 //Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 String str = s.next();
	 	 char[] ans = str.toCharArray();
	 	 print(ans);
	 }

}
