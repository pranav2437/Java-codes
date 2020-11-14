package hashmap_heaps;

import java.util.Scanner;

public class numberinwords {
	static String[] got = {"","Thousand ","Million ","Billion "};
	static String[] teens = {" " , "One " , "Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
	static String[] tens = {" "," ","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
	
	public static String f2(int n) {
		if(n==0) {
			return "";
		}
		if(n>=100) {
			return teens[n/100] + "hundered " + f2(n%100);
		}
		else if(n>=20) {
			return tens[n/10] + f2(n%10);
		}
		return teens[n];
	}
	
	public static String f1(int n,int i) {
		if(n==0) {
			return "";
		}
		return f1(n/1000,i+1) + f2(n%1000) + got[i];
	}
	
	public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int n=s.nextInt();
	 	 if(n==0) {
	 		 System.out.println("zero");
	 		 System.exit(0);
	 	 }
	 	 System.out.println(f1(n,0));
}
	
}
