package trees;

import java.util.*;

public class averageofeachlevel {

	 public static class TreeNode {

	 	 int val;
	 	 TreeNode left;
	 	 TreeNode right;

	 	 TreeNode(int x) {
	 	 	 val = x;
	 	 }
	 }

	 public static List<Double> averageOfLevels(TreeNode root) {
	 	 // Write your code here
		 List<Double> list = new ArrayList<>();
		 Queue<TreeNode> q = new LinkedList<>();
		 q.add(root);
		 q.add(null);
		 double sum=0;
		 double count=0;
		 while(q.size()>0) {
			 TreeNode rem = q.poll();
			 if(rem!=null) {
				 sum+=rem.val;
				 count++; 
			 }			 
			 if(rem==null) {
				 double ans = sum/count;
				 sum=0;
				 count=0;
				 list.add(ans);
				 if(q.size()>0) {
					 q.add(null);
				 }
				 continue;
			 }
			 if(rem.left!=null) {
				 q.add(rem.left);
			 }
			 if(rem.right!=null) {
				 q.add(rem.right);
			 }			 
		 }
		 return list;
	 }

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 String input = sc.nextLine().trim();

	 	 Integer[] treeArr = inputSplitSpace(input);
	 	 TreeNode root = createTree(treeArr);
	 	 List<Double> res = averageOfLevels(root);
	 	 for (Double v : res) {
	 	 	 System.out.print(v + " ");
	 	 }
	 	 System.out.println();

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
