import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Leetcode136 {
    public List<List<String>> solvequeen(int n){
        List<List<String>>  ans = new ArrayList<>();
        char [][] board = new char[n][n];
        for(int i=0;i<n;++i)
        Arrays.fill(board[i],'.');
        dfs(n,0,new boolean[n] ,new boolean[2*n-1],new boolean[2*n-1],board,ans);
        return ans;
    }
    private void dfs(int n,int i,boolean[] cols,boolean [] diag1,boolean [] diag2,char[][] board,List<List<String>> ans){
        if(i==n){
            ans.add(construct(board));
            return;
        }
        for(int j=0;j<cols.length;++j){
            if(cols[j]||diag1[i+j]||diag2[j-i+n-1])
            continue;
            board[i][j] = 'Q';
            cols[j] = diag1[i+j] = diag2[j-i+n-1] = true;
            dfs(n, i+1, cols, diag1, diag2, board, ans);
            cols[j] = diag1[i+j] = diag2[j-i+n-1] = false;
            board[i][j] = '.';
        }

    }
    private List<String> construct(char [] [] board){
        List<String> listboard = new ArrayList<>();
        for(int i=0;i<board.length;++i)
        listboard.add(String.valueOf(board[i]));
        return listboard;
    }
    public static void main(String [] args){
        int n = 4;
        Leetcode136 solution = new Leetcode136();
        List<List<String>> solutions = solution.solvequeen(n);
        System.out.println(n);
        for(List<String>board:solutions){
            for(String row:board){
                System.out.println(row);
            }
            System.out.println();
        }

    }
}
