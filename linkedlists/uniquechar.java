package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;

class uniquechar {

    public static void uniqueChar(char[] str){
	 // Write your code here
    	Queue<Character> q = new LinkedList<>();
    	HashMap<Character, Integer> map = new HashMap<>();
    	char[] res = new char[str.length];
    	for(int i=0;i<str.length;i++) {    		
    		if(!map.containsKey(str[i])) {
    			map.put(str[i],1);   
    			q.add(str[i]);
    		}
    		else {
    			map.put(str[i],map.get(str[i])+1);
    		}
    		
    		if(!q.isEmpty() && map.get(q.peek())==1) {
    			res[i]=q.peek();
    		}
    		else if(map.get(q.peek())>1) {
    			while(!q.isEmpty() && map.get(q.peek())>1) {
    				q.remove();
    			}
    			if(!q.isEmpty()) {
    				res[i]=q.peek();
    			}
    			else {
    				
    				res[i]='0';
    			}
    		}
    	}
    	
    	
    	for(int j=0;j<res.length;j++) {
    		if(res[j]=='0') {
    			System.out.print("-1" + " ");
    		}
    		else
    		System.out.print(res[j] + " ");
    	}
	       
    }








    //Dont make changes here
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        	 
            int n=sc.nextInt();
            char ch[]=new char[n];

            for (int i=0; i<n;i++){
                ch[i]=sc.next().charAt(0);
                
            }
            uniqueChar(ch);


        

    }

}