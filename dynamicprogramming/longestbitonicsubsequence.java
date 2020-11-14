package dynamicprogramming;
import java.util.*;

public class longestbitonicsubsequence {

	public static int lbs(int[] arr) {
		int[] lis = new int[arr.length];
		int[] lds = new int[arr.length];
		lis[0]=1;
		for(int i=1;i<arr.length;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					max = Math.max(max, lis[j]);
				}				
			}
			lis[i]=max+1;
		}
		lds[lds.length-1]=1;
		for(int i=arr.length-2;i>=0;i--) {
			int max = Integer.MIN_VALUE;
			for(int j=lds.length-1;j>i;j--) {
				if(arr[i]>arr[j]) {
					max=Math.max(max, lds[j]);
				}
			}
			lds[i]=max+1;
		}
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=lis[i]+lds[i]-1;         //making lbs dp array by using lis and lds array
		}
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<res.length;i++) {
			if(ans<res[i]) {
				ans=res[i];
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(lbs(arr));
		
	}
}
