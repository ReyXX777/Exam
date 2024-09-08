public class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode (int val) {this.val = val;}
    Treenode (int val, Treenode left,Treenode right){
        this.val = val;
        this.right = right;
        this.left = left;}
    }
 class Leetcode63 {
    public int maxdepth(Treenode root){
        if(root==null) return 0;
        int leftdepth = maxdepth(root.left);
        int rightdepth = maxdepth(root.right);
        return Math.max(leftdepth,rightdepth) +1;
    }
    public static void main(String [] args){
        Treenode root = new Treenode(3);
        root.left = new Treenode(9);
        root.right = new Treenode(20,new Treenode(15),new Treenode(7));
        Leetcode63 solution = new Leetcode63();
        int depth = solution.maxdepth(root);
        System.out.println("maximum depth" + depth);
    }

}
