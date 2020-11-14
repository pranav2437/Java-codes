package arraysandstrings;

import java.util.Scanner;

public class minjumpstoreacharrayend {
	 public static int jump(int[] arr) {
	 //Write your code here
		
	        if (arr[0] == 0) 
	            return -1; 	  
	        int maxReach = arr[0]; 
	        int step = arr[0]; 
	        int jump = 1; 	  
	        for (int i = 1; i < arr.length; i++) 
	        { 
	            if (i == arr.length - 1) 
	                return jump; 
	  
	            maxReach = Math.max(maxReach, i+arr[i]); 	  
	            step--; 
	            if (step == 0) 
	            { 
	                jump++; 	               
	                step = maxReach - i; 
	            } 
	        }
	        return -1;
	 }

	 //Don't male any changes here
	 public static void main(String[] args) {
	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < num.length; i++) {
	 	 	 num[i] = s.nextInt();
	 	 }
	 	 System.out.println(jump(num));
	 }

}
