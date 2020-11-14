package arraysandstrings;

import java.util.*;

public class addboldtagstostring {

	 public static String addBoldTag(String s, String[] dict) {
		 	
		 boolean isBold[] = new boolean [s.length()];
		 
		 for(int i=0; i<dict.length; i++) {
			
			 String str = dict[i];
			 
			 int fromIndex = 0;
		 
			 while(fromIndex>-1) {
				 int startIndex = s.indexOf(str, fromIndex);
				 
				 if(startIndex!=-1) {
					 for(int j=startIndex; j<startIndex+dict[i].length(); j++) {
						 isBold[j] = true;
					 }
				 }
				 else {
					 break;
				 }
				 
				 fromIndex = startIndex + 1;
			 }
			 
		 }
		 
		 String result = "";
		 
		 int i=0;
		 
		 while(i<s.length()){
			 if(!isBold[i]) {
				 result = result + s.charAt(i);
				 i++;
			 }
			 else {
				 String temp = "";
				 while(i<s.length() && isBold[i]) {
					 temp += s.charAt(i);
					 i++;
				 }
				 
				 result += "<b>" + temp + "</b>";
			 }
		 }
		 
		 return result;
	 }
	
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String s = scn.next();
	 	 int n = scn.nextInt();
	 	 String[] dict = new String[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 dict[i] = scn.next();
	 	 }
	 	 System.out.println(addBoldTag(s, dict));
	 }
}
