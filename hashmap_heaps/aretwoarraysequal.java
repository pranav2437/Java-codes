package hashmap_heaps;

import java.util.*;

public class aretwoarraysequal {

	 public static boolean isTwoArrayEqual(long[] num1, long[] num2) {
	 	 //write your code here	 
		 HashMap<Long,Integer> map = new HashMap<>();
		 for(int i=0;i<num1.length;i++) {
			 if(!map.containsKey(num1[i])) {
				 map.put(num1[i],1);
			 }
			 else {
				 map.put(num1[i],map.get(num1[i])+1);
			 }
		 }
		 for(int i=0;i<num2.length;i++) {
			 if(!map.containsKey(num2[i])) {
				 return false;
			 }
			 else {
				 map.put(num2[i],map.get(num2[i])-1);
				 continue;
			 }
		 }
		 for(Long k:map.keySet()) {
			 if(map.get(k)!=0) {
				 return false;
			 }
			 else {
				 continue;
			 }
		 }
		 return true;
	 

	 }
	 //Don't make changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 long[] num = new long[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = scn.nextLong();
	 	 }
	 	 int m = n;
	 	 long[] arr = new long[m];
	 	 for (int i = 0; i < m; i++) {
	 	 	 arr[i] = scn.nextLong();
	 	 }
	 	 boolean x = isTwoArrayEqual(num, arr);
	 	 System.out.println(x);
	 }

}
