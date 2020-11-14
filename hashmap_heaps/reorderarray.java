package hashmap_heaps;

import java.util.*;

public class reorderarray {

    public static boolean canReorder(int[] A) {
        // Write your code here
    	HashMap<Integer,Integer> map = new HashMap<>();
    	boolean flag=false;
    	for(int i=0;i<A.length;i++) {
    		if(!map.containsKey(A[i])) {
    			map.put(A[i],1);
    		}
    		else {
    			map.put(A[i],map.get(A[i])+1);
    		}
    	}
    	Set<Integer> keys = map.keySet();
    	List<Integer> list = new ArrayList<Integer>(keys); 
        Collections.sort(list);
    	
    	for(int k:list) {
    		if(k<0) {
    			if(k%2!=0) {
    				return false;
    			}
    			else {
    				if(map.get(k)==0){
        				continue;
        			}
    				if(!map.containsKey(k/2) || map.get(k/2)==0) {
    					return false;
    				}
    				else {
    					map.put(k,map.get(k)-1);
    					map.put(k/2,map.get(k/2)-1);
    					flag=true;    					
    				}
    				
    			}
    		}
    		else if(k==0) {
    			if(map.get(k)==0){
    				continue;
    			}
    			if(map.get(k)%2!=0) {
    				return false;
    			}
    			else {
    				map.put(k,map.get(k)-2);
    				flag=true;
    			}
    		}
    		else {
    			if(map.get(k)==0){
    				continue;
    			}
    			if(!map.containsKey(2*k) || map.get(2*k)==0) {
					return false;
				}
				else {
					map.put(k,map.get(k)-1);
					map.put(2*k,map.get(2*k)-1);
					flag=true;    					
				}
    			
    		}
    	}
    	if(flag) {
    		return true;
    	}
    	return false;
    }
    
    
    
    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        System.out.println(canReorder(a));

    }

}
