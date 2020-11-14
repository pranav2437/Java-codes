package hashmap_heaps;

import java.util.*;

public class checkAp{

	 public static boolean checkAP(int[] arr) {
	 	 //Write your code here
		 int min = Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 boolean flag=true;
		 HashSet<Integer> set = new HashSet<>();
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 if(arr[i]>max) {
				 max=arr[i];
			 }
			 set.add(arr[i]);
		 }
		 int d = (max-min)/(arr.length-1);
		 for(int i=1;i<arr.length;i++) {
			 if(!set.contains(min+(i*d))) {
				 flag=false;
			 }
			 else {
				 set.remove(min+(i*d));
				 continue;
			 }
		 }
		 if(!flag) {
			 return false;
		 }
		 return true;



	 }


	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = scn.nextInt();
	 	 	 }
	 	 	 boolean x = checkAP(num);
	 	 	 System.out.println(x);
	 }
}
