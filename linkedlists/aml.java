package linkedlists;
import java.util.*;
 
 public class aml {
 
   
     public static Node[] mergeAlt(Node head1, Node head2){
         //write your code here, and print the result
         Node[] node = new Node[2];
         
         if(head1==null){
             node[0]=null;
             node[1]=head2;
             return node;
         }
         if(head2==null){
             node[0]=head1;
             node[1]=null;
             return node;
         }
         Node oo = head1;
         Node on = head1.next;
         Node to = head2;
         Node tn = head2.next;
         
         while(on!=null && tn!=null){
             oo.next = to;
             to.next = on;
             oo=on;
             to=tn;
             on=on.next;
             tn=tn.next;
               }
         
         
             if(on==null){
                 oo.next=to;
                 to.next=null;
                 node[1]=tn;
             }
             if(tn==null){
                 node[1]=null;
                 oo.next = to;
                 to.next = on;
             }
                node[0]=head1;
                
             return node;
         
         
     }
     
 
    
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int a1 = sc.nextInt();
         head1 = insert(head1, a1);
 
         for (int i = 1; i < n1; i++) {
             int a = sc.nextInt();
             head1 = insert(head1, a);
         }
 
         int n2 = sc.nextInt();
         int a2 = sc.nextInt();
         head2 = insert(head2, a2);
 
         for (int i = 1; i < n2; i++) {
             int a = sc.nextInt();
             head2 = insert(head2, a);
         }
         Node[] res = mergeAlt(head1, head2);
         display(res[0]);
         display(res[1]);
         
 
     }
 
   
     static class Node {
         int data;
         Node next;
 
         public Node(int data) {
             this.data = data;
             this.next = null;
         }
 
     }
 
     static Node head1;
 
     static Node head2;
 
     static Node head3;
 
     
     public static Node insert(Node head, int data) {
 
         if (head == null) {
             return new Node(data);
         }
 
         head.next = insert(head.next, data);
         return head;
     }
 
     
     public static void display(Node head) {
         for (Node node = head; node != null; node = node.next) {
             System.out.print(node.data + " ");
         }
         System.out.println();
     }
 
 }