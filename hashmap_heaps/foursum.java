package hashmap_heaps;



import java.util.*;

public class foursum {

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input the head of the linked list.
	 // It should return the head of the modified list.

	 public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
		 //input 
	  
	 	 // write your code here
		 ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		 Arrays.sort(nums);
		 for(int i=0;i<nums.length-1;) {
			 for(int j=i+1;j<nums.length-1;) {
				 int l=j+1;
				 int r=nums.length-1;
				 int comp=target-nums[i]-nums[j];
				 while(l<r) {
					 if(nums[l]+nums[r]==comp) {
						 ArrayList<Integer> ar = new ArrayList<>();
						 ar.add(nums[i]);
						 ar.add(nums[j]);
						 ar.add(nums[l]);
						 ar.add(nums[r]);
						 Collections.sort(ar);
						 list.add(ar);
						 while(nums[l]==nums[l+1]) {
							 l++;
						 }
						 l++;
						 while(nums[r]==nums[r-1]) {
							 r--;
						 }
						 r--;
						 
					 }
					 else if(nums[l]+nums[r]>comp) {
						 while(nums[r]==nums[r-1]) {
							 r--;
						 }
						 r--;
					 }
					 else {
						 while(nums[l]==nums[l+1]) {
							 l++;
						 }
						 l++;
					 }
					 
				 }
				 while(j+1<nums.length && nums[j]==nums[j+1]) {
					 j++;
				 }
				 j++;
			 }
			 while(i+1 < nums.length && nums[i]==nums[i+1]) {
				 i++;
			 }
			 i++;
		 }
		 
		 return list;
		 
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 
	 	 int target = sc.nextInt();
	 	 int n = sc.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }
	 	 

	 	 ArrayList<ArrayList<Integer>> ans = fourSum(arr, target);

	 	 for (ArrayList<Integer> a : ans) {
	 	 	 for (int element : a) {
	 	 	 	 System.out.print(element + ",");
	 	 	 }
	 	 	 System.out.println();
	 	 }

	 }

}
