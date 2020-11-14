package linkedlists;

import java.util.*;
import java.util.Scanner;

public class largestareahistogram{
    public static int maxRectArea(int[] ht) {
       //write your code here
    	Stack<Integer> st = new Stack<>();
    	st.push(0);
    	int maxarea = Integer.MIN_VALUE;
    	for(int i=1;i<ht.length;i++) {
    		int val=ht[i];
    		while(!st.isEmpty()) {
    			int topind=st.peek();
    			int topval = ht[topind];
    			if(topval>val) {
    				int rb=i;
    				st.pop();
    				int lb=-1;
    				if(!st.empty()) {
    					lb=st.peek();
    				}
    				int area = topval*(rb-lb-1);
    				if(area>maxarea) {
    					maxarea=area;
    				}
    			}
    			else {
    				break;
    			}
    		}
    		st.push(i);
    	}
    	int rb=ht.length;
    	while(!st.isEmpty()) {
    		int topind = st.peek();
    		st.pop();
    		int h = ht[topind];
    		int lb=-1;
    		if(!st.empty()) {
    			lb=st.peek();
    		}
    		int area=h*(rb-lb-1);
    		if(area>maxarea) {
    			maxarea=area;
    		}
    	}
    	return maxarea;
	  }

    

	  public static void main(String[] args) {
	  	  Scanner scn = new Scanner(System.in);
	  	  
	  	  int h=scn.nextInt();
	  	  int height[]=new int[h];
	  	  for(int i=0;i<h;i++){
	  	  	  height[i]=scn.nextInt();
	  	  }
	  	  System.out.println(maxRectArea(height));
	  }
}
