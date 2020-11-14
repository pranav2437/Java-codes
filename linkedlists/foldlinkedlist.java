package linkedlists;

import java.util.*;

public class foldlinkedlist {

    // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // It takes as input the head of the linked list.
    // It should return the head of the rearranged list.
    public static Node rearrange(Node head) {
        // write your code here.
    	Node oo=head;
    	Node on = head.next;
    	Node slow=head;
    	Node fast=head;
    	while(fast.next!=null && fast.next.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	Node mid = slow.next;
    	slow.next=null;
    	Node to = reverse(mid);
    	Node tn = to.next;
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
                    }
        if(tn==null){
            oo.next = to;
            to.next = on;
        }
        return head;
    	
    	
    }
    public static Node reverse(Node head) {
    	Node prev=null;
    	Node curr=head;
    	Node nxt=null;
    	while(curr!=null) {
    		nxt=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=nxt;
    	}
    	return prev;
    }

    //

    // -----------------------------------------------------

    static Node head1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1 = sc.nextInt();

        Node tail;
        head1 = tail = insert(null, a1);

        for (int i = 1; i < n1; i++) {
            int a = sc.nextInt();
            tail = insert(tail, a);
        }

        head1 = rearrange(head1);
        display(head1);

    }

    // Class declaration for a Node of the Linked List
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    /*
     * Input Parameters: tail: head of the linked list in which a new node is to
     * be inserted. data: the data value of the node which is to be inserted.
     * 
     * Return Value: tail of the linked list/the node that is inserted
     */
    public static Node insert(Node tail, int data) {

        if (tail == null) {
            return new Node(data);
        }

        Node nn = new Node(data);
        tail.next = nn;
        return nn;
    }

    /*
     * Input Parameters: head: head of the linked list in which is to be
     * displayed.
     * 
     * Return Value: null
     */
    public static void display(Node head) {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
    }

}