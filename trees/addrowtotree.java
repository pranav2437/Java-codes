package trees;
/*
 * 1. Given the root of a binary tree, then value v and depth d, you need to add a row of nodes 
 * with value v at the given depth d. 
2. The root node is at depth 1.
3. The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1,
 create two tree nodes with value v as N's left subtree root and right subtree root. And N's original 
 left subtree should be the left subtree of the new left subtree root, its original right subtree 
 should be the right subtree of the new right subtree root. If depth d is 1 that means there is no
  depth d-1 at all, then create a tree node with value v as the new root of the whole original tree, 
and the original tree is the new root's left subtree.
 */

import java.util.*;

public class addrowtotree {

	 public static class TreeNode {

	 	 int val;
	 	 TreeNode left;
	 	 TreeNode right;

	 	 TreeNode(int x) {
	 	 	 val = x;
	 	 }
	 }

	 public static TreeNode helper(TreeNode root, int val, int depth, int currdepth) {
		 if(root==null) {
			 return null;
		 }
		 if(currdepth==depth-1) {
			 TreeNode n1 = new TreeNode(val);
			 TreeNode n2 = new TreeNode(val);
			 n1.left = root.left;
			 n2.right=root.right;
			 root.left=n1;
			 root.right=n2;
			 return root;
		 }
		 root.left = helper(root.left,val,depth,currdepth+1);
		 root.right = helper(root.right,val,depth,currdepth+1);
		 return root;
	 }
	 public static TreeNode addOneRow(TreeNode root, int v, int d) {
		 if(d==1) {
			 TreeNode n = new TreeNode(v);
			 n.left=root;
			 return n;
		 }
		 return helper(root,v,d,1);

	 }

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 int v, d;
	 	 String line1 = sc.nextLine().trim();
	 	 String line2 = sc.nextLine().trim();
	 	 Integer[] vd = inputSplitSpace(line1);
	 	 v = vd[0];
	 	 d = vd[1];
	 	 Integer[] treeArr = inputSplitSpace(line2);
	 	 TreeNode root = createTree(treeArr);
	 	 TreeNode res = addOneRow(root, v, d);
	 	 display(res);

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
