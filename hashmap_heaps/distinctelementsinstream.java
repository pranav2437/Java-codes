package hashmap_heaps;

import java.io.*;
import java.util.*;

public class distinctelementsinstream {
	 public static void print(String[] arr) throws IOException {
	 //  Write your code here
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<arr.length;i++) {
			 String str = arr[i];
			 if(str.charAt(0)=='A') {
				 int val = Character.getNumericValue(str.charAt(2));
				 if(!map.containsKey(val)) {
					 map.put(val, 1);
				 }
				 else {
					 map.put(val, map.get(val)+1);
				 }
			 }
			 else {
				 
				 int val = Character.getNumericValue(str.charAt(2));
				 if(map.size()==0) {
					 System.out.println("0");
					 continue;
				 }
				 if(!map.containsKey(val)) {
					 System.out.println(map.size());
					 continue;
				 }
				 map.put(val, map.get(val)-1);
				 if(map.get(val)==0) {
					 map.remove(val);
				 }
			 }
			 System.out.println(map.size());
		 }
	 	 	 
	 }
	 //Don't make any changes here
	 public static void main(String[] args) throws IOException {
	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	 int n = Integer.parseInt(br.readLine());
	 	 String[] arr = new String[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = br.readLine();
	 	 }

	 	 print(arr);

	 }

	 
	 
}
