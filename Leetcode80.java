class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode(int val){this.val=val;}
    Treenode(int val,Treenode left,Treenode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class Leetcode80 {
     private int ans;
     private int prev;
     private int inf = Integer.MAX_VALUE;
     public int mindifference(Treenode root){
        ans = inf;
        prev = inf;
        dfs(root);
        return ans;
     }
     private void dfs(Treenode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        ans = Math.min(ans,Math.abs(root.val-prev));
        prev = root.val;
        dfs(root.right);
     }
     public static void main(String [] args){
        Treenode root = new Treenode(4);
        root.left = new Treenode(2);
        root.right = new Treenode(6);
        root.right.left = new Treenode(1);
        root.right.right = new Treenode(3);
        Leetcode80 solution = new Leetcode80();
        System.out.println(solution.mindifference(root));
     }


    
}
