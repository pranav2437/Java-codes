//traverse matrix o(n^2)
class Solution {
    // static List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if(n==0){
            return res;
        }        
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(board,0,0,-1,res);
        System.out.println(ctr);
        return res;
    }
    public static boolean isValid(char[][] board,int i,int j){
        if(i<0 || i>=board.length || j<0 || j>=board.length){
            return false;
        }
        for(int r=0;r<i;r++){
            if(board[r][j]=='Q'){
                return false;
            }
        }
        for(int c=0;c<j;c++){
            if(board[i][c]=='Q'){
                return false;
            }
        }
        int r=i-1;
        int c=j-1;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        r=i-1;
        c=j+1;
        while(r>=0 && r<board.length && c<board.length){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    static int ctr=0;
    public static void solve(char[][] board,int cq,int lqi,int lqj,List<List<String>> res){
        if(cq==board.length){
            List<String> ans = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String s="";
                for(int j=0;j<board[i].length;j++){
                    s+=board[i][j];
                }
                ans.add(s);
            }
            res.add(ans);
            ctr++;
            return;
        }
        for(int i=lqi;i<board.length;i++){
            for(int j=(i==lqi?lqj+1:0);j<board.length;j++){
                if(board[i][j]=='.' && isValid(board,i,j)){
                    board[i][j]='Q';
                    solve(board,cq+1,i,j,res);
                    board[i][j]='.';
                }
                
            }
        }
    }
}








class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> res = new ArrayList<>();
        if(n==0){
            return res;
        }        
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(board,0,res);
        return res;
    }
    public static boolean isValid(char[][] board,int i,int j){
        for(int c=j-1;c>=0;c--){
            if(board[i][c]=='Q'){
                return false;
            }            
        }
        int r=i-1;
        int c=j-1;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        r=i+1;
        c=j-1;
        while(c>=0 && r<board.length){
            if(board[r][c]=='Q'){
                return false;
            }
            r++;
            c--;
        }
        return true;        
    }
    public static void solve(char[][] board,int col,List<List<String>> res){
        if(col==board.length){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String s="";
                for(int j=0;j<board.length;j++){
                    s+=board[i][j];
                }
                ans.add(s);
            }
            res.add(ans);
        }
        for(int i=0;i<board.length;i++){
            if(isValid(board,i,col)){
                board[i][col]='Q';
                solve(board,col+1,res);
                board[i][col]='.';
            }
        }
    }
}