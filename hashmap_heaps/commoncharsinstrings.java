package hashmap_heaps;

import java.util.*;

public class commoncharsinstrings{

	 public static ArrayList<String> commonChars(String[] A) {
	 //Write your code here	 
		 ArrayList<String> res = new ArrayList<>();
		 HashMap<Character,Integer> map= new HashMap<>();
		 String str=A[0];
		 for(int i=0;i<str.length();i++) {
			 char c=str.charAt(i);
			 if(!map.containsKey(c)) {
				 map.put(c, 1);
			 }
			 else {
				 map.put(c, map.get(c)+1);
			 }
		 }
		 for(int i=1;i<A.length;i++) {
			 String s=A[i];
			 HashMap<Character,Integer> temp = new HashMap<>();
			 for(int j=0;j<s.length();j++) {
				 char c=s.charAt(j);
				 if(!temp.containsKey(c)) {
					 temp.put(c, 1);
				 }
				 else {
					 temp.put(c, temp.get(c)+1);
				 }
			 }
			 for(char k:temp.keySet()) {
				 int tfreq=temp.get(k);
				 if(map.containsKey(k)) {
					 int mfreq = map.get(k);
					 if(mfreq>tfreq) {
						 map.put(k, tfreq);
					 }
				 }
			 }
			 for(char k:map.keySet()) {
				 if(!temp.containsKey(k)) {
					 map.put(k, 0);
				 }
			 }
		 } 
		 for(char k:map.keySet()) {
			 int freq=map.get(k);
			 while(freq--!=0) {
				 String s=k+"";
				 res.add(s);
			 }
		 }
		 Collections.sort(res);
		 return res;
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int n = Integer.parseInt(s.nextLine());
	 	 String[] A = new String[n];
	 	 for (int i = 0; i < A.length; i++) {
	 	 	 A[i] = s.nextLine();
	 	 }

	 	 ArrayList<String> res = commonChars(A);
	 	 Collections.sort(res);
	 	 System.out.println(res);

	 }

}
