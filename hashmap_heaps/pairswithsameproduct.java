package hashmap_heaps;

/*
 * 1. You are given an array of N distinct integers.
2. You have to find two pairs (a, b) and (c, d) in the array such that ab = cd , where a, b, c and d are distinct elements.
3. Note: ab = a*b and cd = c*d.
4. display is a utility function which displays an array, feel free to use it for debugging purposes.
5. main takes input from the users and creates the array.
6. This is a functional problem. 
7. You have to complete the solve function. It takes as input an array. It should return 1 if such a pair is found, else should return -1.
8. Don't change the code of main and display.
 */
import java.util.*;

public class pairswithsameproduct {
    // This is a functional problem. You have to complete this function.
    // It takes as input an array of integers.
    // It should return 1 or -1.

    public static int solve(int[] arr) {
        // write your code here.
    	Arrays.sort(arr);
    	HashSet<Integer> set = new HashSet<>();
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {    			
    			int tar=arr[i]*arr[j];
    			if(set.contains(tar)) {
    				return 1;
    			}
    			else {
    				set.add(tar);
    			}    			
    			
    		}
    	}
    	return -1;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int res = solve(arr);

        if (res == 1) {
            System.out.println("Found");
        } else if (res == -1) {
            System.out.println("Not Found");
        }

    }

}
