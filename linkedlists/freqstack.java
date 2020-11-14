package linkedlists;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class freqstack{
private static class FreqStack {
    // Write your code 
	public static int max=0;
	public static HashMap<Integer,Integer> m1 ;
	public static HashMap<Integer,Stack<Integer>> m2 ;
	
    public FreqStack() {
    	m1= new HashMap<>();
    	m2 = new HashMap<>();
    }

    public static void push(int x) {
    	if(!m1.containsKey(x)) {
    		m1.put(x, 1);
    	}
    	else {
    		m1.put(x, m1.get(x)+1);
    	}
    	if(max<m1.get(x)) {
    		max = x;
    	}
    	if(!m2.containsKey(max)) {
    		Stack<Integer> st = new Stack<>();
    		st.push(x);
    		m2.put(max,st);
    	}
    	else {
    		int pos = m1.get(x);
    		m2.get(pos).push(x);
    	}
    	
	  }

    public static int pop() {
    	int val = m2.get(max).pop();
    	m1.put(val, m1.get(val)-1);
    	if(m2.get(max).isEmpty()) {
    		max--;
    	}
    	return val;
    }
}
     






	  //Dont make changes here
	  public static void main(String[] args){
    	   FreqStack fq=new FreqStack();
    	   Scanner sc=new Scanner(System.in);
    	   int n=sc.nextInt();
    	   int i=0;
    	   while(i!=n){
    	  	   int q=sc.nextInt();
    	  	   if(q==1){
	  	  	  i++;
    	  	  	   fq.push(sc.nextInt());
    	  	   }
    	  	   else if(q==2)System.out.println( fq.pop());
    	  	   i++;
    	   }
     	  }
    

}
