package linkedlists;

import java.util.*;
public class ngecircular {

    public static int[] nextGreaterCircularInManner(int[] nums) {
      Stack<Integer> st = new Stack<>();
      int[] res = new int[nums.length];
      st.push(0);
      for(int i=1;i<2*nums.length-1;i++) {
    	  int j=i%nums.length;
    	  while(st.size()>0 && nums[st.peek()]<nums[j]) {
    		  res[st.peek()]=nums[j];
    		  st.pop();
    	  }
    	  st.push(j);
      }
      for(int i=0;i<res.length;i++) {
    	  if(res[i]==0) {
    		  res[i]=-1;
    	  }
    	  
      }
      return res;
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] res=nextGreaterCircularInManner(nums);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
}
