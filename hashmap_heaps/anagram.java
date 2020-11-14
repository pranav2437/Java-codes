package hashmap_heaps;

import java.util.*;

public class anagram{
	  // -----------------------------------------------------
	  // This is a functional problem. Only this function has to be written.
	  // This function takes as input the head of the linked list.
	  // It should return the head of the modified list.

	  public static ArrayList<Integer> findAnagrams(String s, String p) {
	  	  
	  	  //write your code here
		  if(s.length()<p.length()) {
			  ArrayList<Integer> arr = new ArrayList<>();
			  return arr;
		  }
		  ArrayList<Integer> result = new ArrayList<>();
		  HashMap<Character,Integer> P = new HashMap<>();
		  HashMap<Character,Integer> H = new HashMap<>();
		  
		  for(int i=0;i<p.length();i++) {
			  char ch = p.charAt(i);
			  if(!P.containsKey(ch)) {
				  P.put(ch,1);
			  }
			  else {
				  P.put(ch,P.get(ch)+1);
			  }
		  }
		  int start =0;
		  int end=0;
		  int mcount=0;
		  for(int i=0;i<p.length();i++) {
			  char ch = s.charAt(i);
			  if(!H.containsKey(ch)) {
				  H.put(ch,1);
			  }
			  else {
				  H.put(ch,H.get(ch)+1);
			  }
			  if(P.containsKey(ch)) {
				  if(P.get(ch)>=H.get(ch)) {
					  mcount++;
				  }
			  }
			  end=i;
		  }
		  if(mcount==p.length()) {
			  result.add(start);
		  }
		  while(end<s.length()-1) {
			  char ch=s.charAt(start);
			  int hfreq = H.get(ch)-1;
			  H.put(ch,hfreq);
			  if(H.get(ch)==0) {
				  H.remove(ch);
			  }
			  int pfreq=0;
			  if(P.containsKey(ch)) {
				  pfreq=P.get(ch);
			  }
			  if(hfreq<pfreq) {
				  mcount--;
			  }
			  ch=s.charAt(end+1);
			  int hfreqend=0;
			  if(H.containsKey(ch)) {
				  hfreqend = H.get(ch);
			  }
			  hfreqend++;
			  H.put(ch, hfreqend);
			  int pfreqend=0;
			  if(P.containsKey(ch)) {
				  pfreqend = P.get(ch);
			  }
			  if(hfreqend<=pfreqend) {
				  mcount++;
			  }
			  start++;
			  end++;
			  if(mcount==p.length()) {
				  result.add(start);
			  }
			  
		  }
		  return result;
		  
	  	  
	  }

	  // -----------------------------------------------------
	  
	  public static void main(String[] args) {
	  	  Scanner scn = new Scanner(System.in);
	  	  String s = scn.next();
	  	  String p = scn.next();
	  	  System.out.println(findAnagrams(s, p));
	  }
}
