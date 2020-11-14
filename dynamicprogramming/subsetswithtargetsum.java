package dynamicprogramming;
import java.util.*;

public class subsetswithtargetsum {

	public static int subsetsum(int[] arr,int target) {
		boolean[][] dp = new boolean[arr.length+1][target+1];
		for(int i=0)
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(subsetsum(arr,target));
	}
}
