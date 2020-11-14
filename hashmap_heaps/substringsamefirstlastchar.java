package hashmap_heaps;

import java.util.Scanner;
import java.util.*;

public class substringsamefirstlastchar {

	 public static int count(String str) {
	 //Write your code here
		 HashMap<Character,Integer> map = new HashMap<>();
		 int count=0;
		 for(int i=0;i<str.length();i++) {
			 char c= str.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c, 1);
			 }
			 else {
				 count+=map.get(c);
				 map.put(c, map.get(c)+1);
			 }
		 }
		 return count+str.length();

	 }

	 //Don't write your code here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String str = scn.next();
	 	 int ans = count(str);
	 	 System.out.println(ans);
	 }

}
