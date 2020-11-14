package linkedlists;

import java.util.*;
public class nextgreaternode {
	  /* Structure of ListNode
	  	  ListNode {
	  	        int val;
	  	        ListNode next;
	  	        ListNode(int x) { val = x; }
	  	    }
	  */
	   public static int[] nextLargerNodes(ListNode head) {
	  // Write your code here 
		   ListNode temp=head;
		   Stack<Integer> st=new Stack<>();
		   int size=0;
		   while(temp!=null) {
			   size++;
			   temp=temp.next;
		   }
		   int res[] = new int[size];
		   int nums[] = new int[size];
		   ListNode nn=head;
		   int ctr=0;
		   while(nn!=null) {
			   nums[ctr]=nn.val;
			   ctr++;
			   nn=nn.next;
		   }
		   
		   st.push(0);
		   for(int i=1;i<size;i++) {
			   while(st.size()>0 && nums[st.peek()]<nums[i]) {
		    		  res[st.peek()]=nums[i];
		    		  st.pop();
		    	  }
		    	  st.push(i);
		   }
		   
		   return res;
		   }
		   
		  
		   
		   
	  
	  

	  // Dont make changes here
	  public static void main(String[] args) {
	  	  // TODO Auto-generated method stub
	  	  Scanner sc = new Scanner(System.in);
	  	  int size=sc.nextInt();
	  	  int headval=sc.nextInt();
	  	  ListNode head=new ListNode(headval);
	  	  ListNode tail=head;
	  	  for(int i=1;i<size;i++){
	  	  	  ListNode curr=new ListNode(sc.nextInt());
	  	  	  tail.next=curr;
	  	  	  tail=curr;
	  	  }
	  	  int[] res=nextLargerNodes(head);
	  	  for(int i=0;i<size;i++)System.out.print(res[i]+" ");
	  }
	  static class ListNode {
	        int val;
	        ListNode next;
	        ListNode(int x) { val = x; }
	    }

}
