package arraysandstrings;

import java.util.*;

import javax.sound.sampled.BooleanControl.Type;

public class longtypedname {
	 public static void main(String[] args) {

	 	 Scanner scn = new Scanner(System.in);
	 	 String name = scn.next();
	 	 String typed = scn.next();
	 	 System.out.println(isLongPressedName(name, typed));

	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 strings
	 // It should return boolean output.
	 public static boolean isLongPressedName(String name, String typed) {
	 	 // Write your code here
		 int i=0;
		 int j=0;
		 while(j<typed.length()) {
			 if(i<name.length() && name.charAt(i)==typed.charAt(j)) {
				 i++;
				 j++;
			 }
			 else if(typed.charAt(j)==typed.charAt(j-1)){
				 while(j<typed.length() && typed.charAt(j)==typed.charAt(j-1)) {
					 j++;
				 }
				 if(j>=typed.length()-1 && i<name.length()-1) {
					 return false;
				 }
			 }
			 else {
				 return false;
			 }
		 }
		 return true;
	 }

}
