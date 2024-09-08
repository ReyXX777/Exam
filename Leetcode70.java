class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode (){}
Treenode(int val) {this.val = val;}
Treenode(int val,Treenode left,Treenode right) {
    this.val = val;
    this.right = right;
    this.left = left;
}
}
public class Leetcode70 {
    public void flatten(Treenode root){
        flattentree(root);
    }
    private Treenode flattentree(Treenode node){
        if(node==null){
            return null;
        }
        if(node.left==null &&node.right==null){
            return node;
        }
Treenode lefttail = flattentree(node.left);
Treenode righttail = flattentree(node.right);
if(lefttail!=null){
    lefttail.right = node.right;
    node.right = node.left;
    node.left = null;
}
return righttail!=null?righttail:lefttail;

    }
    public static void main(String [] args){
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(5);
        root.left.left = new Treenode(3);
        root.left.right = new Treenode(4);
        root.right.right = new Treenode(6);
        Leetcode70 solution = new Leetcode70();
        solution.flatten(root);
        System.out.println("flattened tree");
        Treenode current = root;
        while(current!=null){
            System.out.print(current.val + " ");
            current = current.right;
        }
    }

    
}
