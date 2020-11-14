package hashmap_heaps;

import java.util.*;

public class longestpalindrome {
	 public static int longestPalindrome(String s) {
	 //Write your code here
		 HashMap<Character,Integer> map = new HashMap<>();
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c, 1);
			 }
			 else {
				 map.put(c, map.get(c)+1);
			 }
		 }
		 int length=0;
		 boolean flag=true;
		 for(char k:map.keySet()) {
			 if(map.get(k)%2==0) {
				 length+=map.get(k);
			 }
			 else {
				 if(flag) {
					 length+=map.get(k);
					 flag=false;
				 }
				 else {
					 length+=map.get(k)-1;
				 }
			 }
		 }
		 return length;
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 String str = s.next();
	 	 System.out.println(longestPalindrome(str));

	 }

}
