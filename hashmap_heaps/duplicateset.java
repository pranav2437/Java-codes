package hashmap_heaps;

import java.util.*;

public class duplicateset {

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input the head of the linked list.
	 // It should return the head of the modified list.
	 public static boolean containsDuplicate(int[] nums) {
	 	  //write your code here
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<nums.length;i++) {
			 if(!map.containsKey(nums[i])) {
				 map.put(nums[i], 1);
			 }
			 else {
				 return true;
			 }
		 }
		 return false;
	 }
	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 int n = sc.nextInt();

	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }

	 	 System.out.println(containsDuplicate(arr));

	 }

}
