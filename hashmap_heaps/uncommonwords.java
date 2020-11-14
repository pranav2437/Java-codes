package hashmap_heaps;

import java.util.*;

public class uncommonwords {
	 public static String[] uncommonFromSentences(String A, String B) {
	 //Write your code here
		 HashMap<String,Integer> map = new HashMap<>();
		 String[] a = A.split(" ");
		 String[] b= B.split(" ");
		 
		 for(int i=0;i<a.length;i++) {
			 if(!map.containsKey(a[i])) {
				 map.put(a[i], 1);
			 }
			 else {
				 map.put(a[i],map.get(a[i])+1);
			 }
		 }
		 for(int i=0;i<b.length;i++) {
			 if(!map.containsKey(b[i])) {
				 map.put(b[i], 1);
			 }
			 else {
				 map.put(b[i],map.get(b[i])+1);
			 }
		 }
		 ArrayList<String> res = new ArrayList<>();
		 for(String k:map.keySet()) {
			 if(map.get(k)==1) {
				 res.add(k);
			 }
		 }
		 String[] ans = res.toArray(new String[res.size()]);
		 return ans;
		 
	 	 
	 }
	 //Don't make any changes here
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 String A = s.nextLine();
	 	 String B = s.nextLine();

	 	 String ans[] = uncommonFromSentences(A, B);
	 	 Arrays.sort(ans);
	 	 for (int i = 0; i < ans.length; i++) {
	 	 	 System.out.print(ans[i] + " ");
	 	 }

	 }
}
