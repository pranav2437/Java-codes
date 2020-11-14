package arraysandstrings;

import java.util.Scanner;
class pair{
	String s;
	int val;
}



public class integertoroman {
	 public static String intToRoman(int num) {

	 //Write your code here	 
		 
		 
		 pair p1 = new pair();
		 pair p2 = new pair();
		 pair p3 = new pair();
		 pair p4 = new pair();
		 pair p5 = new pair();
		 pair p6 = new pair();
		 pair p7 = new pair();
		 pair p8 = new pair();
		 pair p9 = new pair();
		 pair p10 = new pair();
		 pair p11 = new pair();
		 pair p12 = new pair();
		 pair p13 = new pair();
		 p1.s="I";
		 p1.val=1;
		 p2.s="IV";
		 p2.val=4;
		 p3.s="V";
		 p3.val=5;
		 p4.s="IX";
		 p4.val=9;
		 p5.s="X";
		 p5.val=10;
		 p6.s="XL";
		 p6.val=40;
		 p7.s="L";
		 p7.val=50;
		 p8.s="XC";
		 p8.val=90;
		 p9.s="C";
		 p9.val=100;
		 p10.s="CD";
		 p10.val=400;
		 p11.s="D";
		 p11.val=500;
		 p12.s="CM";
		 p12.val=900;
		 p13.s="M";
		 p13.val=1000;
		 pair[] arr = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13};
		 
		 
		 int i=arr.length-1;
		 String res="";
		 while(i>=0 && num>0) {
			 while(i>0 && arr[i].val>num) {
				 i--;
			 }
			 res+=arr[i].s;
			 num-=arr[i].val;
			 
		 }
		 return res;
		 
		 

	 }


	 //Don't make any changes here
	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int num = s.nextInt();
	 	 System.out.println(intToRoman(num));

	 }

}
