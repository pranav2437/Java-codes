package hashmap_heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class pepman {

	 public static void main(String[] args) {
	 	 // write your code here
		 Scanner sc=new Scanner(System.in);
		 String s = sc.next();
		 int x=0;
		 int y=0;
		 HashMap<Character,Integer> map = new HashMap<>();
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c,1);
			 }
			 else {
				 map.put(c,map.get(c)+1);
			 }
		 }
		 int freq=0;
		 Set<Character> keys = map.keySet();
		 for(int k:keys) {
			 int pos = k-'a' +1;
			 if(map.containsKey(k)) {
				  freq=map.get(k); 
			 }
			 
			 if(pos%2==0 && freq%2==0) {
				 x++;
			 }
			 else if(pos%2!=0 && freq%2!=0) {
				 y++;
			 }
			 else {
				 continue;
			 }
		 }
		 if((x+y)%2==0) {
			 System.out.println("EVEN");
		 }
		 else {
			 System.out.println("ODD");
		 }
	 }
}
