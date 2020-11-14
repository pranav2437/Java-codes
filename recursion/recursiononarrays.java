package recursion;
import java.util.*;

public class recursiononarrays {

	
	
	public static void display(int[] arr, int idx) {
		if(idx==arr.length) {
			return;
		}
		System.out.print(arr[idx] + " ");
		display(arr,idx+1);
	}
	
	public static void displayrev(int[] arr,int idx) {
		if(idx == arr.length) {
			return;
		}
		displayrev(arr,idx+1);
		System.out.print(arr[idx]+ " ");
	}
	
	public static void displayrev2(int[] arr,int idx) {
		if(idx<0) {
			return;
		}
		System.out.print(arr[idx] + " ");
		displayrev2(arr,idx-1);
	}
	
	public static int max(int[] arr,int idx) {
		if(idx==arr.length) {
			return Integer.MIN_VALUE;
		}
		int ans = Math.max(arr[idx],max(arr,idx+1));
		return ans;
	}
	
	public static boolean search(int[] arr, int idx , int key) {
		if(idx==arr.length) {
			return false;
		}
		if(arr[idx]==key) {
			return true;
		}
		return search(arr,idx+1,key);
	} 
	
	public static int firstindex(int[] arr, int idx, int key) {
		if(idx==arr.length) {
			return Integer.MIN_VALUE;
		}
		if(arr[idx] == key) {
			return idx;
		}
		return firstindex(arr,idx+1,key);
	}
	
	public static int lastindex(int[] arr, int idx , int key) {
		if(idx == arr.length) {
			return -1;
		}
		int ans = lastindex(arr,idx+1,key);
		if(ans==-1) {
			if(arr[idx]==key) {
				return idx;
			}
			else {
				return -1;
			}
		}
		else {
			return ans;
		}
	}
	
	public static int[] allindex(int[] arr, int idx, int count, int key) {
		if(idx==arr.length) {
			int[] ans = new int[count];
			return ans;
		}
		if(arr[idx]==key) {
			int[] res = allindex(arr,idx+1,count+1,key);
			res[count] = idx;
			return res;
		}
		else {
			int[] res = allindex(arr,idx+1,count,key);	
			return res;
		}	
		
	}
	
	public static void main(String[] args) {
		int[] arr = {10,25,20,50,70,25};
		display(arr,0);
		System.out.println();
		displayrev(arr,0);
		System.out.println();
		displayrev2(arr,arr.length-1);
		System.out.println();
		System.out.println(max(arr,0));		
		System.out.println(search(arr,0,80));
		System.out.println(firstindex(arr,0,25));
		System.out.println(lastindex(arr,0,25));
		int[] ans = allindex(arr,0,0,25);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
		
		
		
	}
}
