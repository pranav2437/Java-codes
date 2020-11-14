package dynamicprogramming;
import java.util.Scanner;

public class longestbitonicsubarr {

	
	public static int lbsa(int[] arr) {
		int[] dp1 = new int[arr.length];
		int[] dp2 = new int[arr.length];
		dp1[0]=1;
		for(int i=1;i<arr.length;i++) {      //dp1 counts length of inc subarray at each pt
			if(arr[i]>arr[i-1]) {
				dp1[i] = dp1[i-1]+1;
			}
			else {
				dp1[i]=1;
			}
		}
		dp2[dp2.length-1]=1;
		for(int i=dp2.length-2;i>=0;i--) {   //dp2 counts length of dec subarray at each pt 
			if(arr[i+1]<arr[i]) {            //or you can say increasing from right
				dp2[i]=dp2[i+1]+1;
			}
			else {
				dp2[i]=1;
			}
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<dp1.length;i++) {
			if(dp1[i]>max1 && dp2[i]>max2) {  //ans will be given by the pt which has max of both arrays
				max1=dp1[i];
				max2=dp2[i];
			}
		}
		return max1+max2-1;                  //as we need to consider the center point only once
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(lbsa(arr));
		
	}
}

