package arraysandstrings;

import java.util.Scanner;
import java.util.*;

class binarysubstrings1ton {
	public static int binarytodec(String str) {
		int res=0;
		int ctr=0;
		for(int i=str.length()-1;i>=0;i--) {
			int val=Character.getNumericValue(str.charAt(i));
			res+=val*Math.pow(2, ctr);
			ctr++;
		}
		return res;
	}
	
	 public static boolean queryString(String s, int n) {
	 //Write your code here	 
//		 HashSet<Integer> set = new HashSet<>();
//		 for(int i=n/2;i<=n;i++) {
//			 set.add(i);
//		 }
//		 int start=0;
//		 int end=1;
//		 int max=n;
//		 while(end<=s.length()) {
//			 if(end==s.length()) {
//				 break;
//			 }
//			 String str=s.substring(start, end);
//			 int val=binarytodec(str);
//			 if(set.contains(val)) {
//				 set.remove(val);
//			 }
//			 if(val<=n) {
//				 end++;
//				 continue;
//			 }
//			 if(val>n) {
//				 start++;
//				 continue;
//			 }
//			 
//		 }
//		 if(set.size()==0) {
//			 return true;
//		 }
//		 return false;
		 for(int i=n/2;i<=n;i++) {
			 String val = Integer.toBinaryString(i);
			 if(s.indexOf(val)!=-1) {
				 continue;
			 }
			 else {
				 return false;
			 }
			 
		 }
		 return true;
		 
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 String str = s.next();
	 	 System.out.println(queryString(str, n));

	 }

}
