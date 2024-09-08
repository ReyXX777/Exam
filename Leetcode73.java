class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode (int val) {this.val = val;}
    Treenode(int val,Treenode left,Treenode right) {
this.val = val;
this.left = left;
this.right =right;
    }
}
public class Leetcode73 {
    int maxsum = Integer.MIN_VALUE;
    public int sum(Treenode root){
        if(root==null) return 0;
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        int maxinleftright = Math.max(leftsum,rightsum);
        int maxinall = Math.max(root.val,maxinleftright+root.val);
        int max = Math.max(maxinall,leftsum +rightsum+root.val);
        maxsum = Math.max(maxsum,max);
        return maxinall;
    }
    public int maxpathsum(Treenode root){
        sum(root);
        return maxsum;
    }
    public static void main(String [] args){
        Treenode root = new Treenode(-10);
        root.left = new Treenode(9);
        root.right = new Treenode(20);
        root.right.left = new Treenode(15);
        root.right.right = new Treenode(7);
        Leetcode73 solution = new Leetcode73();
        System.out.println(solution.maxpathsum(root));
    }

}
