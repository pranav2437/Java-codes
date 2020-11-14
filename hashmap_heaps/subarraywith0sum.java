package hashmap_heaps;

import java.util.*;

public class subarraywith0sum {

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);

	 	 int size = scn.nextInt();

	 	 long[] arr = new long[size];

	 	 for (int j = 0; j < size; j++) {
	 	 	 arr[j] = scn.nextLong();
	 	 }

	 	 zerosumarr(arr);

	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array
	 // Print required output
	 static void zerosumarr(long[] arr) {
	 	 // Write your code here
		 HashMap<Long,Long> map = new HashMap<>();
		 int count=0;
		 Long psum=(long) 0;
		 map.put(psum,(long)1);
		 for(int i=0;i<arr.length;i++) {
			 psum+=arr[i];
			 if(map.containsKey(psum)) {
				 count+=map.get(psum);
				 map.put(psum,map.get(psum)+1);
			 }
			 else {
				 map.put(psum, (long)1);
			 }
			 
		 }
		 System.out.println(count);
	 }
}
