package arraysandstrings;
import java.util.*;

/*
 * 1. You will be given a circular Array where the index before first index is last index and index after last index is first index 
2. Traversal through the array: if a[i]=k move k steps forward, if a[i]=-k move k steps backward
2. You need to detect if there exists a loop in the array, wherein a loop follows these rules:
a)start and end at the same index and the length > 1
b)movements in a loop must all follow a single direction
 */

class loopinginarray {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        System.out.print(circularArrayLoop(nums));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Don't modify main
	 // This function takes as input an array.
	 // It should return required output.	  

    public static boolean circularArrayLoop(int[] arr) {
	 	 //Write your code here
    	HashSet<Integer> visited = new HashSet<>();
    	int n=arr.length;
    	for(int i=0;i<n;i++) {
    		visited.add(i);
    		int val = arr[i];
    		HashSet<Integer> set = new HashSet<>();
    		set.add(i);
    		boolean flag=true;
    		if(val<0) {
    			flag=false;
    		}
    		int nextindex = val+i;
    		int previndex = i;
    		while(true) {
    			if(nextindex>=n) {
    				nextindex=nextindex%n;
    			}
    			if(nextindex<0) {
    				nextindex=(nextindex%n) +n;
    			}
    			if(nextindex==previndex) {
    				break;
    			}
    			if(flag && arr[nextindex]<0) {
    				break;    				
    			}
    			else if(!flag && arr[nextindex]>0) {
    				break;
    			}
    			if(visited.contains(nextindex)) {
    				if(set.contains(nextindex)) {
    					return true;
    				}
    				break;
    			}
    			else {
    				previndex=nextindex;
    				set.add(nextindex);
    				visited.add(nextindex);
    				nextindex+=arr[nextindex];
    			}
    		}
    	}
    	return false;
    	
	 }
}
