package trees;

import java.util.*;
import java.io.*;



public class printroottoleafpaths {
	static class TreeNode {
		  int data;
		  TreeNode left, right;

		  TreeNode(int item) {
		  	  data = item;
		  	  left = right = null;
		  }
	}

	static class BinaryTree {

		  public void printPaths(TreeNode root,ArrayList<Integer> list) {
		  //Write your code here.	
			  if(root==null) {
				  return;
			  }
			  if(root.left==null && root.right==null) {
				  list.add(root.data);
				  for(int i:list) {
					  System.out.print(i + " ");
				  }
				  System.out.print("# ");
				  
				  return;
			  }
			  list.add(root.data);
			  if(root.right==null) {
				  printPaths(root.left,list);
			  }
			  else if(root.left==null) {
				  printPaths(root.right,list);
			  }
			  else {
				  printPaths(root.left,list);
				  printPaths(root.right,list);
			  }



		  }

		  	  void printInorder(TreeNode node) {
		  	  if (node == null) {
		  	  	  return;
		  	  }
		  	  printInorder(node.left);
		  	  System.out.print(node.data + " ");
		  	  printInorder(node.right);
		  }
	}
	  int height(TreeNode node) {
	  	  if (node == null)
	  	  	  return 0;
	  	  int l = 1 + height(node.left);
	  	  int r = 1 + height(node.right);
	  	  if (l > r)
	  	  	  return l;
	  	  else
	  	  	  return r;
	  }

	  public static void main(String args[]) {
	  	  Scanner sc = new Scanner(System.in);
	  	  HashMap<Integer, TreeNode> m = new HashMap<Integer, TreeNode>();
	  	  int n = sc.nextInt();
	  	  TreeNode root = null;
	  	  while (n > 0) {

	  	  	  int n1 = sc.nextInt();
	  	  	  int n2 = sc.nextInt();
	  	  	  char lr = sc.next().charAt(0);

	  	  	  TreeNode parent = m.get(n1);
	  	  	  if (parent == null) {
	  	  	  	  parent = new TreeNode(n1);
	  	  	  	  m.put(n1, parent);
	  	  	  	  if (root == null)
	  	  	  	  	  root = parent;
	  	  	  }
	  	  	  TreeNode child = new TreeNode(n2);
	  	  	  if (lr == 'L')
	  	  	  	  parent.left = child;
	  	  	  else
	  	  	  	  parent.right = child;
	  	  	  m.put(n2, child);
	  	  	  n--;
	  	  }

	  	  BinaryTree bt = new BinaryTree();
	  	  bt.printPaths(root,new ArrayList<>());

	  }
}
