package linkedlists;

import java.util.*;

import linkedlists.deletelastocc.Node;

public class add1toll {

    // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // It takes as input the head of the linked list. It should return the
    // head of the modified linked list.

    public static Node plusOne(Node n) {
        // write your code here.
    	Node head = reverse(n);
    	int carry =0;
    	int digit=0;
    	Node temp = head;
    	int data =0;
    	while(temp!=null) {
    		if(temp==head) {
    			data = temp.data +1;
    			digit = data%10;
    			carry = data/10;
    			temp.data = digit;
    		}
    		else {
    			if(carry==1) {
    				data = temp.data +1;
    				digit = data%10;
    				carry = data/10;
    				temp.data = digit;
    			}
    		}
    		if(temp.next==null && carry!=0) {
    			Node nn = new Node(1);
    			nn.next=null;
    			break;
    		}
    		temp=temp.next;
    	}
      return reverse(head);
  

    }
    public static Node reverse(Node head) {
    	Node prev =  null;
    	Node curr = head;
    	Node nxt = null;
    	while(curr!=null) {
    		nxt = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr=nxt;
    	}
    	head = prev;
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

        head1 = plusOne(head1);
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
