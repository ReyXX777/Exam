import java.util.*;
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode(int x) {val = x;}
}
public class Leetcode139 {
    public int pathsum(Treenode root,int sum){
        if(root==null){
            return 0;
        }
        return dfs(root,sum) + pathsum(root.left, sum) + pathsum(root.right, sum);
    }
    private int dfs(Treenode root,int sum){
        if(root==null){
            return 0;
        }
        return(sum==root.val?1:0)+dfs(root.left, sum-root.val) + dfs(root.right, sum-root.val);
    }
    public static void main(String [] args){
        Treenode root = new Treenode(10);
        root.left = new Treenode(5);
        root.right = new Treenode(-3);
        root.left.left = new Treenode(3);
        root.left.right = new Treenode(2);
        root.right.right = new Treenode(11);
        Leetcode139 solution = new Leetcode139();
        int result = solution.pathsum(root, 8);
        System.out.println(result);
    }
    
}
