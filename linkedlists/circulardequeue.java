import java.util.*;
class DoublyLL{
	int data;
	DoublyLL next;
	DoublyLL prev;
}
 
 public class Main {
 
     static class CircularDeque {
 
         public LinkedList<Integer> cdeque;
         public int size;
         DoublyLL head;
         DoublyLL tail;
         int currsize;
 
         public CircularDeque(int k) {
        	 this.size=k;
        	 this.head=null;
        	 this.tail=null;
        	 this.currsize=k;
         }
 
         public boolean insertFront(int value) {
        	 if(currsize==size) {
        		 return false;
        	 }
        	 DoublyLL newnode = new DoublyLL();
        	 newnode.data=value;
         }
 
         public boolean insertLast(int value) {
         }
 
         public boolean deleteFront() {
         }
 
         public boolean deleteLast() {
         }
 
         public int getFront() {
         }
 
         public int getRear() {
         }
 
         public boolean isEmpty() {
         }
 
         public boolean isFull() {
         }
 
     }
 
     // Dont make changes here
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         CircularDeque cd = new CircularDeque(sc.nextInt());
         int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
             int q = sc.nextInt();
             String s = "";
             if (q == 1) {
                 s = "" + cd.insertFront(sc.nextInt());
             } else if (q == 0) {
                 s = "" + cd.insertLast(sc.nextInt());
             } else if (q == 2) {
                 s = "" + cd.deleteFront();
             } else if (q == -2) {
                 s = "" + cd.deleteLast();
             } else if (q == 3) {
                 s = "" + cd.getFront();
             } else if (q == -3) {
                 s = "" + cd.getRear();
             } else if (q == 4) {
                 s = "" + cd.isEmpty();
             } else if (q == 5) {
                 s = "" + cd.isFull();
             }
             System.out.print(s + " ");
         }
 
     }
 
 }