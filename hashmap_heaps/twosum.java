package hashmap_heaps;
/*
 * 1.Given an array of integers, return indices of the two numbers such that they add
 *  up to a specific target.
2.You may assume that each input would have exactly one solution, and you 
may not use the same element twice.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class twosum {

	 
	 public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {
	 //Write your code here
		 ArrayList<Integer> res = new ArrayList<>();
		 HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		 for(int i=0;i<nums.size();i++) {
			 int key=nums.get(i);
			 if(!map.containsKey(key)) {
				 ArrayList<Integer> ar = new ArrayList<>();
				 ar.add(i);
				 map.put(key, ar);
			 }
			 else {
				 ArrayList<Integer> ar = map.get(key);
				 ar.add(i);
			 }
		 }
		 for(int k:map.keySet()) {
			 int comp=target-k;
			 if(comp==k ) {
				 ArrayList<Integer> ar = map.get(k);
				 res.add(ar.get(0));
				 res.add(ar.get(1));
				 break;
			 }
			 else if(map.containsKey(comp)) {
				 res.add(map.get(k).get(0));
				 res.add(map.get(comp).get(0));
				 break;
			 }
					 
		 }
		 return res;
		 
		 
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 ArrayList<Integer> nums = new ArrayList<Integer>();
	 	 int n = s.nextInt();
	 	 for (int i = 0; i < n; i++) {
	 	 	 nums.add(s.nextInt());
	 	 }
	 	 int target = s.nextInt();
	 	 System.out.println(twoSum(nums, target));

	 }


}
