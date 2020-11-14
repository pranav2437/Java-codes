package hashmap_heaps;

import java.util.*;

public class completetask {

	 public static void completeTask(int n, int m, int[] compl) {
	 	 //Write your code here	 
		 ArrayList<Integer> s1 = new ArrayList<>();
		 ArrayList<Integer> s2 = new ArrayList<>();
		 HashSet<Integer> set = new HashSet<>();
		 for(int i=1;i<=n;i++) {
			 set.add(i);
		 }
		 for(int i=0;i<m;i++) {
			 if(set.contains(compl[i])) {
				 set.remove(compl[i]);
			 }
		 }
		 int ctr=1;
		 for(Integer it : set) {
			 if(ctr%2!=0) {
				 s1.add(it);
			 }
			 else {
				 s2.add(it);
			 }
			 ctr++;
		 }
		 
		for(Integer i:s1) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(Integer i:s2) {
			System.out.print(i+" ");
		}
		 
		 
	 }
	 //Don't make changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int m = scn.nextInt();
	 	 int[] num = new int[m];
	 	 for (int i = 0; i < m; i++) {
	 	 	 num[i] = scn.nextInt();
	 	 }
	 	 completeTask(n, m, num);
	 }
}
