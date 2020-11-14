package arraysandstrings;

import java.util.Scanner;

public class rotatearraybyksteps {

	 public static void rotate(int[] arr, int k) {
	 	 // Write your code here
		 int[] res = new int[arr.length];
		 int i=0;
		 for(;i<arr.length-k;i++) {
			 res[i+k]=arr[i];
		 }
		 int ctr=0;
		 while(i<arr.length) {
			 res[ctr]=arr[i];
			 i++;
			 ctr++;
		 }
		 for(int j=0;j<arr.length;j++) {
			 System.out.print(res[j] + " ");
		 }

	 }

	 // Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 int k=s.nextInt();
	 	 int[] ar = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 ar[i] = s.nextInt();
	 	 }
	 	 rotate(ar, k);
	 	
	 }

}
