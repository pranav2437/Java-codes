package linkedlists;

import java.util.*; 

class sortstack
{ 
	 // This function return the sorted stack 
	 public static Stack<Integer> sortstack(Stack<Integer> input) 
	 { 
		 Stack<Integer> st = new Stack<>();
		 int[] arr = new int[input.size()];
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=input.peek();
			 input.pop();
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 if(st.isEmpty()) {
				 st.push(arr[i]);
				 
				 continue;
			 }
			 if(arr[i]<st.peek()) {
				 while(!st.empty() && st.peek()>arr[i]) {
					 input.push(st.peek());
					 st.pop();
				 }
				 st.push(arr[i]);
				 while(!input.isEmpty()) {
					 st.push(input.pop());
				 }
				 
			 }
			 else {
				 st.push(arr[i]);
			 }
		 }
		 return st;
	 } 
	 





	 // Dont make changes here 
	 public static void main(String args[]) 
	 { 
	 	 Stack<Integer> input = new Stack<Integer>(); 
	 	 Scanner sc=new Scanner(System.in); 
                int n=sc.nextInt();
	 	 for(int i=0;i<n;i++)input.push(sc.nextInt());
                
                Stack<Integer> res=sortstack(input); 
	 	 
	 	 while (!res.empty()) 
	 	 { 
	 	 	 System.out.print(res.pop()+" "); 
	 	 } 
	 } 
}
