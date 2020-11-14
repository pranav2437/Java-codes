package trees;

import java.io.IOException;
import java.util.*;
/*
 * return 1 if given array represents inorder of a bst
 */
public class inorderofbst{
	
		public static int isinorder(int[] arr) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<=arr[i-1]) {
					return 0;
				}
			}
			return 1;
		}

	 public static void main(String[] args) throws IOException {

	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 int[] ar = new int[n];
	 	 for (int i = 0; i < ar.length; i++) {
	 	 	 ar[i] = s.nextInt();
	 	 }
	 	 
	 	 System.out.println(isinorder(ar));

	 }

}
