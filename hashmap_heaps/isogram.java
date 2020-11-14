package hashmap_heaps;

import java.util.*;

public class isogram {

	 public static boolean isIsogram(String data) {
	 	 //Write your code here	
		 HashMap<Character,Integer> map = new HashMap<>();
		 boolean flag=true;
		 for(int i=0;i<data.length();i++) {
			 char c = data.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c,1);
			 }
			 else {
				 flag=false;
				 break;
			 }
					 
		 }
		 if(flag) {
			 return true;
		 }
		 return false;


	 
	 }

	 //Don't make any changes here
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 String str = s.next();
	 	 System.out.println(isIsogram(str));

	 }
}
