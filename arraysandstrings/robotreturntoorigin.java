package arraysandstrings;

import java.util.Scanner;

public class robotreturntoorigin {

	 public static boolean judgeCircle(String s) {
	 	 // Write code here
		 int x=0;
		 int y=0;
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(c=='U') {
				 y++;
			 }
			 else if(c=='D') {
				 y--;
			 }
			 else if(c=='R') {
				 x++;
			 }
			 else {
				 x--;
			 }
		 }
		 if(x==0 && y==0) {
			 return true;
		 }
		 return false;
	 }

	 // Don't make any changes here.
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 String str = s.nextLine();
	 	 System.out.println(judgeCircle(str));

	 }
}
