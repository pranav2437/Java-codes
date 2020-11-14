package arraysandstrings;

import java.util.*;
/*
 * 1. You will be given coordinates as an array wherein, x,y is written as i,a[i]
2. So two endpoints of vertical line i is at (i, a[i]) and (i, 0)
3. You need to find two lines, which together along with x-axis forms a container, 
such that the container contains the most water
 */
public class containerwithmostwater {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] height= new int[n];
        for(int i=0;i<n;i++){
            height[i]=scn.nextInt();
        }
        System.out.print(maxArea(height));
	 }
	 
   	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array of heights
	 // It should return required output.	  

	 public static int maxArea(int[] height) {
       //Write your code here
		 int start=0;
		 int end=height.length-1;
		 int quantity=0;
		 while(start<end) {
			 int val1= height[start];
			 int val2 = height[end];
			 int h=0;
			 if(val1>=val2) {
				 h=val2;
				 
				 int volume = h*(end-start);
				 if(volume>quantity) {
					 quantity=volume;
				 }
				 end--;
			 }
			 else {
				 h=val1;
				 int volume = h*(end-start);
				 if(volume>quantity) {
					 quantity=volume;
				 }
				 start++;
			 }
			 
		 }
		 return quantity;
	 }
}
