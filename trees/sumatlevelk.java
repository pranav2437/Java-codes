package trees;

import java.util.Scanner;

import java.util.*;

public class sumatlevelk {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	
	
	
	public static int sumatk(String tree,int k) {		
			int level = -1;
			int sum = 0;
			
			int i=0;
			while(i<tree.length()) {
				char ch = tree.charAt(i);
				
				if(ch=='(') {
					level++;
					i++;
					continue;
				}
				if(ch==')') {
					level--;
					i++;
					continue;
				}
				
				if(level==k) {
					String str = "";
					str += ch;
					i++;
				
					while(i<tree.length() && tree.charAt(i)>='0' && tree.charAt(i)<='9') {
						str += tree.charAt(i);
						i++;
					}
				
					sum += Integer.parseInt(str);
				}
				
				else {
					i++;
				}
			}
			
			return sum;
		}
	
   public static void main(String[] args) {
   	   // write your code here.
	   Scanner sc = new Scanner(System.in);
	   int level = sc.nextInt();
	   String s = sc.next();	   
	   System.out.println(sumatk(s,level));

   }


}
