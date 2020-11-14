package trees;

import java.io.IOException;
import java.util.*;

/*
 * In the flip operation, left most node becomes the root of flipped tree and its 
 * parent become its right child and the right sibling become 
 *  * its left child and same should be done for all left most nodes recursively.
 */


public class flipbinarytreeupsidedown {
	
	static class TreeNode {
		 TreeNode left, right;
		 int data;

		 TreeNode(int d) {
		 	 data = d;
		 	 left = right = null;
		 }

	}

	static class BinaryTree {

		 public TreeNode upsideDown(TreeNode node) {
		 //Write your code here.	
			 if(node==null) {
				 return null;
			 }
			 if(node.left==null && node.right==null) {
				 return node;
			 }
			 
			 TreeNode newroot = upsideDown(node.left);
			 node.left.left = node.right;
			 node.left.right=node;
			 node.left=null;
			 node.right=null;
			 return newroot;
			 
		 

		 }

		 void inorder(TreeNode node) {
		 	 if (node == null)
		 	 	 return;
		 	 else
		 	 	 inorder(node.left);
		 	 System.out.print(node.data + " ");
		 	 inorder(node.right);
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

	 	 BinaryTree bt = new BinaryTree();
	 	 TreeNode newRoot = bt.upsideDown(root);

	 	 bt.inorder(newRoot);

	 }

}
