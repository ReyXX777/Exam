class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode(int x) {val=x;}
}
public class Leetcode140 {
    public int diameter(Treenode root){
        maxdepth( root);
        return ans;
    }
    private int ans=0;
    int maxdepth(Treenode root){
        if(root==null)
        return 0;
        int l=maxdepth(root.left);
        int r = maxdepth(root.right);
        ans = Math.max(ans, l+r);
        return 1 + Math.max(l,r);
    }
    public static void main(String [] args){
        Treenode root = new Treenode(0);
        root.left = new Treenode(0);
        root.right = new Treenode(0);
        root.left.left = new Treenode(0);
        root.left.right = new Treenode(0);
        Leetcode140 solution = new Leetcode140();
        int diameter = solution.maxdepth(root);
        System.out.println(diameter);
    }
    
}
