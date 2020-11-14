package linkedlists;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class rottenoranges {
	static class helper{
		int i;
		int j;
		double time;
		public helper(int i,int j,double time){
			this.i=i;
			this.j=j;
			this.time=time;
		}
	}
	
	//0 empty 1 fresh 2 rotten
	public static boolean isValid(int m[][],int row,int col) {
		if(row<0 || row>=m.length || col<0 || col>=m[0].length) {
			return false;
		}
		if(m[row][col]==0 || m[row][col]==2 || m[row][col]==3) {
			return false;
		}
	return true;
	}
public static int mintime(int m[][],int row,int col) {
	Queue<helper> q = new LinkedList<>();
	
	for(int i=0;i<row;i++) {
		for (int j = 0; j < col; j++) {
			if(m[i][j]==2 || m[i][j]==3) {
				helper orange = new helper(i,j,0);
				q.add(orange);
				}
			}
		}
		double time=-1;
		int r,c;
		while(!q.isEmpty()) {
			 double currtime = q.peek().time;
			 r=q.peek().i;
			 c=q.peek().j;
			 q.remove();
			 m[r][c]=2;
			 time=currtime;
			 if(m[r][c]==3) {
				 if(isValid(m,r+1,c)) {
					 helper orange = new helper(r+1,c,currtime+0.5);
					 q.add(orange);
				 }
				 if(isValid(m,r-1,c)) {
					 helper orange = new helper(r-1,c,currtime+0.5);
					 q.add(orange);
				 }
				 if(isValid(m,r,c+1)) {
					 helper orange = new helper(r,c+1,time+0.5);
					 q.add(orange);
				 }
				 if(isValid(m,r,c-1)) {
					 helper orange = new helper(r,c-1,time+0.5);
					 q.add(orange);
				 }	
			 }
			 else {
				 if(isValid(m,r+1,c)) {
					 helper orange = new helper(r+1,c,currtime+1);
					 q.add(orange);
				 }
				 if(isValid(m,r-1,c)) {
					 helper orange = new helper(r-1,c,currtime+1);
					 q.add(orange);
				 }
				 if(isValid(m,r,c+1)) {
					 helper orange = new helper(r,c+1,time+1);
					 q.add(orange);
				 }
				 if(isValid(m,r,c-1)) {
					 helper orange = new helper(r,c-1,time+1);
					 q.add(orange);
				 }
			 }
			 		 
			
		}
		for(int i=0;i<row;i++) {
			for (int j = 0; j < col; j++) {
				if(m[i][j]==1) {
					return -1;
					}
				}
			}
		return (int) time;
		
	}
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println(mintime(matrix,r,c));
	}
}
