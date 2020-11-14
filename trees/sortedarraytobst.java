package trees;

import java.util.Scanner;

public class sortedarraytobst {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}

    public static Node BSTFormation(int[] arr, int i, int j) {
    	if(i>j) {
    		return null;
    	}
    	int mid = (i+j)/2;
    	Node root = new Node(arr[mid]);
    	root.left = BSTFormation(arr,i,mid-1);
    	root.right = BSTFormation(arr,mid+1,j);
    	return root;
    	
    	
    }
    public static void printpreorder(Node root) {
    	if(root==null) {
    		return;
    	}
    	System.out.print(root.data  + " " );
    	printpreorder(root.left);
    	printpreorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Node root = BSTFormation(arr, 0, arr.length - 1);
        printpreorder(root);
    }

}
