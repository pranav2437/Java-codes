package hashmap_heaps;

import java.util.*;

public class anagrammapping {

	 public static int[] anagramMappings(int[] A, int[] B) {
	 //Write your code here	 	
		 int res[] = new int[B.length];
		 //for duplicacy
//		 HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
//		 for(int i=0;i<A.length;i++) {
//			 if(!map.containsKey(A[i])) {
//				 ArrayList<Integer> arr = new ArrayList<>();
//				 arr.add(i);
//				 map.put(A[i],arr);
//			 }
//			 else {
//				 ArrayList<Integer> arr = new ArrayList<>();
//				 arr=map.get(A[i]);
//				 arr.add(i);
//				 map.put(A[i], arr);
//			 }
//		 }
//		 for(int i=B.length-1;i<=0;i++) {
//			 if(map.containsKey(B[i])) {
//				 res[B.length-1-i]=map.get(B[i]).remove(map.get(B[i]).size()-1);
//			 }
//		 }
//		 return res;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<B.length;i++) {
			 if(!map.containsKey(B[i])) {
				 map.put(B[i], i);
			 }			 
		 }
		 for(int i=0;i<A.length;i++) {
			 
				 res[i]=map.get(A[i]);
			 
		 }
		 return res;
	 }

	 //Don't make any changes here
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 int[] a = new int[n];
	 	 int[] b = new int[n];
	 	 for (int i = 0; i < a.length; i++) {
	 	 	 a[i] = s.nextInt();
	 	 }
	 	 for (int j = 0; j < b.length; j++) {
	 	 	 b[j] = s.nextInt();
	 	 }
	 	 int[] res = anagramMappings(a, b);
	 	 for (int j = 0; j < res.length; j++) {
	 	 	 System.out.print(res[j] + " ");
	 	 }

	 }

}
