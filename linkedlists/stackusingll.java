package linkedlists;

import java.util.Scanner;

class stackusingll{
/*
The structure of the node of the stack is
class StackNode
{
	   int data;
	   StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
*/
static class MyStack {
   // Note that top is by default null
   // in Java
     StackNode top,head;
   public MyStack()
   {
       this.top = null;
       this.head = null;
   }
// Comlete the functions
   void push(int a) 
   {
	   if(top==null) {
		   StackNode nn = new StackNode(a);
		   top=nn;
		   head=nn;
		   
	   }
	   else {
		   StackNode nn = new StackNode(a);
		   nn.next=head;
		   nn.next=top;
		   head=nn;
		   top=nn;
	   }
   }
   
   int pop() 
   {
	   int val=0;
	   if(top==null) {
		   return -1;
	   }
	   else {
		    val=top.data;
		   head=head.next;
		   top=top.next;
	   }
	   return val;
	   
   }
   
}
 









// Dont make changes here  
   public static void main(String[] args){
	   	   MyStack stack=new MyStack();
	     	    Scanner sc=new Scanner(System.in);
	     	    int n=sc.nextInt();
	     	    int i=0;// number of operationsto be performed
	     	    while(i!=n){
	     	   	    int q=sc.nextInt();
	     	   	    if(q==1){
	     	   	   	   stack.push(sc.nextInt());
	     	   	    }
	     	   	    else if(q==2)System.out.println( stack.pop());
	     	   	    i++;
	     	    }
	      }
   
   
   static class StackNode
   {
   	   int data;
   	   StackNode next;
       StackNode(int a)
       {
          data = a;
          next = null;
       }
   }
}
