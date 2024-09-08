import java.util.Stack;
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode(int val) {this.val=val;}
    Treenode(int val,Treenode left,Treenode right) {
        this.val = val;
        this.right =right;
        this.left = left;
    }
}
 class Leetcode74 {
    Stack<Treenode> stack ;
    public Leetcode74(Treenode root){
        stack = new Stack<>();
        getleftmostleft(root,stack);
    }
    public boolean hasnext(){
        return !stack.isEmpty();
    }
    public int next(){
        Treenode node = stack.pop();
        if(node.right!=null) getleftmostleft(node.right,stack);
        return node.val;
    }
    private Treenode getleftmostleft(Treenode node,Stack<Treenode>stack){
        if(node==null) return null;
        stack.push(node);
        while(node.left!=null){
            node = node.left ;
            stack.push(node);
        }
        return node;
    }
    public static void main(String [] args){
        Treenode root = new Treenode();
        root.left = new Treenode();
        root.right = new Treenode();
        root.right.left = new Treenode();
        root.right.right = new Treenode();
        Leetcode74 solution = new Leetcode74(root);
        while(solution.hasnext()){
            System.out.println(solution.next());
        }

    }


    
}
