package trees;

import java.util.*;

public class kthsmallestinbst {

	  // TreeNode class for a node of a Binary Search Tree
	  public static class TreeNode {
	  	  int val;
	  	  TreeNode left;
	  	  TreeNode right;

	  	  TreeNode(int x) {
	  	  	  val = x;
	  	  }
	  }

	  // This is a functional problem. You have to complete this function.
	  // It takes as input the root node of the given tree and K. It should
	  // return the Kth smallest element in BST.
	  
	  
	  static int res =-1;
	  public static int kthSmallest(TreeNode root, int k) {
			if (root == null)
				return res;
			helper(root, k);
			return res;
		}

		static int count= 0;
		private static void helper(TreeNode root,  int k) {
			if (root.left != null) {
				helper(root.left, k);
			}
			count++;
			if (count == k) {
				res = root.val;
				return;
			}
			if (root.right != null) {
				helper(root.right, k);
			}
		}

	  public static void main(String[] args) {
	  	  Scanner sc = new Scanner(System.in);
	  	  String input = sc.nextLine().trim();
	  	  int K = sc.nextInt();

	  	  Integer[] treeArr = inputSplitSpace(input);
	  	  TreeNode root = createTree(treeArr);

	  	  System.out.println(kthSmallest(root, K));
	  
	  }
	  
	  // utility function to display a binary tree.
	  public static void display(TreeNode node) {
	  	  if (node == null) {
	  	  	  return;
	  	  }

	  	  String str = "";

	  	  str += node.left == null ? "." : node.left.val;
	  	  str += " <= " + node.val + " => ";
	  	  str += node.right == null ? "." : node.right.val;

	  	  System.out.println(str);

	  	  display(node.left);
	  	  display(node.right);
	  }

	  // utility function, don't change its code
	  public static Integer[] inputSplitSpace(String str) {
	  	  String[] sArr = str.split(" ");
	  	  Integer[] arr = new Integer[sArr.length];
	  	  for (int i = 0; i < arr.length; i++) {
	  	  	  arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
	  	  }
	  	  return arr;
	  }

	  // utility function to create a tree, don't change its code.
	  public static TreeNode createTree(Integer[] arr) {
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


}
