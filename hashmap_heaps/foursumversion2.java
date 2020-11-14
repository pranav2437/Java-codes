package hashmap_heaps;

import java.util.*;

public class foursumversion2 {

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input the head of the linked list.
	 // It should return the head of the modified list.

	 public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	 	 //write your code here
		 HashMap<Integer,Integer> map = new HashMap<>();
		 int count=0;
		 for(int i=0;i<A.length;i++) {
			 for(int j=0;j<B.length;j++) {
				 int val=A[i]+B[j];
				 if(!map.containsKey(val)) {
					 map.put(val,1);
				 }
				 else {
					 map.put(val, map.get(val)+1);
				 }
			 }
		 }
		 for(int i=0;i<C.length;i++) {
			 for(int j=0;j<D.length;j++) {
				 int comp=0-C[i]-D[j];
				 if(map.containsKey(comp)) {
					 count+=map.get(comp);
				 }
				 else {
					 continue;
				 }
			 }
		 }
		 return count;
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 int n = sc.nextInt();
	 	 
	 int []arr1=new int[n];
	 int []arr2=new int[n];
	 int []arr3=new int[n];
	 int []arr4=new int[n];
	 
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr1[i] = sc.nextInt();
	 	 }
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr2[i] = sc.nextInt();
	 	 }
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr3[i] = sc.nextInt();
	 	 }
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr4[i] = sc.nextInt();
	 	 }

	 	 System.out.println(fourSumCount(arr1, arr2, arr3, arr4));

	 }

}
