package linkedlists;

import java.util.*;

public class dupinsortedll {

    // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // This takes as input the head of the linked list.
    // It should return the head of the modified linked list.

    public static Node removeDuplicates(Node head) {
        // write your code here.
        Node curr = head;
        while(curr.next!=null) {
        	
        		if(curr.data==curr.next.data ) {
            		curr.next = curr.next.next;
            	}
        	
        	else
        		curr=curr.next;
        	
        }
        return head;

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

        head1 = removeDuplicates(head1);
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
