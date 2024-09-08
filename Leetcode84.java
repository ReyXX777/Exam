class Leetcode84{
    public void solve(char[][] board){
        if(board==null||board.length==0){
            return;
        }
        int m= board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for(int j=0;j<n;j++){
            dfs(board,0,j);
            dfs(board,m-1,j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='0'){
                    board[i][j]='x';
                }else if(board[i][j]=='e'){
                    board[i][j]='o';
                }
            }
        }
    }
    private void dfs(char[][] board,int x,int y){
        int m = board.length;
        int n = board[0].length;
        if(x<0||x>=m||y<0||y>=n||board[x][y]!='0'){
            return;
        }
        board[x][y]='e';
        int [][] directions ={{1,0},{-1,0},{0,1},{0,-1}};
        for(int [] direction:directions){
            dfs(board, x+direction[0], y+direction[1]);
        }
    }
    public static void main(String [] args){
        Leetcode84 solution = new Leetcode84();
        char [][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        solution.solve(board);
        System.out.println("final board");
        for(char[] row:board){
            for(char c:row){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}