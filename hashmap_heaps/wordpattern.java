package hashmap_heaps;

import java.util.*;

public class wordpattern {

	 public static void main(String[] args) {
	 	 Scanner scn= new Scanner(System.in);
	 	 String pattern= scn.nextLine();
	 	 String str= scn.nextLine();
	 	 System.out.println(wordPattern(pattern,str));
	 }
   	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 strings
	 // It should return a boolean value

	 static boolean wordPattern(String pattern, String str) {    
	 //Write your code here
		 HashMap<Character,String> map = new HashMap<>();
		 String[] arr = str.split(" ");
		 for(int i=0;i<pattern.length();i++) {
			 char c=pattern.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c, arr[i]);
			 }
			 else {
				 if(!arr[i].equals(map.get(c))) {
					 return false;
				 }
				 else {
					 continue;
				 }
			 }
		 }
		 HashMap<String,Character> map2 = new HashMap<>();
		 for(int i=0;i<arr.length;i++) {
			 String s=arr[i];
			 if(!map2.containsKey(s)) {
				 map2.put(s, pattern.charAt(i));
			 }
			 else {
				 if(pattern.charAt(i)!=map2.get(s)) {
					 return false;
				 }
				 else {
					 continue;
				 }
			 }
		 }
		 return true;
	 }
	 
}
