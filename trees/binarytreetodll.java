package trees;

/*
 * 1.Given a Binary Tree (BT)
2.Convert it to a Doubly Linked List(DLL) In-Place.The left and right pointers in nodes are to be used as previous
and next pointers respectively in converted DLL.
3.The order of nodes in DLL must be same as Inorder of the given Binary Tree.
4.The first node of Inorder traversal (left most node in BT) must be head node of the DLL
 */

import java.io.*;
import java.util.*;


public class binarytreetodll{
	static class TreeNode {
	 	 TreeNode left, right;
	 	 int data;

	 	 TreeNode(int d) {
	 	 	 data = d;
	 	 	 left = right = null;
	 	 }

	 }
	
	static class Pair{
		TreeNode head;
		TreeNode tail;
	}


static class BinaryTree {
	 
	 
	 TreeNode head;

	 public Pair BT2DLL(TreeNode root) {
	 	 
	 	 //Write your code here......
		 
		 if(root == null) {
			 Pair p = new Pair();
			 return p;
		 }
		 Pair lp = BT2DLL(root.left);
		 Pair rp = BT2DLL(root.right);
		 if(lp.tail==null) {
			 lp.tail=lp.head=root;
		 }
		 else {
			 lp.tail.right = root;                       // tree ka right ptr == list ka next ptr
			 root.left = lp.tail;
		 }
		 
		 
		 if(rp.head==null) {
			 rp.head=rp.tail=root;
		 }		 
		 else {
			 rp.head.left = root;                        //tree ka left ptr == list ka prev ptr
			 root.right = rp.head;
		 }
		 
		 
		 Pair mp = new Pair();		 
		 mp.head = lp.head;		 
		 mp.tail = rp.tail;		 
		 
		 return mp;	 	 
	 }
	 
	 void inorder(TreeNode node)
	 {
	 	 if(node==null)
	 	 	 return ;
	 	 else
	 	 	 inorder(node.left);
	 	 	 System.out.print(node.data + " ");
	 	 	 inorder(node.right);
	 }
	 void printList(TreeNode head) 
   {
	 	 TreeNode prev = head;
       while (head != null) 
       {
           System.out.print(head.data + " ");
	 	 	 prev = head;
           head = head.right;
       }
	 	 
	 	 System.out.println();
	 	 while(prev != null)
	 	 {
	 	 	 System.out.print(prev.data+" ");
	 	 	 prev = prev.left;
	 	 }
   }
	 
	 
}
	 
	 public static TreeNode construct(Integer[] arr) {
	 	 ArrayDeque<TreeNode> que = new ArrayDeque<>();
	 	 TreeNode root = new TreeNode(arr[0]);
	 	 que.addLast(root);
	 	 int i = 1;
	 	 while (!que.isEmpty() && i < arr.length) {
	 	 	 TreeNode nn = que.removeFirst();

	 	 	 if (i < arr.length && arr[i] != null) {
	 	 	 	 TreeNode n = new TreeNode(arr[i]);
	 	 	 	 nn.left = n;
	 	 	 	 que.addLast(n);
	 	 	 }
	 	 	 i++;

	 	 	 if (i < arr.length && arr[i] != null) {
	 	 	 	 TreeNode n = new TreeNode(arr[i]);
	 	 	 	 nn.right = n;
	 	 	 	 que.addLast(n);
	 	 	 }
	 	 	 i++;
	 	 }

	 	 return root;
	 }

	 public static Integer[] inputSplitSpace(String str) {
	 	 String[] sArr = str.split(" ");
	 	 Integer[] arr = new Integer[sArr.length];
	 	 for (int i = 0; i < arr.length; i++) {
	 	 	 arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
	 	 }
	 	 return arr;
	 }

	 public static void main(String[] args) throws IOException {

	 	 Scanner scn = new Scanner(System.in);
	 	 String str = scn.nextLine();
	 	 Integer[] ar = inputSplitSpace(str);
	 	 TreeNode root = construct(ar);

	 	 BinaryTree bt=new BinaryTree();
	 	 TreeNode newRoot=bt.BT2DLL(root).head;
	 	 
	 	 bt.printList(newRoot);
	 	 
	 	 
//	 	 String out = String.valueOf(ret);

//	 	 System.out.print(out);
	 }

	 
	 
	 
}
