package hashmap_heaps;

import java.util.*;
import java.io.*;

public class isarraycontiguous {

	  public static boolean isContiguous(int[] arr) {
	  	  //Write your Code here	
		  int max=Integer.MIN_VALUE;
		  int min = Integer.MAX_VALUE;
		  HashSet<Integer> set = new HashSet<>();
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]>max) {
				  max=arr[i];
			  }
			  if(arr[i]<min) {
				  min=arr[i];
			  }
			  if(!set.contains(arr[i])) {
				  set.add(arr[i]);
			  }
			  else {
				  continue;
			  }
		  }
		  if(max-min+1-set.size()==0) {
			  return true;
		  }
		  return false;

	  }

	  //Don't make changes here
	  public static void main(String[] args) throws IOException {
	  	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  	  int n = Integer.parseInt(br.readLine());
	  	  String[] s = br.readLine().split(" ");
	  	  int[] num = new int[n];
	  	  for (int i = 0; i < n; i++) {
	  	  	  num[i] = Integer.parseInt(s[i]);
	  	  }
	  	  boolean bl = isContiguous(num);
	  	  System.out.println(bl);
	  }
}
