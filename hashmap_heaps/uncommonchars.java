package hashmap_heaps;

import java.util.*;

public class uncommonchars {
	 public static void uncommon(String str1, String str2) {
	 //Write your code here	 
		 int n1=0;
		 int n2=0;
		 for(int i=0;i<str1.length();i++) {
			 int val = str1.charAt(i)-'a';
			 n1 = (n1|(1<<val));
		 }
		 for(int i=0;i<str2.length();i++) {
			 int val = str2.charAt(i)-'a';
			 n2 = (n2|(1<<val));
		 }
		 int n = n1^n2;
		 int x=0;
		 while((1<<x)<=n) {
			 if(((1<<x)&n)!=0) {
				 int pos=x;
				 pos+='a';
				 char c = (char)pos;
				 System.out.print(c);
			 }
			 x++;
		 }
	 }

	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 String str1 = sc.next();

	 	 String str2 = sc.next();

	 	 uncommon(str1, str2);

	 }
}
