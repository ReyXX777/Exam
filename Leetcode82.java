import java.util.Stack;
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode (){}
    Treenode(int val){this.val=val;}
    Treenode(int val,Treenode left,Treenode right){
        this.val=val;
        this.right=right;
        this.left=left;
    }
}
public class Leetcode82 {
    public boolean isvalidbst(Treenode root){
        if(root==null) return true;
        Treenode curr = root;
        Treenode prev = null;
        Stack<Treenode> stack = new Stack<>();
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr=stack.pop();
            if(prev!=null&&curr.val<=prev.val) return false;
            prev = curr;
            curr = curr.right;
        }
        return true;
    }
    public static void main(String [] args){
        Treenode root = new Treenode(2);
        root.left = new Treenode(1);
        root.right = new Treenode(3);
        Leetcode82 solution = new Leetcode82();
        boolean result = solution.isvalidbst(root);
        System.out.println("the result of the bst" +result);
    }
    
}
