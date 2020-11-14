package hashmap_heaps;

import java.util.Scanner;
import java.util.*;

public class greatestsmalleronleft {
	public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 
	 	 
	 	 int n = sc.nextInt();
	 	 int[] arr = new int[n];
	 	 int[] res = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }
	 	 TreeSet<Integer> map = new TreeSet<>();
	 	 for(int i=0;i<n;i++) {
	 		map.add(arr[i]);
	 		 if(map.lower(arr[i])==null) {
	 			 res[i]=-1;
	 		 }
	 		 else {
	 			 
	 			 res[i]=map.lower(arr[i]);
	 		 }
	 	 }
	 	 for(int i=0;i<n;i++) {
	 		 System.out.println(res[i]);
	 	 }
	}
}
