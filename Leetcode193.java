public class Leetcode193 {
    public int good(Treenode root){
        return good(root, Integer.MIN_VALUE);

    }
    private int good(Treenode root,int max){
        if(root==null)
        return 0;
        int newmax = Math.max(max, root.val);
        return(root.val>=max?1:0) + good(root.left,newmax) + good(root.right,newmax);

    }
    public static void main(String [] args){
        Treenode root = new Treenode(3);
        root.left = new Treenode(1);
    root.right = new Treenode(4);
    root.left.left = new Treenode(3);
    root.right.left = new Treenode(1);
    root.right.right = new Treenode(5);
    Leetcode193 solution = new Leetcode193();
    int result = solution.good(root);
    System.out.println(result);
    }
}
class Treenode{
    int val;
    Treenode left;Treenode right;
    Treenode(int x){val = x;}
}
    

