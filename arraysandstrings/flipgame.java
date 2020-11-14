package arraysandstrings;

import java.util.*;

public class flipgame {

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String s = scn.next();
	 	 List<String> res = generatePossibleNextMoves(s);
	 	 System.out.print(res);
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a string
	 // It should return required List

	 public static List<String> generatePossibleNextMoves(String s) {
	 	 // Write your code here
		 List<String> res = new ArrayList<>();
		 
		 for(int i=0;i<s.length()-1;i++) {
			 char[] arr=s.toCharArray();
			 if(arr[i]=='+') {
				 if(arr[i+1]=='+') {
					 arr[i]='-';
					 System.out.println(arr[i]);
					 arr[i+1]='-';
					 String st = new String(arr);
					 res.add(st);
				 }
			 }
			 else {
				 continue;
			 }
		 }
		 return res;
	 }
}
