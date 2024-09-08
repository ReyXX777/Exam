public class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode (){}
    Treenode(int val) {this.val=val;}
    Treenode(int val,Treenode left,Treenode right) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class Leetcode64 {
    public boolean issametree(Treenode p,Treenode q){
        if(p==null||q==null) return p == q;
        if(p.val!=q.val) return false;
        return issametree(p.left, q.left) && issametree(p.right,q.right);


    }
    public static void main(String [] args){
        Treenode tree1 = new Treenode(1);
        tree1.left = new Treenode(2);
        tree1.right = new Treenode(3);
        Treenode tree2 = new Treenode(1);
        tree2.left = new Treenode(2);
        tree2.right = new Treenode(3);
        Leetcode64 solution = new Leetcode64();
        boolean result = solution.issametree(tree1, tree2);
        System.out.println("the tree is same" +result);
    }
    
}
