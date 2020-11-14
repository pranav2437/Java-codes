package trees;
import java.util.*;

public class amex {
	
	static void swap(int a,int b) {
		int t=a;
		a=b;
		b=t;
	}

	public static void main(String[] args) {
		int arr[] = {2,3,5,9,4,8,6,5,3,2,1};		
		int i=arr.length-1;
		while(i>0 && arr[i-1]>arr[i]) {
			i--;
		}
		if(i>0) {
			i--;
		}
		
		int pos1 =i;
		int val1 = arr[i];
		i=arr.length-1;
		while(i>=0) {
			if(arr[i]>val1) {
				break;
			}
			i--;
		}
		int pos2 =i;
		int val2 = arr[i];
		arr[pos1]=val2;
		arr[pos2]=val1;
		for(int j=pos1;j<=(arr.length-1-pos1)/2;j++) {
			int t=arr[j];
			arr[j]=arr[arr.length-1-j];
			arr[arr.length-1-j]=t;
		}
		
		//rev(arr,pos1,arr.length-1);
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k] +" ");
		}
		
		
		
	}
	
	
}
