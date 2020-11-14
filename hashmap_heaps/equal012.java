package hashmap_heaps;

import java.util.*;

public class equal012 {
	public static int fact(int n)
	{
	   int i=1;
       int fact=1;
	    while(i<=n)
	    {
	   	   fact=fact*i;
		   i++;
 	    }
  	      return fact;
	}
	public static int combination(int n,int r)
	{
		int com=fact(n)/(fact(n-r)*fact(r));
		return com;
	}

    public static void equal_012(String line) {
        // Write your code here
    	HashMap<String,Integer> map = new HashMap<>();
    	int n1=0;
    	int n0=0;
    	int n2=0;
    	int total=0;
    	map.put((n1-n0)+"*"+(n2-n1), 1);
    	for(int i=0;i<line.length();i++) {
    		char c=line.charAt(i);
    		if(c=='0') {
    			n0++;
    		}
    		else if(c=='1') {
    			n1++;
    		}
    		else if(c=='2') {
    			n2++;
    		}
    		int del1=n1-n0;
    		int del2=n2-n1;
    		String str = del1+"*"+del2;
    		
    		if(!map.containsKey(str)) {
    			map.put(str,1);    			
    		}
    		else {
    			map.put(str,map.get(str)+1);
    		}
    		
    	}
    	Set<String> keys = map.keySet();
    	
    	for(String k:keys) {
    		if(map.get(k)>1) {
    			int n=map.get(k);
    			total += combination(n,2);
    		}
    		else {
    			continue;
    		}
    	}
    	System.out.println(total);
    	
    }

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        equal_012(sc.next());

    }

}
