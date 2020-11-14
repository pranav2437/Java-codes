package linkedlists;

import java.util.*;

public class partitionll {

    // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // It takes as input the head of the linked list and x.
    // It should return the head of the modified list.

    public static Node partition(Node n, int x) {
        // write your code here.
    	Node lh=null;
    	Node lt=null;
    	Node rh=null;
    	Node rt=null;
    	Node temp;
    	Node t = null;
    	for(temp=n;temp!=null;temp=t) {
    		t=temp.next;
    		if(temp.data<x) {
    			if(lt==null) {
    				lh=temp;
    				lt=temp;
    				lt.next=null;
    			}
    			else {
    				lt.next=temp;
    				lt=temp;
    				lt.next=null;
    			}
    		}
    		else {
    			if(rt==null) {
    				rh=temp;
    				rt=temp;
    				rt.next=null;
    			}
    			else {
    				rt.next=temp;
    				rt=temp;
    				rt.next=null;
    			}
    		}
    	}
    	lt.next=rh;
    	return lh;
        
    }

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

        int x = sc.nextInt();

        head1 = partition(head1, x);
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
     * Input Parameters: tail: tail of the linked list in which a new node is to
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