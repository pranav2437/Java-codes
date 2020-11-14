package arraysandstrings;
import java.util.*;

class nestingarray{

    public static int arrayNesting(int[] nums) {
        //Write your code here
    	int maxlength=0;
    	Set<Integer> s = new HashSet<>();
    	boolean[] visited = new boolean[nums.length];
    	int i=0;
    	
    		while(!visited[i]) {
    			s.add(nums[i]);
    			visited[i]=true;
    			i=nums[i];
    			if(!visited[i]) {
    				continue;
    			}
    			else {
    				int size = s.size();
    				if(size>maxlength) {
    					maxlength=size;
    				}
    				s.clear();
    				while(i<nums.length && visited[i]) {
    					i++;    					
    				}
    				
    			}
    			if(i==nums.length) {
    				break;
    			}
    		}
    		return maxlength;
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayNesting(arr));
    }
}