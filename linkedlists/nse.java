package linkedlists;

import java.io.*;
import java.util.*;

public class nse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Stack<Integer> st = new Stack<>();
    	Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res = new int[n];
        st.push(arr[n-1]);
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--) {
        	while(!st.isEmpty() && arr[i]<st.peek()) {
        		st.pop();
        	}
        	if(st.isEmpty()) {
        		res[i]=-1;
        	}
        	else {
        		res[i]=st.peek();
        	}
        	st.push(arr[i]);
        }
       
      	  for(int j=0;j<res.length;j++) {
      		  System.out.println(res[j]);
      	  }
    	
    	
    }
}

//
// int[] res = new int[n];
// res[n-1]=-1;
// st.push(arr[n-1]);
// for(int i = n-2; i>=0; i--){
//     int t = st.pop();
//     while(!st.isEmpty() && arr[i]>t){
//         st.push(t);
//         st.pop();
//     }
//     
//     
//     if(st.isEmpty()){
//         res[i]=-1;
//     }
//     else{
//         int temp = st.pop();
//         st.push(temp);
//         res[i]=temp;
//     }
//     
//     
//     st.push(arr[i]);
//     
// }
// 
// for(int j=0;j<n;j++){
//     System.out.print(res[j]);
// }
