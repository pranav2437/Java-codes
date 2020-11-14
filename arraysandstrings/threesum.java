package arraysandstrings;

import java.util.*;

class threesum{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        System.out.print(threeSum(nums));
    }

    // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array
	 // It should return an required output
	 public static List<List<Integer>> threeSum(int[] arr) {
		 List<List<Integer>> res = new ArrayList<>();
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++) {
			 int l =i+1;
			 int r=arr.length-1;
			 while(l<r) {
				 int target=0-arr[i];
				 if(arr[l]+arr[r]==target) {
					 List<Integer> list = new ArrayList<>();
					 list.add(arr[i]);
					 list.add(arr[l]);
					 list.add(arr[r]);
					 res.add(list);
					 
					 while(arr[l]==arr[l+1]) {
						 l++;
					 }
					 l++;
					 while(arr[r]==arr[r-1]) {
						 r--;
					 }
					 r--;
					 }
				 else if(arr[l]+arr[r]>target) {
					 while(arr[r]==arr[r-1]) {
						 r--;
					 }
					 r--;
				 }
				 else {
					 while(arr[l]==arr[l+1]) {
						 l++;
					 }
					 l++;
				 }
			 }
			 while(i+1 < arr.length && arr[i]==arr[i+1]) {
				 i++;
			 }
			 
		 }
		 return res;
	 }
}
