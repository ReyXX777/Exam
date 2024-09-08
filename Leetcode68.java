import java.util.Queue;
import java.util.LinkedList;

class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode (int val) {this.val = val;}
    Treenode (int val,Treenode left,Treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Leetcode68 {
    public Treenode buildtree(int [] inorder,int [] postorder){
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
        public Treenode helper(int [] inorder,int si,int ei,int [] postorder,int ps,int pe){
if(si>ei)
    return null;
    Treenode root = new Treenode(postorder[pe]);
    int idx = si;
    while(idx<inorder.length && inorder[idx] != postorder[pe]) idx++;
    int count = idx-si;
    root.left = helper(inorder,si,idx-1,postorder,ps,ps+count-1);
    root.right = helper(inorder,idx+1,ei,postorder,ps+count,pe-1);
    return root;
}
public static void main(String [] args){
    int [] inorder = {9,3,15,20,7};
    int [] postorder = {9,15,7,20,3};
    Leetcode68 solution = new Leetcode68();
    Treenode root = solution.buildtree(inorder, postorder);
    printlevelorder(root);
}
public static void printlevelorder(Treenode root){
    if(root==null) return;
    Queue<Treenode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        Treenode current = queue.poll();
        System.out.print(current.val + " ");
        if(current.left!=null) queue.add(current.left);
        if(current.right!=null) queue.add(current.right);
    }
    }
}
        
    
