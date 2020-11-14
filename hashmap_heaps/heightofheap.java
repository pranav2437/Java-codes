package hashmap_heaps;

import java.util.*;
import java.lang.*;
import java.io.*;
class heightofheap
 {
	 public static void main (String[] args) throws IOException
	  {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	 	 int n = Integer.parseInt(br.readLine());
	 	 	 String[] s = br.readLine().split(" ");
	 	 	 int x=solve(n);
	 	 	 System.out.println(x);
	 }
     	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and n length of array.
	 // It should return an integer value.
	 public static int ans(int n) {   //gives floor of logbase2(n)
		 int x=0;
		 while((1<<x)<=n) {
			 x++;
		 }
		 return x-1;
	 }
	 private static int solve(int N) {
//Write your code here
		 return ans(N+1);
	 }
}
