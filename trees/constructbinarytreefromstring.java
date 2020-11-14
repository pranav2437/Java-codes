package trees;

import java.util.*;

import trees.sumatlevelk.Node;

import java.lang.*;
import java.io.*;

public class constructbinarytreefromstring {
	
	
		public static class Node{
			int data;
			Node left;
			Node right;
			Node(int data){
				this.data=data;
			}
		}
		
		public static Node construct(String s) {
			
			if(s.charAt(0)=='(') {
				s=s.substring(1);
			}
			
			if (s == null || s.length() == 0)
				return null;
		    int firstParen = s.indexOf("(");
		    int val = firstParen == -1 ? Integer.parseInt(s) : Integer.parseInt(s.substring(0, firstParen));
		    Node cur = new Node(val);
		    if (firstParen == -1) 
		    	return cur;
		    int start = firstParen, leftParenCount = 0;
		    for (int i=start;i<s.length();i++) {
		        if (s.charAt(i) == '(') 
		        	leftParenCount++;
		        else if (s.charAt(i) == ')') 
		        	leftParenCount--;
		        if (leftParenCount == 0 && start == firstParen) {
		        	cur.left = construct(s.substring(start+1,i)); start = i+1;
		        	}
		        else if (leftParenCount == 0) cur.right = construct(s.substring(start+1,i));
		    }
		    return cur;
			
		}
	   public static void main(String[] args) {
	   	   // write your code here.
		   Scanner sc = new Scanner(System.in);
		   String s = sc.nextLine();
		   construct(s);

	   }

}
