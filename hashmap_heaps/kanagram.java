package hashmap_heaps;

import java.util.*;

public class kanagram {
	 public static boolean areKAnagrams(String str1, String str2, int k) {
	 	 //Write your code here	 
		 if(str1.length()<str2.length()) {
			 String str = str1;
			 str1=str2;
			 str2=str;
		 }
		 HashMap<Character,Integer> map = new HashMap<>();
		 for(int i=0;i<str1.length();i++) {
			 char c=str1.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c,1);
			 }
			 else {
				 map.put(c, map.get(c)+1);
			 }
		 }
		 for(int i=0;i<str2.length();i++) {
			 char c=str2.charAt(i);
			 if(map.containsKey(c)) {
				 map.put(c,map.get(c)-1);
			 }
			 else {
				 continue;
			 }
		 }
		 int sum=0;
		 for(Character c : map.keySet()) {
			 if(map.get(c)>0) {
				 sum+= map.get(c); 
			 }
			 
		 }
		 if(sum<=k) {
			 return true;
		 }
		 
			 return false;
		 
	 }

	 //Don't make changes here
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 String str1 = s.next();
	 	 String str2 = s.next();
	 	 int k = s.nextInt();
	 	 System.out.println(areKAnagrams(str1, str2, k));

	 }

}
