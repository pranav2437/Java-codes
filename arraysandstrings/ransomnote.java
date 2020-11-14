package arraysandstrings;

/*
 * 1.Given an arbitrary ransom note string and another string containing letters from all the magazines
write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

2.Each letter in the magazine string can only be used once in your ransom note.

3.Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
import java.util.Scanner;
import java.util.*;

public class ransomnote {
	 public static boolean canConstruct(String rans, String magazine) {
	 //Write your code here	 
		 HashMap<Character,Integer> map = new HashMap<>();
		 HashMap<Character,Integer> map2 = new HashMap<>();
		 for(int i=0;i<rans.length();i++) {
			 char c=rans.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c, 1);
			 }
			 else {
				 map.put(c, map.get(c)+1);
			 }
		 }
		 for(int i=0;i<magazine.length();i++) {
			 char c=magazine.charAt(i);
			 if(!map2.containsKey(c)) {
				 map2.put(c, 1);
			 }
			 else {
				 map2.put(c, map2.get(c)+1);
			 }
		 }
		 for(char k:map.keySet()) {
			 if(!map2.containsKey(k)) {
				 return false;
			 }
			 else {
				 int rfreq = map.get(k);
				 int mfreq = map2.get(k);
				 if(rfreq>mfreq) {
					 return false;
				 }
			 }
		 }
		 return true;
	 }
	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String s = scn.next();
	 	 String t = scn.next();
	 	 System.out.print(canConstruct(s, t));

	 }

}
