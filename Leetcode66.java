 class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode(int val) {this.val = val;}
    Treenode(int val,Treenode left,Treenode right) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
 class Leetcode66 {
    public boolean issymmentricRec(Treenode left,Treenode right){
        if(left==null ||right == null) {
            return left == right;
        }
        if(left.val!=right.val) return false;
        return issymmentricRec(left.left,right.right ) && issymmentricRec(left.right,right.left);

    }
    public boolean issymetric(Treenode root){
        return root == null || issymmentricRec(root.left,root.right);
    }
    public static void main(String [] args){
        Treenode root = new Treenode(1);
        root.left = new Treenode(2,new Treenode(3) , new Treenode(4));
        root.right = new Treenode(2,new Treenode(4),new Treenode(3));
        Leetcode66 solution = new Leetcode66();
        boolean result = solution.issymetric(root);
        System.out.println("the result is"+result);
    }
}
