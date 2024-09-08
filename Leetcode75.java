import javax.swing.tree.TreeNode;

class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode (){}
    Treenode(int val){this.val=val;}
    Treenode(int val,Treenode left,Treenode right) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class Leetcode75 {
    public int countnode(Treenode root){
        if(root==null){
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if(left==right){
            return(1<<left) +countnode(root.right);
        }
        return(1<<right) + countnode(root.left);
    }
    private int depth(Treenode root) {
        int d=0;
        for(;root!=null;root=root.left){
            ++d;
        }
        return d;
    }
    public static void main(String [] args){
         Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);
        root.left.right = new Treenode(5);
        root.right.left = new Treenode(6);
        Leetcode75 solution = new Leetcode75();
        System.out.println(solution.countnode(root));
    }
    
}
