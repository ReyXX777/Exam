class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode (){}
    Treenode(int val){this.val= val;}
    Treenode(int val,Treenode left,Treenode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class Leetcode72 {
    public int sum(Treenode root){
        return dfs(root,0);
    }
    private int dfs(Treenode root,int s){
        if (root==null){
            return 0;
        }
        s= s*10+root.val;
        if(root.left==null&&root.right==null){
            return s;
        }
        return dfs(root.left,s) + dfs(root.right,s);
    }
    public static void main(String [] args){
        Treenode root = new Treenode(4);
        root.left = new Treenode(9) ;
        root.right = new Treenode(0);
        root.left.left = new Treenode(5);
        root.left.right = new Treenode(1);
        Leetcode72 solution = new Leetcode72();
        System.out.println(solution.sum(root));
    }
}
