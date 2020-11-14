package arraysandstrings;

import java.util.Scanner;
import java.util.*;

public class missingelement {
	public static int missingelement(int[] arr) {
		
		if(arr.length==1) {
			if(arr[0]==1) {
				return 2;
			}
			else {
				return 1;
			}
		}
		int max = Integer.MIN_VALUE;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=1;i<=max;i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		if(max>=0) {
			return max+1;
		}
		return 1;
	}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println(missingelement(arr));

    }
}
