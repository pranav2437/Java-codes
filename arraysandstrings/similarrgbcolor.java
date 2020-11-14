package arraysandstrings;

import java.util.*;

public class similarrgbcolor {
	
    public static String similarRGB(String color) {
        //Write your code here
    	String[] list = {"00","11","22","33","44","55","66","77","88","99","aa","bb","cc","dd","ee","ff"};
    	String res="#";
    	for(int i=1;i<color.length();i+=2) {
    		String hexval = color.substring(i,i+2);
    		int diff = Integer.MAX_VALUE;
    		String val="";
    		for(String j:list) {
    			int ans = Math.abs(Integer.parseInt(hexval,16)-Integer.parseInt(j,16));
    			if(ans<diff) {
    				diff=ans;
    				val=j;
    			}
    		}
    		res+=val;
    	}
    	return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(similarRGB(sc.next()));
    }

}
