package hashmap_heaps;

import java.util.*;
import java.io.*;

public class isfreqequal {


	 public static boolean isFrequencyEqual(String str) {
	 	 //Write your code here	
		 HashMap<Character,Integer> map = new HashMap<>();
		 for(int i =0;i<str.length();i++) {
			 char c= str.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c,1);
			 }
			 else {
				 map.put(c,map.get(c)+1);
			 }
		 }
		 
		 HashMap<Integer,Integer> freq = new HashMap<>();
		 for(Character k:map.keySet()) {
			 if(!freq.containsKey(map.get(k))) {
				 freq.put(map.get(k),1);
			 }
			 else {
				 freq.put(map.get(k),freq.get(map.get(k))+1);
			 }
		 }
		 int ctr=0;
		 if(freq.size()==1) {
			 return true;
		 }
		 for(int k:freq.keySet()) {
			 if(freq.get(k)==1) {
				 ctr++;
			 }
			 		 
		 }
		 if(ctr==1) {
			 return true;
		 }
		 int max=Integer.MIN_VALUE;
		 int min = Integer.MAX_VALUE;
		 for(Character k:map.keySet()) {
			 if(map.get(k)>max) {
				 max=map.get(k);
			 }
			 if(map.get(k)<min) {
				 min=map.get(k);
			 }
		 }
		 for(Character k:map.keySet()) {
			 map.put(k, map.get(k)-min);
		 }
		 HashMap<Integer,Integer> hm = new HashMap<>(); //this case is wrong
		 for(Character k : map.keySet()) {              //remove one of the most occurent one
			 if(!hm.containsKey(map.get(k))) {
				 hm.put(map.get(k),1);
			 }
			 else {
				 hm.put(map.get(k),hm.get(map.get(k))+1);
			 }
		 }
		 if(hm.size()>2) {
			 return false;
		 }
		 else {
			 for(Integer k:hm.keySet()) {
				 if(hm.get(k)==1) {
					 return true;
				 }
			 }
		 }
		 return false;
		 
	 }

	 //Don't make any changes here
	 public static void main(String[] args) throws IOException {
	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	 String s = br.readLine();
	 	 boolean bl = isFrequencyEqual(s);
	 	 System.out.println(bl);
	 }
}
