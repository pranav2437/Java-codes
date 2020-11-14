package linkedlists;

import java.util.Scanner;
import java.util.Stack;

public class laragestrecinmatrix {
 
public static int maxrect(int arr[][]){
// Write your code here only
	int row = arr.length;
	int col = arr[0].length;
	int max = Integer.MIN_VALUE;
	int[][] height = new int[row][col];
	height[0]=arr[0];
	for(int i=1;i<row;i++) {
		for(int j=0;j<col;j++) {
			if(arr[i][j]==0) {
				height[i][j]=0;
			}
			else {
				height[i][j] = height[i-1][j]+1;
			}
		}
	}
	
		for(int i=0;i<height.length;i++) {
			int ans=maxRectArea(height[i]);
			if(ans>max) {
				max=ans;
			}
		}
		
		return max;
	}
	

public static int maxRectArea(int[] ht) {
    //write your code here
 	Stack<Integer> st = new Stack<>();
 	st.push(0);
 	int maxarea = Integer.MIN_VALUE;
 	for(int i=1;i<ht.length;i++) {
 		int val=ht[i];
 		while(!st.isEmpty()) {
 			int topind=st.peek();
 			int topval = ht[topind];
 			if(topval>val) {
 				int rb=i;
 				st.pop();
 				int lb=-1;
 				if(!st.empty()) {
 					lb=st.peek();
 				}
 				int area = topval*(rb-lb-1);
 				if(area>maxarea) {
 					maxarea=area;
 				}
 			}
 			else {
 				break;
 			}
 		}
 		st.push(i);
 	}
 	int rb=ht.length;
 	while(!st.isEmpty()) {
 		int topind = st.peek();
 		st.pop();
 		int h = ht[topind];
 		int lb=-1;
 		if(!st.empty()) {
 			lb=st.peek();
 		}
 		int area=h*(rb-lb-1);
 		if(area>maxarea) {
 			maxarea=area;
 		}
 	}
 	return maxarea;
	  }

	 //Dont make changes
	 public static void main(String[] args) {
	 	 Scanner sc=new Scanner(System.in);	 
	 	 int row=sc.nextInt();
	 	 int col=sc.nextInt();
	 	 int[][] A=new int[row][col];
	 	 for(int i=0;i<row;i++)
	 	 	 for(int j=0;j<col;j++)
	 	 	 	 A[i][j]=sc.nextInt();
          System.out.println( maxrect(A));
    
	 }

}
