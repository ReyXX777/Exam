class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode(int x) {val = x;}
}
public class Leetcode71 {
    public boolean hassum(Treenode root,int sum){
        return hassum(root,sum,0);
    }
    private boolean hassum(Treenode root,int sum,int temp){
        if(root==null){
            return false;
        }
        temp += root.val;
        if(temp==sum&&root.left==null&&root.right==null){
            return true;
        }
        return hassum(root.left,sum,temp) || hassum(root.right,sum,temp);
    }
    public static void main(String [] args){
        Treenode root = new Treenode(5);
        root.left = new Treenode(4);
        root.right = new Treenode(11);
        root.left.left = new Treenode(7);
        root.left.left.left = new Treenode(2);
        root.left.left.right = new Treenode(13) ;
        root.right.left = new Treenode(14);
        root.right.right =  new Treenode(1);
        root.right.right.right = new Treenode(8);
        Leetcode71 solution = new Leetcode71();
        int sum = 22;
        System.out.println(solution.hassum(root,sum));


    }
    
}
