package arraysandstrings;

import java.util.*;
public class splitarraywtihequalsum{
    
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        System.out.print(splitArray(nums));
    }
   // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array
	 // It should return a boolean value.
        public static boolean splitArray(int[] arr) { 
	 	 	 //Write your code here
        	HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        	int[] psum = new int[arr.length];
        	int p=0;
        	for(int i=0;i<arr.length;i++) {
        		p+=arr[i];
        		psum[i]=p;
        	}
        	
        	int n=arr.length;
        	for(int i=1;i<=n-6;i++) {          //putting possible pre i's sum in hm
        		if(!map.containsKey(psum[i-1])) {
        			ArrayList<Integer> list = new ArrayList<>();
        			list.add(i);
        			map.put(psum[i-1], list);
        		}
        		else {
        			ArrayList<Integer> list = map.get(psum[i-1]);
        			list.add(i);
        			map.put(psum[i-1],list);
        		}
        	}
        	for(int k=n-2;k>=5;k--) {
        		int pks =psum[n-1]-psum[k];  //post k sum
        		ArrayList<Integer> list = new ArrayList<>();
        		if(map.containsKey(pks)) {
        			list=map.get(pks);
        			for(int i:list) {
            			int sum = pks;
            			for(int j=i+2;j<=k-2;j++) {
            				int sij = psum[j-1]-psum[i];
            				int sjk = psum[k-1]-psum[j]  ;
            				if(sij==sjk && sij==sum) {
            					return true;
            				}
            			}
            		}
        		}
        		
        		
        	}
        	return false;
	 }
}
