import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.List;
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
public class Leetcode78 {
    public List<List<Integer>> levelorder(Treenode root){
        ArrayDeque<Treenode> q = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        while(q.size()>0){
            List<Integer> subans = new ArrayList<>();
            int size = q.size();
            while(size-->0){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                subans.add(q.remove().val);
            }
            ans.add(subans);

        }
        return ans;
        

    }
    public static void main(String [] args){
        Treenode root = new Treenode(3);
        root.left = new Treenode(9);
        root.right = new Treenode(20);
        root.right.left = new Treenode(15);
        root.right.right = new Treenode(7);
        Leetcode78 solution = new Leetcode78()  ;
        List<List<Integer>> answer = solution.levelorder(root);
        for(List<Integer>level:answer){
            System.out.print(level);
        }
    }
}
