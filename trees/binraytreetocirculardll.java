package trees;

import java.io.*;
import java.util.*;






public class binraytreetocirculardll {
	
	static class TreeNode {
		  int data;
		  TreeNode left;
		  TreeNode right;
		  TreeNode head;

		  TreeNode(int x) {
		  	  data = x;
		  }
	}
	

	
	static class BinaryTree {
		TreeNode prev = null;
		TreeNode head = null;
		
		public void helper(TreeNode node) {
			if(node==null) {
				return;
			}
			
			helper(node.left);
			if (head == null) {
	  	  	  	  head = node;
	  	  	  } else {
	  	  	  	  prev.right = node;
	  	  	  	  node.left = prev;
	  	  	  }
	  	  	  prev = node;
	  	  	  helper(node.right);
	  	  	  
			
		}

		  public TreeNode treeToDoublyList(TreeNode root) {
		  //Write your code here
			  
			  head = null;
			  prev = null;
			  helper(root);
	  	  	  if (head != null) {
	  	  	  	  prev.right = head;
	  	  	  	  head.left = prev;
	  	  	  }
	  	  	  return head;
			  
			  
			  
			  
		  	  	  








		  }

		  	  //Don't make any changes here
		  	  void displayCList(TreeNode head) {
		  	  TreeNode itr = head;
		  	  do {
		  	  	  System.out.print(itr.data + " ");
		  	  	  itr = itr.right;
		  	  } while (head != itr);
		  	  System.out.println();
		  	  itr = itr.left;
		  	  do {
		  	  	  System.out.print(itr.data + " ");
		  	  	  itr = itr.left;
		  	  } while (head != itr);
		  	  System.out.println(itr.data + " ");
		  }

		  public void inOrder(TreeNode node) {
		  	  if (node == null) {
		  	  	  return;
		  	  }

		  	  inOrder(node.left);
		  	  System.out.print(node.data + " ");

		  	  inOrder(node.right);
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
	  	  TreeNode newRoot = bt.treeToDoublyList(root);
	  	  bt.displayCList(newRoot);

	  }

}
