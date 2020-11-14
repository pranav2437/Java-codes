package arraysandstrings;

import java.util.*;
import java.util.Scanner;


public class removecomments {
	 public static ArrayList<String> removeComments(String[] source) {
	 //Write your code here	
		 ArrayList<String> list = new ArrayList<>();
		 boolean flag = false;
		 for(int i=0;i<source.length;i++) {
			 String str = source[i];
			 for(int j=0;j<str.length();j++) {
				 char c = str.charAt(j);
				 String st="";
				 if(Character.isLetter(c)) {
					 while(Character.isLetter(c) && flag ==false) {
						 st+=c;					 
					 } 
					 list.add(st);
				 }			 
				 
				 else {
					 if(c=='/') {
						 if(str.charAt(j+1)=='/' && flag==false) {
							 j++;
							 break;
						 }
						 else if(str.charAt(j+1)=='*'){
							 j+=2;
							 while(str.charAt(j)!='*') {
								 j++;
								 flag = true;
							 }
							 j++;
							 flag=false;
							 
						 }
					 }
				 }
			 }
		 }
		 
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 String[] source = new String[n];
	 	 for (int i = 0; i < source.length; i++) {
	 	 	 source[i] = scn.next();
	 	 }

	 	 System.out.println(removeComments(source));

	 }

}
