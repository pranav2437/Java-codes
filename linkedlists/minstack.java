package linkedlists;

import java.util.*;
import java.util.Scanner;
public class minstack{
    
    static int minEle=0;
    static Stack<Integer> s=new Stack<>();
    
    //Complete the below 3 functions only
    static int getMin()
    {
    	return minEle;
        }
    static int pop()
    {
    	int val=0;
    	if(!s.isEmpty()) {
    		System.out.println("IN");
    		if(s.peek()<minEle) {
        		minEle = 2*(minEle-s.peek());
        		 val=s.pop();
        		 return val;
        	}
        	else {
        		 val=s.pop();
        		 return val;
        	}
    		
    	}
    	return -1;
    	

    }
    static void push(int x)
    {
    	if(s.isEmpty()) {
    		minEle=x;
    		s.push(x);
    	}
    	if(x>=minEle) {
    		s.push(x);
    	}
    	else {
    		s.push(x+x-minEle);
    		minEle=x;
    	}
    }	 

	 // Dont make changes here    
	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner sc=new Scanner(System.in);
	 	 int n=sc.nextInt();
	 	 int[] query=new int[n];
	 	 for(int i=0;i<n;i++){
	 	 	 query[i]=sc.nextInt();
	 	 }
	 	 int i=0;
	 	 while(i<n){
	 	 	 if(query[i]==1){
	 	 	 	 i++;
	 	 	 	 push(query[i]);
	 	 	 }
	 	 	 else if(query[i]==2){
	 	 	 	 System.out.println(pop());
	 	 	 }
	 	 	 else if(query[i]==3){
	 	 	 	 System.out.println(getMin());
	 	 	 }
	 	 	 i++;
	 	 }
	 }

}
