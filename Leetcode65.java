import java.util.Queue;
import java.util.LinkedList;

 class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode (int val) {this.val=val;}
    Treenode (int val,Treenode left,Treenode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
 class Leetcode65 {
    public Treenode invert(Treenode root){
        if(root==null) {
            return null;
        }
        Treenode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;

    }
    public static void main(String [] args){
        Treenode root = new Treenode(4);
        root.left = new Treenode(2,new Treenode(1),new Treenode(3));
        root.right = new Treenode(7,new Treenode(6),new Treenode(9));
        Leetcode65 solution = new Leetcode65();
        Treenode inverted = solution.invert(root);
        printLevelOrder(inverted);
    }
    public static void printLevelOrder(Treenode root){
        if(root == null) return ;
        Queue<Treenode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Treenode current = queue.poll();
            System.out.print(current.val + " ");
            if(current.left!=null ) queue.add(current.left);
            if(current.right!=null) queue.add(current.right);
        }

    }

    
}
