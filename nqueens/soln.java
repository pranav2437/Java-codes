1)

import java.util.Scanner;

public class Main{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            
        int n = sc.nextInt();
        char h = sc.next().charAt(0);
        insert(h);

        for (int i = 1; i < n; i++) {
            char ch = sc.next().charAt(0);
            insert(ch);
        }
        
        head = arcv(head);
        display();
        
    }
     

    //---------------------------------------------------------------
    //This is a functional problem. Only this function has to be written.
    // This function should return the head of node after sorting.
    public static Node arcv(Node head) {
        Node vh=null,ch=null,vt=null,ct=null;
        Node tmp = head;
        while(tmp.next!=null){
            if(tmp.data=='a'|| tmp.data == 'e' || tmp.data == 'i' || tmp.data =='o' || tmp.data == 'u'){
                if(vh==null){
                   vh = tmp;
                   vt= tmp;
                   tmp=tmp.next;
                   vt.next=null;
                }
                else{
                   vt.next=tmp;
                   vt=tmp;
                   tmp=tmp.next;
                   vt.next=null;
                }
                
            }
           if(tmp.data!='a'&& tmp.data != 'e' && tmp.data == 'i' && tmp.data =='o' && tmp.data != 'u'){
               if(ch==null){
                   ch = tmp;
                   ct= tmp;
                   tmp=tmp.next;
                   ct.next=null;
                }
                else{
                   ct.next=tmp;
                   ct=tmp;
                   tmp=tmp.next;
                   ct.next=null;
                }
                
               
           }
           
         // tmp=tmp.next; 
           
        }
        if(vt!=null){
            vt.next=ch;
            return vh;
        }
        return ch;
        
        
    }


    
    private static class Node {
        char data;
        Node next;

        public Node(char data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    static Node head;
    static Node tail;
    static int size;

    public static void insert(char data) {

        Node nn = new Node(data, null);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    public static void display() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data+" ");
        }
    }

}

 
 
 

 
 
 
 
 
 
 
 6)
      
      
      HashMap<Integer,Integer> freqmap = new Hashmap<>();
	      Iterator<Integer> c1 = head1.iterator();
	      int ctr = 0;
	      while(c1.hasNext()){
	          int data = (Integer)c1.next();
	          
	          if(!freqmap.containsKey(data))
	                freqmap.put(data,1);
	          else
	                freqmap.put(data, freqmap.get(data)+1);
	          
	          
	      }
	      Iterator<Integer> c2 = head2.iterator();
	      
	      while(c2.hasNext()){
	          int comp = x - (Integer)c2.next();
	              if(freqmap.containsKey(comp)){
	              ctr+= 1;
	          }
	          
	      }
	      return ctr;
 
 
 
 
 
 
 
 
 
 
 
 
 
 nge
 
 import java.util.*;
 import java.io.*;

 public class Main 
 { 
 	 static class stack 
 	 { 
 	 	 int top; 
 	 	 int items[] = new int[100]; 

 	 	 // Stack functions to be used by printNGE 
 	 	 void push(int x) 
 	 	 { 
 	 	 	 if (top == 99) 
 	 	 	 { 
 	 	 	 	 System.out.println("Stack full"); 
 	 	 	 } 
 	 	 	 else
 	 	 	 { 
 	 	 	 	 items[++top] = x; 
 	 	 	 } 
 	 	 } 

 	 	 int pop() 
 	 	 { 
 	 	 	 if (top == -1) 
 	 	 	 { 
 	 	 	 	 System.out.println("Underflow error"); 
 	 	 	 	 return -1; 
 	 	 	 } 
 	 	 	 else
 	 	 	 { 
 	 	 	 	 int element = items[top]; 
 	 	 	 	 top--; 
 	 	 	 	 return element; 
 	 	 	 } 
 	 	 } 

 	 	 boolean isEmpty() 
 	 	 { 
 	 	 	 return (top == -1) ? true : false; 
 	 	 } 
 	 }
 	 static stack st = new stack();

 	 /* prints element and NGE pair for 
 	 all elements of arr[] of size n */
 	 static void printNGE(int arr[], int n) 
 	 { 
 	     int[] res = new int[n];
 	     res[n-1]=-1;
 	     st.push(arr[n-1]);
 	     for(int i = n-2; i>=0; i--){
 	         while(!st.isEmpty() && arr[i]>st.top)
 	         st.pop();
 	         
 	         if(st.isEmpty()){
 	             res[i]=-1;
 	         }
 	         else
 	         res[i]=st.top;
 	         
 	         st.push(arr[i]);
 	         
 	     }
 	     
 	     for(int j=0;j<n;j++){
 	         System.out.print(res[j]);
 	     }
 	     
 	 	  
 	 } 

 	 public static void main(String[] args) 
 	 { 	 Scanner sc=new Scanner(System.in);
 	 	 int n=sc.nextInt();
 	 	 int arr[] = new int[n];
 	 	 for(int i=0;i<n;i++)arr[i]=sc.nextInt(); 
 	 	 printNGE(arr, n); 
 	 } 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 


 

 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 



 