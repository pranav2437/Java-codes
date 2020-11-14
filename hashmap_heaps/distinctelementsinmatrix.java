package hashmap_heaps;

import java.util.*;
import java.io.*;

/*
 * find count of distinct elements common to all rows in a 2d array
 */

public class distinctelementsinmatrix {

	 public static int count(int[][] a) {
	 //Write your code here
		 int[] arr = new int[a[0].length];
		 int count=0;
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=a[0][i];
		 }
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<arr.length;i++) {             //first row:base hashmap
			 if(!map.containsKey(arr[i])) {
				 map.put(arr[i], 1);
			 }
			 else {
				 map.put(arr[i],map.get(arr[i])+1);
			 }
		 }
		 for(int i=1;i<a.length;i++) {
			 HashMap<Integer,Integer> temp = new HashMap<>(); 
			 for(int j=0;j<a[0].length;j++) {
				 
				 if(!temp.containsKey(a[i][j])) {         //for every row a temp hashmap
					 temp.put(a[i][j], 1);
				 }
				 else {
					 temp.put(a[i][j],temp.get(a[i][j])+1);
				 }				 
				 
			 }
			 for(int k:temp.keySet()) {                   //compare frequencies in base and temp hashmap
				 int tfreq = temp.get(k);
				 if(map.containsKey(k)) {
					 int mfreq = map.get(k);
					 if(mfreq>tfreq) {                    //replace with the lower one
						 map.put(k, tfreq);
					 }
				 }
			 }
			 for(int k:map.keySet()) {                    //if base hm has some uncommon element remove it
				 if(!temp.containsKey(k)) {
					 map.put(k, 0);
				 }
			 }
			 
		 }
		 for(int k:map.keySet()) {
			 count+=map.get(k);
		 }
		 return count;
	 	 
	 }

	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner in = new Scanner(System.in);
	 	 int n = in.nextInt();
	 	 int a[][] = new int[n][n];
	 	 int i = 0, j = 0;
	 	 for (i = 0; i < n; i++) {
	 	 	 for (j = 0; j < n; j++) {
	 	 	 	 a[i][j] = in.nextInt();
	 	 	 }
	 	 }
	 	 System.out.println(count(a));

	 }

}
