package hashmap_heaps;

import java.io.*;
import java.util.*;

public class bazookatest {
	
	public static boolean ispalin(String a) {
		int n = a.length();
		String b ="";
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
           return true;
        }
        return false;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
	 	 int n = sc.nextInt();
	 	 String[] str = new String[n];
	 	 for(int i=0;i<n;i++) {
	 		 str[i] = sc.next();
	 	 }
	 	 int count =0;
	 	 for(int i=0;i<str.length;i++) {
	 		 String s1 = str[i];
	 		 for(int j=i+1;j<str.length;j++) {
	 			 String s2 = str[j];
	 			 String s3 = s1+s2;
	 			 String s4 = s2+s1;
	 			 if(ispalin(s3)) {
	 				 count++;
	 			 }
	 			 if(ispalin(s4)) {
	 				 count++;
	 			 }
	 		 }
	 	 }
	 	 System.out.println(count);
	 	 
    }
}