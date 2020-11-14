package linkedlists;

import java.util.*; 
class leftsmaller { 

	 static void printNearmostLeftSmaller(int arr[], int n) { 
	 // Write your code here
		 Stack<Integer> st = new Stack<>();
		 int[] res = new int[n];
		 st.push(arr[0]);
		 res[0]=-1;
		 for(int i=1;i<n;i++) {
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
     		  System.out.print(res[j] + " ");
     	  }
	 }
	  












	 //Dont make changes here
	 public static void main(String[] args) { 
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[] = new int[n]; 
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
	 	 printNearmostLeftSmaller(arr, n); 
	 } 
}
