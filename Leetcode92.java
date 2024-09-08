import java.util.ArrayList;
import java.util.List;

class Trienode{
   public Trienode [] children = new Trienode[26];
   public String word;
}
public class Leetcode92 {
    public List<String> findwords(char[][] board,String [] words){
        for(final String word:words)
        insert(word);
        List<String> ans = new ArrayList<>();
        for(int i=0;i<board.length;++i)
        for(int j=0;j<board[0].length;++j)
        dfs(board,i,j,root,ans);
        return ans;
    }
    private Trienode root = new Trienode();
    private void insert(final String word){
    Trienode node = root;
    for(final char c:word.toCharArray()){
        final int i = c-'a';
        if(node.children[i]==null)
        node.children[i]=new Trienode();
        node = node.children[i];
    }
    node.word = word;
}
private void dfs(char[][] board,int i,int j,Trienode node,List<String> ans){
    if(i<0||i==board.length||j<0||j==board[0].length)
    return;
    if(board[i][j]=='*')
    return;
    final char c =board[i][j];
    Trienode child = node.children[c-'a'];
    if(child==null)
    return;
    if(child.word!=null){
    ans.add(child.word);
    child.word=null;
    }

board[i][j] = '*';
dfs(board,i+1,j,child,ans);
dfs(board, i - 1, j, child, ans);
        dfs(board, i, j + 1, child, ans);
        dfs(board, i, j - 1, child, ans);
        board[i][j] = c;
    }
    public static void main(String [] args){
        Leetcode92 solution = new Leetcode92();
        char [][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        String [] words ={"oath","pea","eat","rain"};
        List<String> result = solution.findwords(board,words);
        System.out.println(result); 
    }

    
}
