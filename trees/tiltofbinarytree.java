package trees;

/*
 * 1.Given a binary tree.
2.You have to find the tilt of the given tree.
3.The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values
and the sum of all right subtree node values. Null node has tilt 0.
4.The tilt of the whole tree is defined as the sum of all nodes' tilt.
5.You have to complete the function findTilt() which should return tilt of the whole tree.
*/

import java.io.*;
import java.util.*;





public class tiltofbinarytree {
	
	static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;

		 TreeNode(int x) {
		 	 val = x;
		 }
	}
	static int tilt = 0;
	static class BinaryTree {
		
		

		 public int findTilt(TreeNode node) {
		 //Write your code here .	
			 if(node == null) {
				 return 0;
			 }
			 int ls = findTilt(node.left);
			 int rs = findTilt(node.right);
			 int rv = ls + rs + node.val;            
			 tilt += Math.abs(ls-rs);
			 return rv;
		 
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
	 
	 	 
	 //Don't make any changes here.
	 public static void main(String[] args) throws IOException {

	 	 Scanner scn = new Scanner(System.in);
	 	 String str = scn.nextLine();
	 	 Integer[] ar = inputSplitSpace(str);
	 	 TreeNode root = construct(ar);

	 	 int ret = new BinaryTree().findTilt(root);


	 	 System.out.print(tilt);
	 }
}