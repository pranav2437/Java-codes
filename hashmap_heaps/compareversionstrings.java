package hashmap_heaps;

import java.util.*;

class compareversionstrings {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String version1= scn.next();
        String version2=scn.next();
        System.out.print(compareVersion(version1, version2));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input two strings
	 // It should return required output.	  

	 public static int compareVersion(String version1, String version2) {
	 	 //Write your code here
		 int i=0;
		 int j=0;
		 while(i<version1.length() && j<version2.length()) {
			 char c1=version1.charAt(i);
			 char c2=version2.charAt(j);
			 if(c1==c2) {
				 i+=2;
				 j+=2;
				 continue;
			 }
			 else if(c1>c2) {
				 return 1;
			 }
			 else {
				 return -1;
			 }
		 }
		 
		 
		 if(i>=version1.length()) {
			 return -1;
		 }
		 return 1;
	 }
}
