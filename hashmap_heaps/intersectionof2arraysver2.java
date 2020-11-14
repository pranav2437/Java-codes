package hashmap_heaps;

import java.util.*;
class intersectionof2arraysver2{

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums1= new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=scn.nextInt();
        }
        int m= scn.nextInt();
        int[] nums2= new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=scn.nextInt();
        }
        int[] res=intersect(nums1, nums2);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
       	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 arrays and m, n as lengths.
	 // It should return required output.
    public static int[] intersect(int[] nums1, int[] nums2) {
       //Write your code here
    	HashMap<Integer,Integer> map = new HashMap<>();
    	ArrayList<Integer> res = new ArrayList<>();
    	for(int i=0;i<nums1.length;i++) {
    		if(!map.containsKey(nums1[i])) {
    			map.put(nums1[i], 1);
    		}
    		else {
    			map.put(nums1[i],map.get(nums1[i])+1);
    		}
    	}
    	for(int i=0;i<nums2.length;i++) {
    		if(map.containsKey(nums2[i])) {
    			res.add(nums2[i]);
    			int freq = map.get(nums2[i]);
    			freq--;
    			map.put(nums2[i],freq);
    			if(freq==0) {
    				map.remove(nums2[i]);
    			}
    		}
    	}
    	int ans[] = new int[res.size()];
    	if(res.size()==0) {
    		System.out.println();
    	}
    	for(int i=0;i<res.size();i++) {
    		ans[i]=res.get(i);
    	}
    	return ans;
    }
}
