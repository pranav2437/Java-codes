package hashmap_heaps;

import java.io.*;
import java.util.*;

public class longestsubarraysumdivbyk {
	 
	 public static void print(int n, int[] arr, int k) {
	 //Write your code here	 	
		 HashMap<Integer,Integer> map = new HashMap<>();
		 int length=0;
		 int psum=0;
		 map.put(0, -1);
		 for(int i=0;i<n;i++) {
			 int val=0;
			 psum+=arr[i];
			 val = psum % k;
			 if(psum<0 && psum%k!=0) {
				 val+=k;
			 }
			 if(!map.containsKey(val)) {
				  
				 map.put(val, i);
			 }
			 int comp = val;
			 if(map.containsKey(comp)) {
				 int v = i-map.get(comp);
				 if(v>length) {
					 length=v;
				 }
			 }
		 }
		 System.out.println(length);

	 }
	 //Don't make any changes here.
	 public static void main(String[] args) throws IOException {
	 	 Scanner s=new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = s.nextInt();
	 	 }
	 	 int k = s.nextInt();	 
	 	 print(n, num, k);
	 }

}
