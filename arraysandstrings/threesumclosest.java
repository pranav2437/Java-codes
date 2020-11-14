package arraysandstrings;

import java.util.*;

class threesumclosest {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        System.out.print(threeSumClosest(nums,k));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and an integer 
	 // It should return an integer value.
	 
    public static int threeSumClosest(int[] arr, int target) {
	 	 //Write your code here
    	 Arrays.sort(arr);
    	 int mingap=Integer.MAX_VALUE;
    	 int closestsum=0;
		 for(int i=0;i<arr.length;i++) {
			 int l =i+1;
			 int r=arr.length-1;
			 while(l<r) {
				int gap = target-arr[i]-arr[l]-arr[r];
				if(gap<0) {
					gap*=-1;
				}
				if(gap<mingap) {
					mingap=gap;
					closestsum=arr[i]+arr[l]+arr[r];
				}
				if(gap==0) {
					return closestsum;
				}
					 
				 if(arr[l]+arr[r]>target-arr[i]) {
					 while(arr[r]==arr[r-1]) {
						 r--;
					 }
					 r--;
				 }
				 else if(arr[l]+arr[r]<target-arr[i]) {
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
		 return closestsum;
	 }
}