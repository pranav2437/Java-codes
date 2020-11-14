package hashmap_heaps;

import java.util.*;

public class winnerofelection {

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 String[] str = new String[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 str[i] = scn.next();
	 	 }
	 	 String[] res = func(str);
	 	 System.out.print(res[0]);
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written
	 // This function takes as input an array of string
	 // It should return name of winning candidate

	 public static String[] func(String[] arr) {

	 	 // Write your code here
		 HashMap<String,Integer> map = new HashMap<>();
		 for(int i=0;i<arr.length;i++) {
			 String s =arr[i];
			 if(!map.containsKey(s)) {
				 map.put(s, 1);
			 }
			 else {
				 map.put(s, map.get(s)+1);
			 }
		 }
		 int max=0;
		 String ans="";
		 for(String k:map.keySet()) {
			 if(map.get(k)>max) {
				 max=map.get(k);
				 ans=k;
			 }
		 }
		 
		 String[] res = new String[1];
		 res[0]=ans;
		 return res;

	 }
}
