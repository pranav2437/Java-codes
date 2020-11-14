package hashmap_heaps;

import java.util.HashMap;
import java.util.Scanner;

public class subarraywithequal1s0s {

	 public static int countSubArrays(int[] a, int n) {
	 //Write your code here.
		 for(int i=0;i<n;i++) {
			 if(a[i]==0) {
				 a[i]=-1;
			 }
		 }
		 int count =0;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 map.put(0, 1);
		 int psum=0;
		 for(int i=0;i<n;i++) {
			 psum+=a[i];
			 int comp=0-psum;
			 if(!map.containsKey(comp)) {
				 map.put(comp, 1);
			 }
			 else {
				 count+=map.get(comp);
				 map.put(comp, map.get(comp)+1);
			 }
		 }
		 return count;
	 	 
	 }
	 
	 //Don't make any changes here.
	 public static void main(String[] args) {
	 	 // code
	 	 Scanner in = new Scanner(System.in);
	 	 int n = in.nextInt();
	 	 int[] a = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 a[i] = in.nextInt();
	 	 }
	 	 System.out.println(countSubArrays(a, n));

	 }

}
