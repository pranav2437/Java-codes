package dynamicprogramming;
import java.util.*;

public class ratmaze {
	
	public static boolean isvalid(int[][] m,int n,int r,int c,boolean[][] visited) {
		if(r>=n || c>=n || r<0 || c<0 || m[r][c]!=1 || visited[r][c]==true) {
			return false;
		}
		return true;
	}
	
	public static ArrayList<String> printpath(int[][] m,int n) {
		boolean[][] visited = new boolean[n][n];
		ArrayList<String> res = new ArrayList<>();
		dfs(m,n,res,visited,"",0,0);
		return res;
		
	}

	public static void dfs(int[][] m,int n, ArrayList<String> res, boolean[][] visited, String path,int i,int j) {
		if(!(isvalid(m,n,i,j,visited))) {
			return;
		}
		if(i==n-1 && j==n-1) {
			res.add(path);
			return;
		}
		visited[i][j]=true;
		if(isvalid(m,n,i+1,j,visited)) {
			path+="d";
			dfs(m,n,res,visited,path,i+1,j);
			
		}
		if(isvalid(m,n,i,j+1,visited)) {
			path+="r";
			dfs(m,n,res,visited,path,i,j+1);
			
		}
		if(isvalid(m,n,i-1,j,visited)) {
			path+="u";
			dfs(m,n,res,visited,path,i-1,j);
			
		}
		if(isvalid(m,n,i,j-1,visited)) {
			path+="l";
			dfs(m,n,res,visited,path,i,j-1);
			
		}
		visited[i][j]=false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] m = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		ArrayList<String> ans = printpath(m,n);
		for(String s:ans) {
			System.out.println(s + " ");
		}
	}
}
