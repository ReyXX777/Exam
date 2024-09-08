import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode(){}
    Treenode(int val){this.val = val;}
    Treenode(int val,Treenode left,Treenode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class Leetcode79 {
    public List<List<Integer>> zigzag(Treenode root){
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        if(root== null) return outer;
        Queue<Treenode> q = new LinkedList<>();
        q.add((root));
        boolean flag = false;
        while(!q.isEmpty()){
            List<Integer> inner = new ArrayList<Integer>();
            int size = q.size();
            while(size-->0){
                Treenode node = q.poll();
                inner.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(!flag){
                outer.add(inner);
                flag = true;

            }else{
                Collections.reverse(inner);
                outer.add(inner);
                flag = false;
            }

        }
        return outer;
    }
    public static void main(String [] args){
        Treenode root = new Treenode();
        root.left = new Treenode();
        root.right = new Treenode();
        root.right.left = new Treenode();
        root.right.right = new Treenode();
        Leetcode79 solution = new Leetcode79();
        List<List<Integer>> result = solution.zigzag(root);
        for(List<Integer>level:result){
            System.out.print(level);
        }
    }
    
}
