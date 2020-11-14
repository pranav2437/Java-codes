package hashmap_heaps;

import java.util.*;
class tripletswithsum0
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print(findTriplets(arr,n));
    }
     	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and n length of array.
	 // It should return a boolean value.
	 public static boolean findTriplets(int arr[] , int n)
       {
		 Arrays.sort(arr);
		 
		 
           //Write your code here
		 for(int i=0;i<arr.length;i++) {
			 int l=i+1;
			 int r=arr.length-1;
			 int comp = 0-arr[i];
			 while(l<r) {
				 if(arr[l]+arr[r]==comp) {
					 return true;					
					 }				 
				 
				 else if(arr[l]+arr[r]>comp) {
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
		 }
		 return false;
       }
}
