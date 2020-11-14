package linkedlists;

import java.util.*; 
class knightsinchessboard
{ 
// Write the code
	
	static class Helper{
		int i;
		int j;
		int level;
		Helper(int i,int j,int level){
			this.i =i;
			this.j=j;
			this.level=level;
		}
	}
	public static boolean isValid(int M[][],int row,int col) {
		if(row<0 || row>=M.length || col<0 || col>=M[0].length) {
			return false;
		}
		if(M[row][col]==1) {
			return false;
		}
		return true;
		
	}
static int knightChessboard(int knightPos[], int targetPos[],int N)
 {
 int sr = knightPos[0]-1;
 int sc = knightPos[1]-1;
 int dr = targetPos[0]-1;
 int dc = targetPos[1]-1;
 int[][] visited = new int[N][N];
 Queue<Helper> q = new LinkedList<>();
 Helper src = new Helper(sr,sc,0);
 q.add(src);
 visited[sr][sc]=1;
 int l=-1;
 while(!q.isEmpty()) {
	 int r=q.peek().i;
	 int c=q.peek().j;
	 int curlevel = q.peek().level;
	 q.remove();
	 l=curlevel;
	 if(r==dr && c==dc) {
		 return curlevel;
	 }
	 if(isValid(visited,r-2,c+1)) {
		 Helper n = new Helper(r-2,c+1,curlevel+1);
		 q.add(n);
		 visited[r-2][c+1]=1;
	 }
	 if(isValid(visited,r-1,c+2)) {
		 Helper n = new Helper(r-1,c+2,curlevel+1);
		 q.add(n);
		 visited[r-1][c+2]=1;
	 }
	 if(isValid(visited,r+1,c+2)) {
		 Helper n = new Helper(r+1,c+2,curlevel+1);
		 q.add(n);
		 visited[r+1][c+2]=1;
	 }
	 if(isValid(visited,r+2,c+1)) {
		 Helper n = new Helper(r+2,c+1,curlevel+1);
		 q.add(n);
		 visited[r+2][c+1]=1;
	 }
	 if(isValid(visited,r+2,c-1)) {
		 Helper n = new Helper(r+2,c-1,curlevel+1);
		 q.add(n);
		 visited[r+2][c-1]=1;
	 }
	 if(isValid(visited,r+1,c-2)) {
		 Helper n = new Helper(r+1,c-2,curlevel+1);
		 q.add(n);
		 visited[r+1][c-2]=1;
	 }
	 if(isValid(visited,r-1,c-2)) {
		 Helper n = new Helper(r-1,c-2,curlevel+1);
		 q.add(n);
		 visited[r-1][c-2]=1;
	 }
	 if(isValid(visited,r-2,c-1)) {
		 Helper n = new Helper(r-2,c-1,curlevel+1);
		 q.add(n);
		 visited[r-2][c-1]=1;
	 }
 }
 return -1;
 
} 




// Dont change here 
public static void main(String[] args) 
{       Scanner sc=new Scanner(System.in);
	 int N = sc.nextInt(); 
	 int knightPos[] = new int[2]; 
	 int targetPos[] = new int[2];
        knightPos[0]=sc.nextInt();knightPos[1]=sc.nextInt();
        targetPos[0]=sc.nextInt();targetPos[1]=sc.nextInt();
	 	 System.out.println(knightChessboard(knightPos, targetPos, N)); 
	 } 
}
