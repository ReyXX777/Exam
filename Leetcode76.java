import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode (){}
    Treenode (int val){this.val=val;}
    Treenode(int val,Treenode left,Treenode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Leetcode76 {
    public List<Integer> rightside(Treenode root){
        if(root==null) return new ArrayList<>();
        Queue<Treenode> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ans.add(q.poll().val);
            while(size-->0){
                Treenode parnode = q.poll();
                if (size == 0) ans.add(parnode.val);
                if(parnode.right!=null)q.add(parnode.right);
                if(parnode.left!=null)q.add(parnode.left);
            }
    }
    return ans;
   
    }
    public static void main(String [] args){
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.right = new Treenode(5);
        root.right.right = new Treenode(4);
        Leetcode76 solution = new Leetcode76();
        System.out.println(solution.rightside(root));

    }
    
}
